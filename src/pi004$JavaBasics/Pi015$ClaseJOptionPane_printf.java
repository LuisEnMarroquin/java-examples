package pi004$JavaBasics;
import javax.swing.JOptionPane;

public class Pi015$ClaseJOptionPane_printf {

	public static void main(String[] args) {

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre"); //Recibe un objeto, en este caso un String (un String no es un tipo de dato, es un objeto perteneciente a la clase String)
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_usuario = Integer.parseInt(edad); //Se pasa a entero el String de edad para poderle sumar en el syso siguiente.
		
		System.out.println("Hola "+nombre_usuario+". El siguiente año tendrás "+(edad_usuario+1)+" años.");
		
		//Format number to use less numbers.
		
		double x=10000.0; // El punto 0 es poque es un double.
		System.out.printf("%1.2f",x/3); //Simplificar los decimales a solo 2 //printf es para imprimir con formato. //printf tiene 2 parametros.
		System.out.println();
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		double num2 = Double.parseDouble(num1); //Clase Double con el método parseDouble() //Como el método es estatico se debe poner también el nombre de la clase delante.
		System.out.print("La raíz de " +num2+" es: ");
		System.out.printf("%1.4f",Math.sqrt(num2)); //Se pasó a double porque el método .sqrt exige que se le pase un double.
		
	}

}
