package pi142$Excepciones; // Originally was "Pi022$Bucle_For_ComprobandoEmail2"
import java.io.EOFException;

import javax.swing.JOptionPane;

public class Pi147$ComprobandoEmail_CreacionDeExcepciones2 {

  public static void main(String[] args) {


    System.out.println("Evaluando si una direcci�n de email es correcta o no analisando si lleva o no '@' o un '.'");
    //Utilizando los m�todos charAt y length de la clase String.

    String email = JOptionPane.showInputDialog("Introduce email");

    try {
      examinaMail(email);
    } catch(Exception e) {

      System.out.println("La direcci�n de email no es correcta, es demasiado corta");

      e.printStackTrace(); // This returns what happened, it's only to help the programmer

    }


  }

  static void examinaMail(String mail) throws LongitudMailErroneas /*throws EOFException*/{ // This throws is only to indicate to other programmers that this method can generate an exception

    int arroba = 0;
    boolean punto = false; //Esto porque a diferencia de la @ un email puede llevar m�s de un punto pero por lo menos debe llevar uno.

    if(mail.length() <= 3) { // If the length of the email is 3 or less than 3

      //throw new EOFException(); // The same thing that the 2 lines up, but simplified

      throw new LongitudMailErroneas("Note for a programmer: The mail can't have less than 3 characters"); // Put a parameter here is not obligatory because the Exception is being catched before

    } else {

      for(int i=0; i<mail.length(); i++) {

        if(mail.charAt(i)=='@') { //Cuando i=0 evalua si el primer caracter del mail es @, y sigue as� cuando i vale 1,2,3...
          arroba++; //Sumar� en 1 el valor del int arroba cada vez que entre al bucle
        }

        if(mail.charAt(i)=='.') { //Si encuentra un punto la variable "punto" pasar� a ser true.
          punto=true;
        }
      }

      if(arroba==1 && punto==true) {
        System.out.println("El mail es correcto porque lleva solo una @.");
        System.out.print("El email es correcto porque lleva por lo menos 1 punto.");
      }else {
        System.out.println("El mail no es correcto porque no lleva @ o lleva m�s de una @.");
        System.out.print("El email no es correcto porque no lleva punto.");
      }

    }

  }

}

class LongitudMailErroneas extends Exception{ // Class to create my own exception

  public LongitudMailErroneas() {} // It's a good idea to have 2 constructors, 1 without arguments and 1 with a message

  public LongitudMailErroneas(String msgError) {
    super(msgError);
  }

}

// Exception and IOException require to use try-catch obligatory but RuntimeException doesn't require it
