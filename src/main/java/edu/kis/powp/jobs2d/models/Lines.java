package edu.kis.powp.jobs2d.models;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class Lines {
    protected enum LineTypes {
        BASIC,
        DOTTED,
        SPECIAL
    }

    private LineTypes getLineTypeByName(String lineName) {
        switch (lineName) {
            case "Solid line":
                return LineTypes.BASIC;
            case "Dotted line":
                return LineTypes.DOTTED;
            case "Special line":
                return LineTypes.SPECIAL;
            default:
                return LineTypes.BASIC;
        }
    }

    public static ILine getSelectedLine(String lineType) {
        Lines lines = new Lines();
        switch (lines.getLineTypeByName(lineType)) {
            case DOTTED:
                return LineFactory.getDottedLine();
            case SPECIAL:
                return LineFactory.getSpecialLine();
            case BASIC:
            default:
                return LineFactory.getBasicLine();
        }
    }
}
