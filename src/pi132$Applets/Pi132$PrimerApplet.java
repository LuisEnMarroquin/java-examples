package pi132$Applets; // Applets are shown on Web Browser

import javax.swing.JApplet; // Las Applets no llevan método main
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pi132$PrimerApplet extends JApplet{

	@Override // It belongs to class 'Applet'
	public void init() { // This is used instead of the main method
		
		JLabel rotulo = new JLabel("Hola", SwingConstants.CENTER);
		add(rotulo); // Added 'rotulo' to the applet
		
	}
	
}
