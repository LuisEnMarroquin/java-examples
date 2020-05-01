package examples;

import java.util.Scanner;

public class CircleArea {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduce el radio del círculo");

    int radio = entrada.nextInt();

    entrada.close();

    System.out.println("El area de un círculo de radio " + radio + " es: " + (Math.PI * Math.pow(radio, 2)) + ".");

  }

}
