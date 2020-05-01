// Esta clase depende de Pi028$POO_UsoCoche.java

package pi028$POO_Packages; //Por convenci�n los paquetes en Java comienzan con letra minuscula.

//Aqu� se colocar�a el import.

public class Pi028$POO_Coche { //Comportamiento de un objeto = m�todo()

  //Propiedades
  int ruedas; //Propiedades no encapsuladas, por ello son modificables desde otra clase
  int largo;
  int ancho;
  int motor;
  int peso;

  //M�todo contructor: Para asignar los valores a las propiedades del objeto. //El m�todo contructor es un m�todo especial que se encarga de dar un estado inicial a nuestro objeto.
  public Pi028$POO_Coche() { //El m�todo contructor siempre se debe llamar igual que la clase
    ruedas = 4;
    largo = 2000;
    ancho = 300;
    motor = 1600;
    peso = 500;
  } //Cuando se manda a llamar el contructor y se termina de ejecutar lo que est� dentro, el flujo de ejecuci�n vuelve a la siguiente linea de la clase principal (En este caso al System.out.println).

}
