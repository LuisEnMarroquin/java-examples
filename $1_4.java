// 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
// Recuerda usar JOptionPane o Scanner Lector

import javax.swing.JOptionPane;

public class $1_4 {

  public static void main(String[] args) {

    String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

    if(nombre.equalsIgnoreCase("Sergio")) {
      System.out.println("Adios " + nombre);
    } else {
      System.out.println("Bienvenido " + nombre);
    }

  }

}
