package pi142$Excepciones; // Mala practica ya que se hace el try-catch en excepciones que heredan de RuntimeException

import javax.swing.JOptionPane;

public class Pi148$VariasExcepciones {

	public static void main(String[] args) {
		
		try {
			division();
		} 
		catch(ArithmeticException e) { // It happens when 'num2' is 0
			
			System.out.println("No se permite la división entre 0");
			
		}
		catch(NumberFormatException e) { // It happens when 'num2' is NaN
			
			System.out.println("No has introducido un número entero");
			
			System.out.println(e.getMessage()); // The method from class Throwable '.getMessage()' returns info of what happened
			System.out.println("Se ha generado un error es este tipo: " + e.getClass().getName());
			System.out.println("Se ha generado un error es este tipo: " + e.getClass());
			
		}
		

	}

	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce divisor"));
		
		System.out.println("El resultado es: " + num1 / num2);
		
	}
	
}
