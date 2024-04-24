package Utility;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseRecenter extends MouseAdapter {
	private String componentName;

	public MouseRecenter(String componentName) {
		this.componentName = componentName;

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Component source = (Component) e.getSource();
		Container ss = source.getParent();
		// System.out.println("Mouse entered " + componentName+ss.getName());
		if (componentName == "Button") {
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Component source = (Component) e.getSource();
		Container ss = source.getParent();
		// System.out.println("Mouse exited " + componentName + " X " + e.getX() + " Y "
		// + e.getY());

		/*
		 * setSize(1035, 768); Dimension frameSize = getSize();
		 */

		/*
		 * int frameWidth = frameSize.width; int frameHeight = frameSize.height;
		 * System.out.println(frameWidth + "//" + frameHeight);
		 */

		/*
		 * if (componentName == "ContentPane" && (e.getX() <= 0 || e.getX() <=
		 * frameWidth || e.getY() < 0 || e.getY() >= frameHeight)) { draw(e.getX(),
		 * e.getY()); }
		 */
	}
	
	
	public void draw(int mouseX, int mouseY) {

		try {

			Robot bot = new Robot();

			bot.mouseMove(680, 346);
			// System.out.print(" MouseX Mouse y"+mouseX +mouseY);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
