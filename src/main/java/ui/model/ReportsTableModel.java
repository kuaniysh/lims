package ui.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by kuanysh on 20.03.18.
 */
public class ReportsTableModel extends AbstractTableModel {

    private final List<Report> reportList;

    private final String[] columnNames = new String[] {
            "Short's Names", "Report's Names"
    };

    private final Class[] columnClass = new Class[] {
            String.class, String.class
    };

    public ReportsTableModel(List<Report> reportList) {
        this.reportList = reportList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    public int getRowCount() {
        return reportList.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Report row = reportList.get(rowIndex);
        if (0 == columnIndex) {
            return row.getShortsNames();
        } else if (1 == columnIndex) {
            return row.getReportsNames();
        }
        return null;
    }
}
