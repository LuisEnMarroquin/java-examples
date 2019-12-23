package pi065$Eventos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi068$EventosVentana {

	public static void main(String[] args) {
		
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termina la ejecución del programa
		mimarco.setTitle("Ventana principal");
		mimarco.setBounds(300,300,500,350);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Solo cierra esta ventana
		mimarco2.setTitle("Otra Ventana");
		mimarco2.setBounds(900,300,500,350);

	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana() {
		
		setVisible(true);
		
		//Poniendo el 'MarcoVentana' a la escucha de 'M_Ventana()'
		M_Ventana oyente_ventana = new M_Ventana();
		addWindowListener(oyente_ventana);
		
	}
	
}

class M_Ventana implements WindowListener{ //Tiene que implementar la interfaz y los métodos de esa interfaz a fuerzas
	
	public void windowActivated(WindowEvent e) {
		System.out.println("Esta ventana SI es la ventana principal");
	}
	
	public void windowClosed(WindowEvent e) { //Este método solo se ejecuta después que la ventana está cerrada, por eso se hizo una segunda ventana.
		System.out.println("La ventana 2 ha sido cerrada"); //Con una sola ventana al cerrarla el programa no daba tiempo de ejecutar esta acción.
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana Cerrada");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Esta ventana NO es la ventana principal");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana Desminimizada");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana Abierta");
	}
	
}