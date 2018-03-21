package ui.view;

import ui.model.Report;
import ui.model.ReportsTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by kuanysh on 19.03.18.
 */
public class TableMainPanel extends JPanel{

    private JTabbedPane tabbedPane;
    private ReportsTableModel tableModel;
    private final ListView listView;
    private final TreeView tree;

    public TableMainPanel() {
        Report row1 = new Report("ANALYSES REPORT", "Single Sample Point Report");
        Report row2 = new Report("DAILY REPORT", "Daily Report");
        Report row3 = new Report("ETS", "New Report for ETS Department");
        Report row4 = new Report("DAILY REPORT", "Daily Report");
        Report row5 = new Report("DAILY REPORT", "Daily Report");
        Report row6 = new Report("DAILY REPORT", "Daily Report");
        Report row7 = new Report("DAILY REPORT", "Daily Report");
        Report row8 = new Report("DAILY REPORT", "Daily Report");
        Report row9 = new Report("DAILY REPORT", "Daily Report");
        Report row10 = new Report("DAILY REPORT", "Daily Report");
        Report row11 = new Report("DAILY REPORT", "Daily Report");
        Report row12 = new Report("DAILY REPORT", "Daily Report");
        Report row13 = new Report("DAILY REPORT", "Daily Report");
        Report row14 = new Report("DAILY REPORT", "Daily Report");
        Report row15 = new Report("DAILY REPORT", "Daily Report");
        Report row16 = new Report("DAILY REPORT", "Daily Report");
        Report row17 = new Report("DAILY REPORT", "Daily Report");
        Report row18 = new Report("DAILY REPORT", "Daily Report");
        Report row19 = new Report("DAILY REPORT", "Daily Report");
        Report row20 = new Report("DAILY REPORT", "Daily Report");
        Report row21 = new Report("DAILY REPORT", "Daily Report");
        Report row22 = new Report("DAILY REPORT", "Daily Report");
        Report row23 = new Report("DAILY REPORT", "Daily Report");
        Report row24 = new Report("DAILY REPORT", "Daily Report");
        Report row25 = new Report("DAILY REPORT", "Daily Report");
        Report row26 = new Report("DAILY REPORT", "Daily Report");

        List<Report> ReportList = new ArrayList<Report>();
        ReportList.add(row1);
        ReportList.add(row2);
        ReportList.add(row3);
        ReportList.add(row4);
        ReportList.add(row5);
        ReportList.add(row6);
        ReportList.add(row7);
        ReportList.add(row8);
        ReportList.add(row9);
        ReportList.add(row10);
        ReportList.add(row11);
        ReportList.add(row12);
        ReportList.add(row13);
        ReportList.add(row14);
        ReportList.add(row15);
        ReportList.add(row16);
        ReportList.add(row17);
        ReportList.add(row18);
        ReportList.add(row19);
        ReportList.add(row20);
        ReportList.add(row21);
        ReportList.add(row22);
        ReportList.add(row23);
        ReportList.add(row24);
        ReportList.add(row25);
        ReportList.add(row26);

        tableModel = new ReportsTableModel(ReportList);

        listView = new ListView(tableModel);

        tree = new TreeView(ReportList);

        tabbedPane = new JTabbedPane();

        tabbedPane.add("<html><b>List View", listView.getListView());
        tabbedPane.add("Tree View", tree.getTree());




    }

    public ListView getListView() {
        return listView;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }
}
