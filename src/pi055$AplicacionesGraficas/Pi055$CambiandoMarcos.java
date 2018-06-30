package pi055$AplicacionesGraficas;

import javax.swing.*;

public class Pi055$CambiandoMarcos {

	public static void main(String[] args) {
		
		//Instanciando al clase miMarco
		miMarco marco1 = new miMarco();
		
		//Haciendo la ventana visible - ESTO SE PUEDE PONER DENTRO DEL CONSTRUCTOR Y HARÍA LO MISMO
		marco1.setVisible(true); //Método de JFrame - Inicialmente las ventanas de Java son invisibles.

		//Seleccionando que hace la ventana al cerrarla - ESTO SE PUEDE PONER DENTRO DEL CONSTRUCTOR Y HARÍA LO MISMO
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Haciendo que termine la ejecución del programa al cerrar la ventana.
			 /*Este método pide un int*/	   /*constante de clase estatica(por eso hay que usar el nombre de la clase delante)*/
	}

}

class miMarco extends JFrame{ //Heredando de JFrame que viene en javax.swing.*;
	
	//Constructor
	public miMarco() { //Método de la clase JFrame.
		setSize(500,300); //Inicialmente las ventanas tienen un tamaño inutil de 0*0 pixeles.
	}
	
}