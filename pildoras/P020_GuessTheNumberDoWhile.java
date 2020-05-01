package pildoras;
import java.util.*;

//El bucle Do While causa que el c�digo se ejecute al menos una vez corrigiendo el problema del archivo Pi019$AdivinaElNumero.java

public class P020_GuessTheNumberDoWhile {

  public static void main(String[] args) {

    System.out.println("Observando como trabaja Math.random() (devuelve un double): "+ Math.random());
    System.out.println("Obteniendo un valor entre 0 y 100 con Math.random(): "+ (Math.random()*100));
    System.out.println("Obteniendo un valor entero entre 0 y 100 con Math.random(): "+ (int)(Math.random()*100));
    System.out.println(" ");

    int aleatorio = (int)(Math.random()*100);
    //System.out.println("El n�mero que tienes que adivinar es: " + aleatorio);
    Scanner entrada = new Scanner(System.in);

    int numero = 0;
    int intentos = 0;

    do{ //Antes de usar una variable en Java hay que inicializarla, por eso se inicializaron "numero" e "intentos" arriba.

      intentos++;

      System.out.println("Introduce un n�mero");
      numero = entrada.nextInt(); //numero es igual a lo que se introduzca en consola (que ser� un entrero por el .nextInt())

      if(aleatorio<numero) {
        System.out.println("M�s bajo"); //El n�mero es m�s bajo que el que has introducido.
      }
      else if(aleatorio>numero) {
        System.out.println("M�s alto"); //El n�mero es m�s alto que el que has introducido.
      }

    }while(numero!=aleatorio);

    entrada.close(); //No se puede cerrar entrada dentro del while porque intentar� cerrarlo varias veces y a la segunda habr� un error en tiempo de ejecuci�n.

    System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");

  }

}
