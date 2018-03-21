package ui;

import ui.controller.MainFrameController;
import ui.view.TableMainPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kuanysh on 19.03.18.
 */
public class MainFrame extends JFrame{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private JMenuBar menuBar;
    private JMenu newMenu;
    private JMenuItem txtFileItem;
    private JMenuItem exitItem;
    private TableMainPanel tableMainPanel;

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout());

        menuBar = new JMenuBar();

        newMenu = new  JMenu("New");
        txtFileItem = new JMenuItem("Text file");
        newMenu.add(txtFileItem);
        menuBar.add(newMenu);
        newMenu.addSeparator();

        exitItem = new JMenuItem("Exit");
        newMenu.add(exitItem);
        setJMenuBar(menuBar);

        tableMainPanel = new TableMainPanel();
        container.add(tableMainPanel.getTabbedPane());

        setVisible(true);
    }

    public JMenuItem getExitItem() {
        return exitItem;
    }

    public TableMainPanel getTableMainPanel() {
        return tableMainPanel;
    }
}
