package pi179$Colecciones;

import java.util.HashMap;
import java.util.Map;

public class Pi189$Map {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>(); // Construyendo un Map
		
		personal.put("145", new Empleado("Andrés Manuel López Obrador"));
		personal.put("146", new Empleado("Ricardo Anaya Cortés"));
		personal.put("147", new Empleado("José Antonio Meade Kuribreña"));
		personal.put("148", new Empleado("Jaime Heliodoro Rodríguez Calderón"));
		
		System.out.println(personal);
		
		personal.remove("147"); // Eliminando al PRI
		
		System.out.println(personal);
		
		personal.put("148", new Empleado("Margarita Ester Zavala Gómez del Campo")); // Cambiando al Bronco por Margarita
		
		System.out.println(personal);
		
		// Map.Entry: La interfaz 'Map' tiene una interfaz interna llamada 'Entry'
		
		System.out.println(personal.entrySet()); // Se le dice que devuelva una colección de tipo 'Set' y que nos imprima esa colección // Originalmente la colección inicia y finaliza con {llaves}, pero una colección de tipo 'Set' inicia y finaliza con [corchetes]
		
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) { // 'personal.entrySet()' devuelve lo que hay almacenado en la colección en forma de colección tipo 'Set'
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