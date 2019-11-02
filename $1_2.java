// 2) Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos.
// Si son iguales indicarlo tambi�n. Mostrar los valores para comprobar que funciona.

import java.util.InputMismatchException;
import java.util.Scanner;

public class $1_2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		boolean cualFueElError = false;

		try {

			System.out.println("Introduce n�mero 1");
			num1 = entrada.nextInt();

			cualFueElError = true; // Para indicar si es que se introdujo un valor incorrecto en el primer o en el segundo n�mero

			System.out.println("Introduce n�mero 2");
			num2 = entrada.nextInt();

		} catch (InputMismatchException e) { // Cuando se introduce un valor diferente de un n�mero entrar� aqu�

			if(cualFueElError) {
				System.out.println("Solo debe introducir n�meros enteros, se tomar� el segundo n�mero como 0");
			} else {
				System.out.println("Solo debe introducir n�meros enteros, se tomar�n ambos n�meros como 0");
			}

		}

		entrada.close();

		if(num1 > num2) {
			System.out.println("El n�mero mayor es " + num1 + " y el n�mero menor es " + num2 + ".");
		} else if (num2 > num1) {
			System.out.println("El n�mero mayor es " + num2 + " y el n�mero menor es " + num1 + ".");
		} else {
			System.out.println("El n�mero " + num1 + " y el n�mero " + num2 + " son iguales.");
		}

	}

}
