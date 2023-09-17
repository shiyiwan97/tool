package com.shiyiwan.shiyiwan_tool.component.popMenu;

import com.shiyiwan.shiyiwan_tool.component.cmdPanel.CMDPanel1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 主界面右键菜单
 */
public class WorkSpacePopupMenu extends PopupMenu {

    public WorkSpacePopupMenu(JPanel targetPanel) throws HeadlessException {
        MenuItem cmd = new MenuItem("cmd");
        this.add(cmd);
        cmd.addActionListener(e -> {
            CMDPanel1 cmdPanel1 = new CMDPanel1();
//            targetPanel.setLayout(new BorderLayout());
            Dimension size = targetPanel.getSize();
            System.out.println(size);
            cmdPanel1.setBounds(0, 0, size.width, size.height);
            targetPanel.add(cmdPanel1);
            targetPanel.repaint();
            System.out.println(targetPanel.getSize());
        });
    }

}
