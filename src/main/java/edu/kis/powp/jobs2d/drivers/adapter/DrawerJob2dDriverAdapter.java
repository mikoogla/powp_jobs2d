package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DrawerJob2dDriverAdapter implements Job2dDriver {
    protected int startX = 0, startY = 0;
    protected final DrawPanelController drawPanelController;

    public DrawerJob2dDriverAdapter(DrawPanelController controller) {
        if (controller == null) {
            throw new IllegalArgumentException("Null controller");
        }
        this.drawPanelController = controller;
    }

    @Override
    public void setPosition(int x, int y) {
        startX = x;
        startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(startX, startY);
        line.setEndCoordinates(x, y);
        setPosition(x, y);
        drawPanelController.drawLine(line);
    }

    @Override
    public String toString() {
        return "Solid line simulator";
    }
}
