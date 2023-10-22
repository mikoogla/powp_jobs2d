package edu.kis.powp.jobs2d.models;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class Lines {
    public enum LineTypes {
        BASIC,
        DOTTED,
        SPECIAL
    }

    public static LineTypes getLineTypeByName(String lineName) {
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
        switch (getLineTypeByName(lineType)) {
            case DOTTED:
                return LineFactory.getDottedLine();
            case SPECIAL:
                return LineFactory.getSpecialLine();
            case BASIC:
            default:
                return LineFactory.getBasicLine();
        }
    }

    public static void setLine(String lineName) {
        switch (getLineTypeByName(lineName)) {
            case DOTTED:
                DrawerFeature.setLineType("Dotted line");
                break;
            case SPECIAL:
                DrawerFeature.setLineType("Special line");
                break;
            case BASIC:
            default:
                DrawerFeature.setLineType("Solid line");
                break;
        }
    }
}
