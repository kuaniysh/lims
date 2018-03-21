package ui.view;

import ui.model.ReportsTableModel;
import javax.swing.*;


/**
 * Created by kuanysh on 20.03.18.
 */
public class ListView {
    private JScrollPane listView;
    private JPanel listPanel;
    private JTable jTable;

    public ListView(ReportsTableModel tableModel) {
        listPanel = new JPanel();
        jTable = new JTable(tableModel);
        listPanel.add(jTable);
        listView = new JScrollPane(jTable);
    }

    public JScrollPane getListView() {
        return listView;
    }

    public JTable getJTable() {
        return jTable;
    }


}
