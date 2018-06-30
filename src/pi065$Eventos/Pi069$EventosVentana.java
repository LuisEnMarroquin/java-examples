package pi065$Eventos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi069$EventosVentana {

	public static void main(String[] args) {
		
		MarcoVentana2 mimarco = new MarcoVentana2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termina la ejecución del programa
		mimarco.setTitle("Ventana principal");
		mimarco.setBounds(300,300,500,350);
		
		MarcoVentana2 mimarco2 = new MarcoVentana2();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Solo cierra esta ventana
		mimarco2.setTitle("Otra Ventana");
		mimarco2.setBounds(900,300,500,350);

	}

}

class MarcoVentana2 extends JFrame {
	
	public MarcoVentana2() {
		
		setVisible(true);
		
		//Poniendo el 'MarcoVentana2' a la escucha de 'M_Ventana2()'
		/*M_Ventana2 oyente_ventana = new M_Ventana2();
		addWindowListener(oyente_ventana);*/
		
		//Lo de arriba de una forma más simple
		addWindowListener(new M_Ventana2()); //En vez de crear un objeto perteneciente a esa instancia se instancia directamente aquí
		
	}
	
} //'WindowAdapter' es llamada clase adaptadora igual que 'KeyAdapter' y 'MouseAdapter'

class M_Ventana2 extends WindowAdapter{ //Extendiendo de 'WindowAdapter' que ya implementa los métodos de 'WindowListener' para no tener que implementar manualmente cada uno y solo poner los que se ocupan
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}
	
}