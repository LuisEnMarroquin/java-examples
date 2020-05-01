package pildoras;
import javax.swing.JOptionPane;

public class Pi021$Bucle_For_ComprobandoEmail {

  public static void main(String[] args) {

    for(int i=0; i<10; i++) { //Imprimir mi nombre 10 veces
      System.out.print("Luis "+i+". ");
    }System.out.println("");

    for(int i=10; i>0; i--) {
      System.out.print("Luis "+i+". ");
    }System.out.println("");

    for(int i=0; i<20; i+=2) { //Imprimir mi nombre 10 veces
      System.out.print("Luis "+i+". ");
    }System.out.println("");

    System.out.println("");

    System.out.println("Evaluando si una direcci�n de email es correcta o no analisando si lleva o no una @.");
    //Utilizando los m�todos charAt y length de la clase String.

    boolean arroba = false;

    String mail = JOptionPane.showInputDialog("Introduce email");
    System.out.println("El email tiene "+ mail.length() +" caracteres.");

    for(int i=0; i<mail.length(); i++) {
      if(mail.charAt(i)=='@') { //Cuando i=0 evalua si el primer caracter del mail es @, y sigue as� cuando i vale 1,2,3...
        arroba=true; //Solo si el if se cumple arroba se convertir� en true.
      }
    }

    if(arroba==true) {
      System.out.println("El mail es correcto porque lleva @.");
    }else {
      System.out.println("El mail no es correcto porque no lleva @.");
    }

  }

}
