package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.panel.DrawPanelController;

public class LineDrawerAdapter extends DrawerJob2dDriverAdapter {

    public LineDrawerAdapter(DrawPanelController controller) {
        super(controller);
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getSpecialLine();
        line.setStartCoordinates(startX, startY);
        line.setEndCoordinates(x, y);
        drawPanelController.drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Dashed line simulator";
    }
}
