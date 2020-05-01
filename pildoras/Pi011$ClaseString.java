package pildoras;

public class Pi011$ClaseString {

  public static void main(String[] args) {

    String nombre = "Luis"; //Un String siempre va entre comillas dobles.

    System.out.println("Mi nombre es "+nombre+".");

    System.out.println("Mi nombre tiene "+nombre.length()+" letras.");

    System.out.println("La primera letra de "+nombre+" es "+nombre.charAt(0)+".");

    int ultima_letra = nombre.length();
    System.out.println("La ultima letra de "+nombre+" es "+nombre.charAt(ultima_letra-1)+".");

    //String.subtring - Extrayendo cietos caracteres de un String.
    String frase = "Hoy es un estupendo d�a para aprender a programar en Java";
    String frase_resume = frase.substring(4);
    System.out.println(frase_resume);
    String frase_resumen = frase.substring(29, 57) + " e ir a la playa.";
    System.out.println(frase_resumen);

    //M�todo equals - Comprarar Strings
    String alumno1 = "David";
    String alumno2 = "david";
    System.out.println("Con equals: "+alumno1.equals(alumno2));
    System.out.println("Con equalsIgnoreCase: "+alumno1.equalsIgnoreCase(alumno2));

  }

}

//String no es un tipo primitivo.
//Por tanto cada vez que se pone String no se hace referencia a un tipo primitivo, se hace referencia a una clase, no a un tipo primitivo.
//Intanciar=Ejemplarizar una clase
//Al poner String minombre= "Luis" se dice que minombre es un objeto (instancia/ejemplar) de la Clase String.
