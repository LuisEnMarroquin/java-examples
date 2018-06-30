package pi065$Eventos;

import javax.swing.JFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Pi075$FocoVentana extends JFrame implements WindowFocusListener{ //Es la clase que genera el marco (por 'JFrame') y también es la clase oyente (por 'WindowFocusListener').

	public static void main(String[] args) {
		
		Pi075$FocoVentana miv = new Pi075$FocoVentana();
		miv.iniciar();

	}
	
	// Creando método donde se contruyen los marcos
	public void iniciar() {
		//Instanciando
		marco1 = new Pi075$FocoVentana();
		marco2 = new Pi075$FocoVentana();
		//Haciendolos visibles
		marco1.setVisible(true);
		marco2.setVisible(true);
		//Asignando dimensiones
		marco1.setBounds(300,100,600,350);
		marco2.setBounds(1200,100,600,350);
		//Operación al cerrar los marcos
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Poniendo los cuadros a la escucha del método correspondiente 
		marco1.addWindowFocusListener(this); // 'this' porque quien está a la escucha es la propia clase.
		marco2.addWindowFocusListener(this); //El argumento que hay que pasarles es la instancia de la clase oyente.
	}

	@Override
	public void windowGainedFocus(WindowEvent e) { 
		if(e.getSource() == marco1) { //Con '.getSource()' se identifica al elemento que ejecutó la acción
			marco1.setTitle("Tengo el foco!!");
		}else {
			marco2.setTitle("Tengo el foco!!");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource() == marco1) { //Con '.getSource()' se identifica al elemento que ejecutó la acción
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
	}
	
	Pi075$FocoVentana marco1;
	Pi075$FocoVentana marco2;

}
