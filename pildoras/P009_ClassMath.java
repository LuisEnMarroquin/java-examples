package pildoras;

public class P009_ClassMath {

  public static void main(String[] args) {

    // M�todo sqrt - Devolver la ra�z cuadrada de un n�mero.

    // Math.sqrt returns double
    double raiz = Math.sqrt(9); // Se necesita almacenar el resultado en un double.
    System.out.println("La ra�z cuadrada de 9 es " + raiz); // Devuelve un double, por eso imprimir� en consola 3.0.

    // Math.round can get a float and return int or get a double and return long
    float num1 = 5.85F;
    int redondeado = Math.round(num1);
    System.out.println("Number 5.85 rounded is: " + redondeado);

    // Parse means to turn a datatype into other
    double num2 = 5.85F;
    int redondear = (int) Math.round(num2);
    System.out.println("5.85 redondeado es: " + redondear);

    // Math.pow is to raise a number to a power
    double base = 5;
    double exponente = 3;
    int respuesta = (int) Math.pow(base, exponente); // Math.pow decibe 2 doublesy devuelve un double
    System.out.println("El n�mero " + base + " elevado a " + exponente + " es " + respuesta);
  }

}
