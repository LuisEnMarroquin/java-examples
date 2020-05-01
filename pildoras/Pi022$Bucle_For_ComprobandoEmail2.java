package pildoras; // Originally was 'Pi022$Bucle_For_ComprobandoEmail2'
import javax.swing.JOptionPane;

public class Pi022$Bucle_For_ComprobandoEmail2 {

  public static void main(String[] args) {


    System.out.println("Evaluando si una direcci�n de email es correcta o no analisando si lleva o no una @.");
    //Utilizando los m�todos charAt y length de la clase String.

    int arroba = 0;
    boolean punto = false; //Esto porque a diferencia de la @ un email puede llevar m�s de un punto pero por lo menos debe llevar uno.

    String mail = JOptionPane.showInputDialog("Introduce email");
    System.out.println("El email tiene "+ mail.length() +" caracteres.");

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
