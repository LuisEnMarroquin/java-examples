package pildoras;
import javax.swing.*;

public class Pi018$Bucle_While {

  public static void main(String[] args) {

    String clave = "password";
    String pass = "";

    while(clave.equals(pass)==false) { //Mientras clave y pass no son iguales que ejecute lo que est� dentro del bucle.
      pass = JOptionPane.showInputDialog("Introduce la contrase�a"); //La contrase�a es password
      if(clave.equals(pass)==false) {
        System.out.println("Contrase�a incorrecta");
      }
    }
    System.out.println("Contrase�a correcta");

  }

}
