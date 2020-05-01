package pi142$Excepciones;

import javax.swing.JOptionPane;

public class Pi142$Excepciones {

  public static void main(String[] args) {

    int [] matriz = new int[5];

    matriz[0] = 5;
    matriz[1] = 10;
    matriz[2] = 8;
    matriz[3] = 14;
    matriz[4] = 3;
    matriz[5] = 8;

    for(int i = 0; i<5; i++) {
      System.out.println("Posici�n: " + i + " - " + matriz[i] );
    }

    // Petici�n de datos personales

    String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

    int edad = Integer.parseInt(JOptionPane.showInputDialog("Intruduce tu edad"));

    System.out.println("Hola " + nombre + " tienes " + edad + " a�os. ");

    // Explicaci�n de IOException con el archivo 'Pi064$Imagenes.java'

  }

}
