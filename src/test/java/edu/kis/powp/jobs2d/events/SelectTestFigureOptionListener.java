package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.CircleFactory;
import edu.kis.powp.jobs2d.factory.RectangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.models.Figures;

public class SelectTestFigureOptionListener implements ActionListener {
	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commandType = e.getActionCommand();
		DriverCommand command = null;

		Figures figureType = Figures.valueOf(commandType);

		switch (figureType) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				command = RectangleFactory.createRectangle();
				break;
			case CIRCLE:
				command = CircleFactory.createCircle();
				break;

			default:
				break;
		}

		if (command != null) {
			command.execute(driverManager.getCurrentDriver());
		}
	}
}
