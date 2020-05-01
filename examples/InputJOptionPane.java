package examples;

import javax.swing.JOptionPane;

public class InputJOptionPane {

  public static void main(String[] args) {

    String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

    if(nombre.equalsIgnoreCase("Sergio")) {
      System.out.println("Adios " + nombre);
    } else {
      System.out.println("Bienvenido " + nombre);
    }

  }

}
