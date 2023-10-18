/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.autobattler;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Draw 
{
    
    public Draw(int w, int h, String title, AutoBattler game)
    {
        game.setPreferredSize(new Dimension(w, h));
        game.setMaximumSize(new Dimension(w, h));
        game.setMinimumSize(new Dimension(w, h));
        
        JFrame frame = new JFrame(title);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
        

    //Create the menu bar.
    menuBar = new JMenuBar();

    //Build the first menu.
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    menu.getAccessibleContext().setAccessibleDescription(
            "File menu");
    menuBar.add(menu);

    //JMenuItems show the menu items
    menuItem = new JMenuItem("New",
                             new ImageIcon("images/new.gif"));
    menuItem.setMnemonic(KeyEvent.VK_N);
    menu.add(menuItem);

    // add a separator
    menu.addSeparator();

    menuItem = new JMenuItem("Pause", new ImageIcon("images/pause.gif"));
    menuItem.setMnemonic(KeyEvent.VK_P);
    menu.add(menuItem);

    menuItem = new JMenuItem("Exit", new ImageIcon("images/exit.gif"));
    menuItem.setMnemonic(KeyEvent.VK_E);
    menu.add(menuItem);

    // add menu bar to frame
    frame.setJMenuBar(theJMenuBar);

        
}
