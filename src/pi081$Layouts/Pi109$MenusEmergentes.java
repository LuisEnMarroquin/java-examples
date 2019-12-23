package pi081$Layouts;

import java.awt.BorderLayout;

import javax.swing.*;

public class Pi109$MenusEmergentes {

	public static void main(String[] args) {
		
		MarcoEmergente marco = new MarcoEmergente();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEmergente extends JFrame {
	
	public MarcoEmergente() {
		
		setBounds(100, 100, 300, 250);
		
		LaminaEmergente lamina = new LaminaEmergente();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaEmergente extends JPanel {
	
	public LaminaEmergente() {
		
		setLayout(new BorderLayout()); // Setting layout for Panel 'LaminaEmergente'
		
		JPanel laminaMenu = new JPanel(); // Creating new 'Panel'
		
		JMenuBar barra = new JMenuBar(); // Creating new 'MenuBar'
		
		JMenu fuente = new JMenu("Fuente"); // Creating 'Elements of the MenuBar'
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		
		barra.add(fuente); // Adding the elements of the menu bar to the 'MenuBar'
		barra.add(estilo);
		barra.add(tamano);
		
		laminaMenu.add(barra); // Adding 'MenuBar' to the Panel 'laminaMenu'
		
		add(laminaMenu, BorderLayout.NORTH); // Adding the Panel 'laminaMenu' to the NORTH of the Panel 'LaminaEmergente' 
		
		JTextPane area = new JTextPane(); // Creating new 'Text Area'
		
		add(area, BorderLayout.CENTER); // Adding the JTextPane 'area' to the CENTER of the Panel 'LaminaEmergente' 
		
		// ---------------------------------------------------- Code for 'PopupMenu'
		
		JPopupMenu emergente = new JPopupMenu(); // Creating a 'PopupMenu'
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1"); // Creating a 'Menu Item'
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		
		emergente.add(opcion1); // Adding 'MenuItem' to the 'PopupMenu'
		emergente.add(opcion2);
		emergente.add(opcion3);
		
		area.setComponentPopupMenu(emergente); // Setting Popup on right click to the JTextPane 'area' 
		
		// ----------------------------------------------------
		
		/* // This code is to display a menu when you 'Right Click' the Panel 'LaminaEmergente'
		
		JPopupMenu emergente = new JPopupMenu(); // Creating a 'PopupMenu'
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1"); // Creating a 'Menu Item'
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		
		emergente.add(opcion1); // Adding 'MenuItem' to the 'PopupMenu'
		emergente.add(opcion2);
		emergente.add(opcion3);
		
		setComponentPopupMenu(emergente); // Setting Popup on right click to the Panel 'LaminaEmergente' 
		*/
		
	}
	
}