package examples;

import java.util.Scanner;

public class StringCompare {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Enter your name");

    String nombre = entrada.nextLine();

    entrada.close();

    if (nombre.equalsIgnoreCase("Sergio")) {
      System.out.println("Goodbye " + nombre);
    } else {
      System.out.println("Hi " + nombre);
    }

  }

}
