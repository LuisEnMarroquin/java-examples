package pi179$Colecciones;

import java.util.HashMap;
import java.util.Map;

public class Pi189$Map {

  public static void main(String[] args) {

    HashMap<String, Empleado> personal = new HashMap<String, Empleado>(); // Construyendo un Map

    personal.put("145", new Empleado("Andr�s Manuel L�pez Obrador"));
    personal.put("146", new Empleado("Ricardo Anaya Cort�s"));
    personal.put("147", new Empleado("Jos� Antonio Meade Kuribre�a"));
    personal.put("148", new Empleado("Jaime Heliodoro Rodr�guez Calder�n"));

    System.out.println(personal);

    personal.remove("147"); // Eliminando al PRI

    System.out.println(personal);

    personal.put("148", new Empleado("Margarita Ester Zavala G�mez del Campo")); // Cambiando al Bronco por Margarita

    System.out.println(personal);

    // Map.Entry: La interfaz 'Map' tiene una interfaz interna llamada 'Entry'

    System.out.println(personal.entrySet()); // Se le dice que devuelva una colecci�n de tipo 'Set' y que nos imprima esa colecci�n // Originalmente la colecci�n inicia y finaliza con {llaves}, pero una colecci�n de tipo 'Set' inicia y finaliza con [corchetes]

    for (Map.Entry<String, Empleado> entrada : personal.entrySet()) { // 'personal.entrySet()' devuelve lo que hay almacenado en la colecci�n en forma de colecci�n tipo 'Set'
      // System.out.println(entrada); // Si funciona esta linea
      String clave = entrada.getKey();
      Empleado valor = entrada.getValue();
      System.out.println("Clave = " + clave + ", Valor = " + valor + '.');
    }

  }

}

class Empleado{ // Clase que construye objetos de tipo 'Empleado'

  public Empleado(String n) {
    nombre = n;
    sueldo = 2000;
  }

  public String toString() {
    return "[ Nombre = " + nombre + ", sueldo = " + sueldo + " ]";
  }

  private String nombre;
  private double sueldo;

}
