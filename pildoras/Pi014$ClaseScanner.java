package pildoras;
import java.util.Scanner;

public class Pi014$ClaseScanner {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduce tu nombre");
    String nombre_usuario = entrada.nextLine(); //nextLine() es un m�todo de la clase Scanner que permite almacenar lo que se introdujo en consola en un String.

    System.out.println("Introduce tu edad");
    int edad = entrada.nextInt(); //nextInt() es un m�todo de la clase Scanner que permite almacenar lo que se introdujo en consola en un Int.

    System.out.println("Hola "+nombre_usuario+" tienes "+edad+" a�os.");

    entrada.close(); //No es obligarorio, pero es para que eclipse no marque un error amarillo al no cerrar el System.in

  }

}

//jOptionPane es un m�todo est�tico, lo que significa que hay que usar el nombre de calse delante del m�todo.
//Un constructor es un m�todo especial que tiene el mismo nombre de la clase.
