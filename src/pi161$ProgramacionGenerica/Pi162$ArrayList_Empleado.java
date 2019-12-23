package pi161$ProgramacionGenerica;

import java.util.*;

public class Pi162$ArrayList_Empleado {

	public static void main(String[] args) {
		
		/*Empleado2[] listaEmpleados=new Empleado2[3]; // Array normal de 3 elementos
		listaEmpleados[0] = new Empleado2("Manuel", 14, 15000);
		listaEmpleados[1] = new Empleado2("Ana", 16, 25000);
		listaEmpleados[2] = new Empleado2("Luis", 18, 18000);*/
		
		// Por defecto un 'ArrayList' tiene 10 elementos // EXPLICACIÓN DE ESTO EN EL MINUTO 13 - VIDEO 161
		// Solo se pueden almacenar objetos en un 'ArrayList' no tipos primitivos
		
		ArrayList <Empleado2> listaEmpleados = new ArrayList<Empleado2>(); // ArrayList
		
		//listaEmpleados.ensureCapacity(11); // No es obligatorio hacer esto // EXPLICACIÓN DE ESTO EN EL MINUTO 13 - VIDEO 161
		
		listaEmpleados.add(new Empleado2("Manuel", 14, 15000));
		listaEmpleados.add(new Empleado2("Ana", 16, 25000));
		listaEmpleados.add(new Empleado2("Luis", 18, 18000));
		listaEmpleados.add(new Empleado2("Albert", 20, 33464));
		listaEmpleados.add(new Empleado2("Melissa", 23, 14567));
		listaEmpleados.add(new Empleado2("Dana", 12, 10677));
		listaEmpleados.add(new Empleado2("José", 19, 10120));
		listaEmpleados.add(new Empleado2("Rosy", 17, 10340));
		listaEmpleados.add(new Empleado2("Enrique", 25, 10350));
		listaEmpleados.add(new Empleado2("Rocío", 19, 10500));
		listaEmpleados.add(new Empleado2("Roberto", 20, 45678));
		listaEmpleados.add(new Empleado2("Santiago", 21, 25900));
		
		//listaEmpleados.trimToSize(); // Recorta el espacio sobrante de la memoria (no es obligatorio su uso)
		
		//listaEmpleados.add(new Empleado2("Olga", 16, 14678)); // Para poner este empleado a cierta posición del ArrayList
		listaEmpleados.set(1, new Empleado2("Olga", 16, 14678));
		
		// Buscando el elemento que está en quinto lugar (posición 4 = indice 5)
		System.out.println("Pidiendo datos: " + listaEmpleados.get(4).dameDatos());
		
		for(Empleado2 e : listaEmpleados) { // Recorriendo el ArrayList con Bucle For Each
			System.out.println(e.dameDatos());
		}
		/*for(int i = 0; i < listaEmpleados.size(); i++) { // Recorriendo el ArrayList con Bucle For
			Empleado2 e = listaEmpleados.get(i); // Se va almacenando cada elemento en el objeto 'e' de tipo 'Empleado2'
			System.out.println(e.dameDatos()); // Se imprime el elemento 'e' // Si solo se imprime la 'e' sin el método '.dameDatos()' imprimirá las referencias de memoria
		}*/
		
		// Convirtiendo de 'ArrayList' a 'Array normal'
		/* Empleado2 arrayEmpleados[] = new Empleado2[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados);
		// Recorriendo el 'Array normal'
		for(int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
		} */
		
		System.out.println("El ArrayList tiene " + listaEmpleados.size() + " elementos.");
		
	}

}

class Empleado2 { 
	
	public Empleado2(String nombre, int edad, double salario){
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.salario = salario;

	}
	
	public String dameDatos() {
		return "El Empleado se llama " + nombre + " tiene " + edad + " años." + " Y un salario de " + salario + ".";
	}

	

	private String nombre;
	
	private int edad;
	
	private double salario;
	
}
