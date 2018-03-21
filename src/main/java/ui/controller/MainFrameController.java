package ui.controller;

import ui.MainFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kuanysh on 19.03.18.
 */
public class MainFrameController {

    private MainFrame mainFrame;

    public MainFrameController() {
        initComponent();
        initListeners();
    }

    private void initComponent() {
        mainFrame = new MainFrame();
    }

    private void initListeners() {
        mainFrame.getExitItem().addActionListener(new ExitActionListener());
        mainFrame.getTableMainPanel().getListView().getJTable().getSelectionModel().addListSelectionListener(new SelectItemListener());
    }


    private class ExitActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class SelectItemListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            //System.out.println(e);
            int selectedRow = mainFrame.getTableMainPanel().getListView().getJTable().getSelectedRow();
            int column = 0;

            System.out.println(mainFrame.getTableMainPanel().getListView().getJTable().getValueAt(selectedRow, column));
        }
    }
}
