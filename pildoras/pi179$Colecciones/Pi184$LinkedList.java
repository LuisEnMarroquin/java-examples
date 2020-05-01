package pi179$Colecciones;

import java.util.*;

public class Pi184$LinkedList {

  public static void main(String[] args) { // LinkedList trabaja en base a referencias y es muy eficiente // Video 184

    LinkedList<String> personas = new LinkedList<String>(); // 'LinkedList' es una clase gen�rica

    personas.add("Pepe");
    personas.add("Sandra");
    personas.add("Ana");
    personas.add("Laura");

    System.out.println("Esta LinkedList tiene hasta ahora " + personas.size() + " elementos.");

    for (String people : personas) { // LinkedList es una lista ordenada
      System.out.println(people);
    }

    personas.add("Luis"); // Agregando al final de la lista

    personas.add(0, "Manuel"); // Agregando en la primer posici�n de la lista

    System.out.println("==================================");

    // Agregando a juan al inicio de la lista
    ListIterator<String> it = personas.listIterator();
    it.next();
    it.add("Juan");
    for (String people : personas) {
      System.out.println(people);
    }

  }

}
