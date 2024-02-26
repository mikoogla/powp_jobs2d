package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class CircleFactory {

    public static DriverCommand createCircle() {
        ComplexCommand complexCommand = new ComplexCommand();
        final int radius = 100;
        final int segments = 72;

        for (int i = 0; i <= segments; i++) {
            if(i == 0) {
                complexCommand.addCommand(new SetPositionCommand((int) (radius * Math.cos(0)), (int) (radius * Math.sin(0))));
            }
            double angle = (Math.PI * 2 * i) / segments;
            int x = (int) (radius * Math.cos(angle));
            int y = (int) (radius * Math.sin(angle));
            complexCommand.addCommand(new OperateToCommand(x, y));
        }

        return complexCommand;
    }
}
