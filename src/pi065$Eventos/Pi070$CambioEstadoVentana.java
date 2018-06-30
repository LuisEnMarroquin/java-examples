package pi065$Eventos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class Pi070$CambioEstadoVentana {

	public static void main(String[] args) {
		
		MarcoEstado mimarco = new MarcoEstado();

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		
		setBounds(300,300,500,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CambiaEstado nuevoEstado = new CambiaEstado(); //Poniendo la ventana a la escucha del método
		addWindowStateListener(nuevoEstado);
		
	}
	
}

class CambiaEstado implements WindowStateListener{
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado"); // (maximizada o minimizada)
	
		//System.out.println(e.getNewState()); //'getNewState' pertenece a la clase 'WindowEvent' y devuelve un 'int' dependiendo del estado de la ventana.
	
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) { // '6' = VentanaCompleta
			System.out.println("La ventana está a pantalla completa");
		}else if(e.getNewState() == Frame.NORMAL) { // '0' NoVentanaCompleta
			System.out.println("La ventana no está a pantalla completa");
		}else if(e.getNewState() == Frame.ICONIFIED) { // '1' VentanaMinimizada
			System.out.println("La ventana se ha minimizado");
		}
		
	}
	
}