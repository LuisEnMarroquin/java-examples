// Esta clase depende de Pi029$POO_UsoCoche.java

package pi028$POO_Packages; //Por convenci�n los paquetes en Java comienzan con letra minuscula.

public class Pi029$POO_Coche { //Comportamiento de un objeto = m�todo()

  //Propiedades
  /*private*/ int ruedas; //El private es para que esta propiedad no se pueda modificar desde otra clase.
  int largo;
  int ancho;
  /*private*/ int motor; // Encapsulado
  int peso; // No Encapsulado

  //M�todo contructor: Para asignar los valores a las propiedades del objeto. //El m�todo contructor es un m�todo especial que se encarga de dar un estado inicial a nuestro objeto.
  public Pi029$POO_Coche() { //El m�todo contructor siempre se debe llamar igual que la clase
    ruedas = 4;
    largo = 2000;
    ancho = 300;
    motor = 1600;
    peso = 500;
  } //Cuando se manda a llamar el contructor y se termina de ejecutar lo que est� dentro, el flujo de ejecuci�n vuelve a la siguiente linea de la clase principal (En este caso al System.out.println).


  // VIDEO 29
  /*Una forma desaconsejada de hacer lo mismo pero en una �nica clase. As� esta clase ser�a independiente y se podr�a eliminar la otra.
  public static void main (String args[]) {
    Pi029$POO_Coche Renault = new Pi029$POO_Coche(); // INSTANCIAR UNA CLASE / EJEMPLARIZAR UNA CLASE
    System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
  }*/

}

/* class Camion{
  VIDEO 29 - Creando mas de una clase en el mismo archivo (esto tambi�n es posible pero desaconsejado).
} */

//Siempre tiene que haber una clase p�blica que es a que d� el nombre al archivo, en este caso es: Pi029$POO_Coche.
//La clase p�blica es la que debe de tener el m�todo main, y el resto de clases no deben de ser p�blicas ni tener m�todo main.
