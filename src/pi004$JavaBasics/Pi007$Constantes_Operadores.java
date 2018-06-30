package pi004$JavaBasics;

public class Pi007$Constantes_Operadores {

	public static void main(String[] args) {
		
		final int constante = 256;
		
		//constante = 512; // Esto no se puede hacer porque el valor de una constante no se puede cambiar.
		
		System.out.println("El valor de la constante es: "+constante);
		
		int a = 250;
		int b = 250;
		int c = a+b;
		System.out.println("El valor de la suma es: "+c);
		
		int d = 100;
		d += 75;
		System.out.println("El valor de la suma es: " +d);
		
		//Conversión  de cm a pulgadas
		final double pulgadaEnCentimetros = 2.54;
		double cantidadDeCentimetros= 6;
		double resultado = cantidadDeCentimetros / pulgadaEnCentimetros;
		System.out.println("En "+cantidadDeCentimetros+" cm hay "+resultado+" pulgadas");
		
		int num1=12, num2=23, num3=34; //Declaración e iniciación de muchas variables en una sola linea.
		System.out.println(num1+num2+num3);

	}

}
