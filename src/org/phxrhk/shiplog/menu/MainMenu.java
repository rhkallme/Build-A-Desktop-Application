package org.phxrhk.shiplog.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

/**
 * Created by RHK on 1/27/2021
 */

public class MainMenu extends JMenuBar {
    static Logger logger = LogManager.getLogger(MainMenu.class);

    private JMenu menuFile;
    private JMenuItem menuitemNew;
    private JMenuItem menuitemOpen;
    private JMenuItem menuitemSave;
    private JMenuItem menuitemSaveAs;
    private JMenuItem menuitemExit;

    private JMenu menuEdit;

    private JMenu menuView;

    private JMenu menuHelp;

    private JMenuItem menuItemEditFleetName;

    private JMenuItem menuItemGroupByClass;
    private JMenuItem menuItemGroupByType;

    private JMenuItem menuitemAbout;

    public MainMenu(MainMenuActionListener main_menu_action_listener) {

        menuFile = new JMenu("File");
        menuFile.setMnemonic('F');
        this.add(menuFile);

        menuitemNew = new JMenuItem("New");
        menuitemNew.setMnemonic('N');
        menuitemNew.addActionListener(main_menu_action_listener);
        menuFile.add(menuitemNew);

        menuitemOpen = new JMenuItem("Open");
        menuitemOpen.setMnemonic('O');
        menuFile.add(menuitemOpen);
        menuitemOpen.addActionListener(main_menu_action_listener);
        menuFile.addSeparator();

        menuitemSave = new JMenuItem("Save");
        menuitemSave.setMnemonic('S');
        menuitemSave.addActionListener(main_menu_action_listener);
        menuFile.add(menuitemSave);

        menuitemSaveAs = new JMenuItem("Save As");
        menuitemSaveAs.setMnemonic('A');
        menuFile.add(menuitemSaveAs);
        menuitemSaveAs.addActionListener(main_menu_action_listener);
        menuFile.addSeparator();

        menuitemExit = new JMenuItem("Exit");
        menuitemExit.setMnemonic('x');
        menuitemExit.addActionListener(main_menu_action_listener);
        menuFile.add(menuitemExit);

        menuEdit = new JMenu("Edit");
        menuFile.setMnemonic('E');
        this.add(menuEdit);

        menuItemEditFleetName = new JMenuItem("Fleet");
        menuItemEditFleetName.addActionListener(main_menu_action_listener);
        menuItemEditFleetName.setMnemonic('F');
        this.add(menuItemEditFleetName);

        menuView= new JMenu("View");
        menuFile.setMnemonic('V');
        this.add(menuView);

        menuItemGroupByClass = new JMenuItem("Group by Class");
        menuItemGroupByClass.addActionListener(main_menu_action_listener);
        menuItemGroupByClass.setMnemonic('l');
        menuFile.add(menuItemGroupByClass);

        menuItemGroupByType = new JMenuItem("Group by Type");
        menuItemGroupByType.addActionListener(main_menu_action_listener);
        menuItemGroupByClass.setMnemonic('y');
        menuFile.add(menuItemGroupByType);


        menuHelp = new JMenu("Help");
        menuFile.setMnemonic('H');
        this.add(menuHelp);

        menuitemAbout = new JMenuItem("About");
        menuitemAbout.setMnemonic('b');
        menuitemAbout.addActionListener(main_menu_action_listener);
        menuFile.add(menuitemAbout);

    }
}