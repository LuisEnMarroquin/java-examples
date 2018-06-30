package pi142$Excepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pi149$AreasPeso_ClausulaFinally {

	public static void main(String[] args) {
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			figura = entrada.nextInt();
		}
		catch(Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		finally { // 'finally' Always happens
			entrada.close();
		}
		
		
		switch(figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println(Math.pow(lado, 2));
		
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectángulo es: " + (base*altura)/2);
		
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triángulo es: " + (base*altura)/2);
			break;
		
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El area del círculo es: ");
			System.out.println(Math.PI * (Math.pow(radio, 2)));
			break;
		
		default:
			System.out.println("La opción introducida no es correcta");
		
		}
		
		// ----------------------------------------------------------- Calculadora de Peso Ideal
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centímetros"));
		System.out.println("Si eres hombre tu peso ideal es: " + (altura-110) + " kg.");
		System.out.println("Si eres mujer tu peso ideal es: " + (altura-120) + " kg.");

	}

	static int figura;
	
}
