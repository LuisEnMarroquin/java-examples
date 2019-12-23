package pi150$Debugging_Streams_Serializacion;

import javax.swing.JOptionPane;

public class Pi150$DebuggingConEclipse {

	public static void main(String[] args) {
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de elementos de la matríz"));
		
		int numerosAleatorios[] = new int[elementos];

		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int)(Math.random()*100);
		}
		
		for(int elem : numerosAleatorios) {
			System.out.println(elem);
		}
		
	}

}

// Como debuggear en eclipse
	// Hacer un punto de insercción en la barra lateral izquierda
	// Usar el botón de 'Debug' que está al lado izquierdo del botón de ejecución del programa Java
	// Ir a la vista debug
	// Es buena idea repasar el video 150 y 151 para Debuggear bien
