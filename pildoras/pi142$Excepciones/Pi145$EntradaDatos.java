package pi142$Excepciones; // Error no comporbado = RunTimeException // Error comprobado = IOException

import java.util.InputMismatchException; // This video is only to explain, explanation is good!!!
import java.util.Scanner;

public class Pi145$EntradaDatos {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("�Qu� deseas hacer?");
    System.out.println("1. Introducir datos");
    System.out.println("2. Salir del programa");

    Scanner entrada=new Scanner (System.in);

    int decision=entrada.nextInt();

    if (decision==1){

      try {
        pedirDatos();
      } catch(InputMismatchException e) {
        System.out.println("Has introducido un tipo de dato incorrecto en la edad");
      }


    }else{

      System.out.println("Adios");

      System.exit(0);
    }

    entrada.close();

  }

    static void pedirDatos() throws InputMismatchException { // 'InputMismatchException' is the exception that this method generates when you introduce a 'String' instead of an 'Integer' on age


      //try {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario=entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad=entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");

        entrada.close();

      /*} catch(Exception e) { // You can change 'Exception' by 'InputMismatchException' because it inherits from Exception

        System.out.println("Has introducido un tipo de dato incorrecto en la edad");

      }*/

      // System.out.println("Hemos terminado"); // 145 - Tampoco se executar� porque el try-catch corresponde a todo el m�todo

  }

}

// Las excepciones que heredan de IOException son excepciones comprobadas por lo que es oblogatorio usar la estructura try-catch
// Las excepciones que heredan de I
