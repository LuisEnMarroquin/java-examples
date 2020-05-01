package pi161$ProgramacionGenerica;

import java.util.*;

public class Pi163$ArrayList_Empleado {

  public static void main(String[] args) {

    /*Empleado3[] listaEmpleados=new Empleado3[3]; // Array normal de 3 elementos
    listaEmpleados[0] = new Empleado3("Manuel", 14, 15000);
    listaEmpleados[1] = new Empleado3("Ana", 16, 25000);
    listaEmpleados[2] = new Empleado3("Luis", 18, 18000);*/

    // Por defecto un 'ArrayList' tiene 10 elementos // EXPLICACI�N DE ESTO EN EL MINUTO 13 - VIDEO 161
    // Solo se pueden almacenar objetos en un 'ArrayList' no tipos primitivos

    ArrayList <Empleado3> listaEmpleados = new ArrayList<Empleado3>(); // ArrayList

    //listaEmpleados.ensureCapacity(11); // No es obligatorio hacer esto // EXPLICACI�N DE ESTO EN EL MINUTO 13 - VIDEO 161

    listaEmpleados.add(new Empleado3("Manuel", 14, 15000));
    listaEmpleados.add(new Empleado3("Ana", 16, 25000));
    listaEmpleados.add(new Empleado3("Luis", 18, 18000));
    listaEmpleados.add(new Empleado3("Albert", 20, 33464));
    listaEmpleados.add(new Empleado3("Melissa", 23, 14567));
    listaEmpleados.add(new Empleado3("Dana", 12, 10677));
    listaEmpleados.add(new Empleado3("Jos�", 19, 10120));
    listaEmpleados.add(new Empleado3("Rosy", 17, 10340));
    listaEmpleados.add(new Empleado3("Enrique", 25, 10350));
    listaEmpleados.add(new Empleado3("Roc�o", 19, 10500));
    listaEmpleados.add(new Empleado3("Roberto", 20, 45678));
    listaEmpleados.add(new Empleado3("Santiago", 21, 25900));

    //listaEmpleados.trimToSize(); // Recorta el espacio sobrante de la memoria (no es obligatorio su uso)

    //listaEmpleados.add(new Empleado3("Olga", 16, 14678)); // Para poner este empleado a cierta posici�n del ArrayList
    listaEmpleados.set(1, new Empleado3("Olga", 16, 14678));

    // Buscando el elemento que est� en quinto lugar (posici�n 4 = indice 5)
    System.out.println("Pidiendo datos: " + listaEmpleados.get(4).dameDatos()); System.out.println();

    /*for(Empleado3 e : listaEmpleados) { // Recorriendo el ArrayList con Bucle For Each
      System.out.println(e.dameDatos());
    }*/

    /*for(int i = 0; i < listaEmpleados.size(); i++) { // Recorriendo el ArrayList con Bucle For
      Empleado3 e = listaEmpleados.get(i); // Se va almacenando cada elemento en el objeto 'e' de tipo 'Empleado3'
      System.out.println(e.dameDatos()); // Se imprime el elemento 'e' // Si solo se imprime la 'e' sin el m�todo '.dameDatos()' imprimir� las referencias de memoria
    }*/

    // Convirtiendo de 'ArrayList' a 'Array normal'
    /* Empleado3 arrayEmpleados[] = new Empleado3[listaEmpleados.size()];
    listaEmpleados.toArray(arrayEmpleados);
    // Recorriendo el 'Array normal'
    for(int i = 0; i < arrayEmpleados.length; i++) {
      System.out.println(arrayEmpleados[i].dameDatos());
    } */

    // Objeto 'Iterator' llamado 'miIterador' que maneja objetos de tipo 'Empleado3'
    Iterator <Empleado3> miIterador = listaEmpleados.iterator();

    while(miIterador.hasNext()) {
      System.out.println(miIterador.next().dameDatos());
    }

    System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos.");

  }

}

class Empleado3 {

  public Empleado3(String nombre, int edad, double salario){

    this.nombre = nombre;

    this.edad = edad;

    this.salario = salario;

  }

  public String dameDatos() {
    return "El Empleado se llama " + nombre + " tiene " + edad + " a�os." + " Y un salario de " + salario + ".";
  }



  private String nombre;

  private int edad;

  private double salario;

}
