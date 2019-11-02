// 1) Declara dos variables numéricas (con el valor que desees)
// Muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

import java.util.InputMismatchException;
import java.util.Scanner;

public class $1_1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 1, num2 = 1;
		boolean cualFueElError = false;

		try {

			System.out.println("Introduce número 1");
			num1 = entrada.nextInt();

			cualFueElError = true; // Para indicar si es que se introdujo un valor incorrecto en el primer o en el segundo número

			System.out.println("Introduce número 2");
			num2 = entrada.nextInt();

		} catch (InputMismatchException e) { // Cuando se introduce un valor diferente de un número entrará aquí

			if(cualFueElError) {
				System.out.println("Solo debe introducir números enteros, se tomará el segundo número como 1");
			} else {
				System.out.println("Solo debe introducir números enteros, se tomarán ambos números como 1");
			}

		}

		entrada.close();

		System.out.println("La suma de estos números es: " + (num1 + num2));

		System.out.println("La resta de estos números es: " + (num1 - num2));

		System.out.println("La multiplicación de estos números es: " + (num1 * num2));

		if(num2 == 0) {

			System.out.println("La división de estos números es: " + 0);

			System.out.println("El módulo de estos números es: " + 0);

		} else {

			System.out.println("La división de estos números es: " + (num1 / num2));

			System.out.println("El módulo de estos números es: " + (num1 % num2));

		}

	}

}
