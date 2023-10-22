package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.events.SelectLineTypeOptionListener;

public class DrawerFeature {

	private static String lineType = "Solid line";

	private static DrawPanelController drawerController;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();

		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		drawerController.initialize(application.getFreePanel());
	}

	public static void setupLineType(Application application) {
		application.addComponentMenu(DrawPanelController.class, "Line type", 1);

		application.addComponentMenu(null, "Line Type", 0);
		SelectLineTypeOptionListener selectLineTypeOptionListener = new SelectLineTypeOptionListener();
		application.addComponentMenuElement(null, "Solid line", selectLineTypeOptionListener);
		application.addComponentMenuElement(null, "Dotted line", selectLineTypeOptionListener);
		application.addComponentMenuElement(null, "Special line", selectLineTypeOptionListener);
	}

	public static void setLineType(String lineType) {
		DrawerFeature.lineType = lineType;
	}

	public static String getLineType() {
		return lineType;
	}

	/**
	 * Get controller of application drawing panel.
	 * 
	 * @return drawPanelController.
	 */
	public static DrawPanelController getDrawerController() {
		return drawerController;
	}//TODO getter
}
