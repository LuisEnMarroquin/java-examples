package pi161$ProgramacionGenerica;

import java.util.*;

public class Pi161$ArrayList_Empleado {

  public static void main(String[] args) {

    /*Empleado[] listaEmpleados=new Empleado[3]; // Array normal de 3 elementos
    listaEmpleados[0] = new Empleado("Manuel", 14, 15000);
    listaEmpleados[1] = new Empleado("Ana", 16, 25000);
    listaEmpleados[2] = new Empleado("Luis", 18, 18000);*/

    // Por defecto un 'ArrayList' tiene 10 elementos // EXPLICACI�N DE ESTO EN EL MINUTO 13 - VIDEO 161
    // Solo se pueden almacenar objetos en un 'ArrayList' no tipos primitivos

    ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>(); // ArrayList

    //listaEmpleados.ensureCapacity(11); // No es obligatorio hacer esto // EXPLICACI�N DE ESTO EN EL MINUTO 13 - VIDEO 161

    listaEmpleados.add(new Empleado("Manuel", 14, 15000));
    listaEmpleados.add(new Empleado("Ana", 16, 25000));
    listaEmpleados.add(new Empleado("Luis", 18, 18000));
    listaEmpleados.add(new Empleado("Albert", 20, 33464));
    listaEmpleados.add(new Empleado("Melissa", 23, 14567));
    listaEmpleados.add(new Empleado("Dana", 12, 10677));
    listaEmpleados.add(new Empleado("Jos�", 19, 10120));
    listaEmpleados.add(new Empleado("Rosy", 17, 10340));
    listaEmpleados.add(new Empleado("Enrique", 25, 10350));
    listaEmpleados.add(new Empleado("Roc�o", 19, 10500));
    listaEmpleados.add(new Empleado("Roberto", 20, 45678));
    listaEmpleados.add(new Empleado("Santiago", 21, 25900));

    //listaEmpleados.trimToSize(); // Recorta el espacio sobrante de la memoria (no es obligatorio su uso)

    for(Empleado e : listaEmpleados) {
      System.out.println(e.dameDatos());
    }

    System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos.");

  }

}

class Empleado {

  public Empleado(String nombre, int edad, double salario){

    this.nombre = nombre;

    this.edad = edad;

    this.salario = salario;

  }

  public String dameDatos() {
    return "El empleado se llama " + nombre + " tiene " + edad + " a�os." + " Y un salario de " + salario + ".";
  }



  private String nombre;

  private int edad;

  private double salario;

}
