package pi132$Applets;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;

public class Pi138$Applet_Multimedia extends JApplet{
	
	public void init() {
		
		logo = getImage(getDocumentBase(), "itunes.png"); // 'getDocumentBase()' returns the directory where the app is executed
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(logo, 50, 50, this);
	}

	Image logo;
	
}
