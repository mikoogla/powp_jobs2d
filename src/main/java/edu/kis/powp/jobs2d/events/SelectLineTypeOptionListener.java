package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.features.DrawerFeature;

public class SelectLineTypeOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Solid line"))
            DrawerFeature.setLineType("Solid line");
        else if (e.getActionCommand().equals("Dotted line"))
            DrawerFeature.setLineType("Dotted line");
        else if (e.getActionCommand().equals("Special line"))
            DrawerFeature.setLineType("Special line");
    }
}
