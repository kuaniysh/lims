package ui.view;

import ui.model.Report;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.List;

/**
 * Created by kuanysh on 20.03.18.
 */
public class TreeView {

    private final DefaultMutableTreeNode root;
    private final DefaultMutableTreeNode allTco;
    private final DefaultMutableTreeNode development;
    private final DefaultMutableTreeNode shiftChemist;
    private final String dailyReport;
    private final JTree tree;
    private final String etsReport;

    public TreeView(List<Report> ReportList) {
        // Создание древовидной структуры
        root = new DefaultMutableTreeNode("LW-LIMS Browser's Reports");
        // Ветви первого уровня
        allTco = new DefaultMutableTreeNode("All TCO");
        development = new DefaultMutableTreeNode("Development");
        shiftChemist = new DefaultMutableTreeNode("Shift Chemist");

        dailyReport = ReportList.get(1).getShortsNames() + ", " + ReportList.get(1).getReportsNames();
        etsReport = ReportList.get(2).getShortsNames() + ", " + ReportList.get(2).getReportsNames();
        allTco.add(new DefaultMutableTreeNode(dailyReport, false));
        allTco.add(new DefaultMutableTreeNode(etsReport, false));

        // Добавление ветвей к корневой записи
        root.add(allTco);
        root.add(development);
        root.add(shiftChemist);

        // Создание стандартной модели и дерево
        DefaultTreeModel treeModel = new DefaultTreeModel(root, true);
        tree = new JTree(treeModel);
    }

    public JTree getTree() {
        return tree;
    }
}
