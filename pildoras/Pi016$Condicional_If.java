package pildoras;
import java.util.*;

public class Pi016$Condicional_If {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce tu edad, por favor");
    int edad=entrada.nextInt(); //nextInt() es para que convierta lo que se introdujo en consola en un Int.

    if(edad<=18) {
      System.out.println("Eres mayor de edad");
    }else{
      System.out.println("Eres menor de edad");
    }

    if(edad<18) {
      System.out.println("Eres un adolescente");
    }
    else if(edad<40){
      System.out.println("Eres un adulto");
    }
    else if(edad<65) {
      System.out.println("Eres un adulto mayor");
    }
    else {
      System.out.println("Eres un anciano");
    }

    entrada.close();

  }

}
