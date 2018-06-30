//El proyecto anterior a estos fue 'Pi039$POO_TrabajarConUnFichero_UsoEmpleado'

package pi042$HerenciaCorrecta;
//IMPORTANTE EXPLICACIÓN DE LAS VARIABLES ESTÁTICAS EN EL VIDEO 37 MINUTO 20 //VIDEO 38 MINUTO 12.15 EXPLICA DATOS DEL MÉTODO MAIN
//Para usar una variable static hay que usar el nombre de la clase junto a la variable o constante, por ejemplo Math.PI

public class Pi042$UsoEmpleado { //Hay más de 1 clase en este programa, por ello solo 1 debe ser pública y solo esa debe tener el método main.

	public static void main(String[] args) { 
		
		Empleado [] misEmpleados = new Empleado[4];

		//Estos acceden al primer constructor
		misEmpleados[0] = new Empleado("Luis", 85000, 1990, 12, 17); //Inicialmente no se puede hacer un array con diferentes tipos de datos.
		misEmpleados[1] = new Empleado("Juan", 65000, 1999, 3, 9); //Ahora si se pueden usar diferentes tipos de datos en un array porque se ha creado una clase Empleado (que maneje esos tipos de datos) y un array perteneciente a esa clase Empleado.
		misEmpleados[2] = new Empleado("Manuel", 25000, 2016, 27, 3); //En este array se está guardando un String, un double y 3 enteros.
		//Estos acceden al segundo contructor
		misEmpleados[3] = new Empleado("Ana"); //Dará 0 en todo excepto el parámetro que se le pasa y da null en fecha de alta porque se está almacenando en una variable de tipo date que es un objeto y cuando no se define un objeto, este es null.
		
		System.out.println("Subiendo con bucles for.");
		
		//setter-1
		for(int i=0; i<misEmpleados.length; i++) { //Método para subir el sueldo
			misEmpleados[i].subeSueldo(5);
		}
		
		//getter-1-2-3
		for(int i=0; i<misEmpleados.length; i++) { //Mostrando todos en consola 
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ". Sueldo: " + misEmpleados[i].dameSueldo() + ". Fecha de alta: " + misEmpleados[i].dameFechaContrato() + ".");
		}
		
		System.out.println();
		System.out.println("Subiendo con bucles for each.");
		
		//setter-1 //Subiendo otra vez el sueldo un 5% respecto a la subida de sueldo anterior.
		for(Empleado e: misEmpleados) { //Con bucle for mejorado (bucle for each)
			e.subeSueldo(5);
		}
		
		//getter-1-2-3
		for(Empleado e: misEmpleados) { //Con bucle for mejorado (bucle for each)
			System.out.println("Nombre: " + e.dameNombre() + ". Sueldo: " + e.dameSueldo() + ". Fecha de alta: " + e.dameFechaContrato() + ".");
		}
		
	}

}