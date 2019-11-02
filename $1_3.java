// 3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
// Por ejemplo: si introduzco "Fernando", me aparezca "Bienvenido Fernando".

import java.util.Scanner;

public class $1_3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre");

		String nombre = entrada.nextLine();

		entrada.close();

		if(nombre.equalsIgnoreCase("Sergio")) {
			System.out.println("Adios " + nombre);
		} else {
			System.out.println("Bienvenido " + nombre);
		}

	}

}
