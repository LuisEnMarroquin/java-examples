package pildoras;
import java.util.*;
import javax.swing.*;

//Es importante lo que menciona en el minuto 10 del video acerca de los m�todos est�ticos.

public class P017_ConditionalSwitch {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce un n�mero para calcular el area: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo"); // El \n es para hacer un salto de linea.

    int figura = entrada.nextInt();
    entrada.close(); //Ya que se asigna el valor del Scanner a una variable se puede cerrar con tranquilidad.

    switch(figura) {
    case 1:
      int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); //.showInputDialog() devuelve un error devuelve un String.
      System.out.println("El area del cuadrado es " + Math.pow(lado, 2)); //Math.pow funciona as� (numero, exponente)
      break; //Siempre que se termina el case se debe poner break para que no siga corriendo los dem�s case.
    case 2:
      int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
      int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
      System.out.println("El area del rect�ngulo es " + base*altura);
      break;
    case 3:
      base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")); //No se pone como int porque ya se declar� en case 2
      altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura")); //No se pone como int porque ya se declar� en case 2
      System.out.println("El area del rect�ngulo es " + (base*altura)/2);
      break;
    case 4:
      int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
      System.out.print("El area del circulo es: ");
      System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); // printf(cantidad de decimales, numero) //Math.Pi() = 3.1416... //Math.pow(numero, exponente)
      break;
    default:
      System.out.println("El dato introducido no es correcto.");
    }

  }
}
