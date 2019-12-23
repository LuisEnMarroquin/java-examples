package pi039$SobrecargaDeConstructores;

import java.util.*; //Se pueden tener muchos constructores pero no pueden recibir el mismo número de argumentos.

public class Pi039$POO_TrabajarConUnFichero_UsoEmpleado { //Hay más de 1 clase en este programa, por ello solo 1 debe ser pública y solo esa debe tener el método main.

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


class Empleado{ //La clase empleado es la que se va a encargar de construir un objeto de tipo empleado.
	
	//No importa si se declara primero el constructor, las propiedades, los getters o los setters. NO IMPORTA EL ORDEN
	
	//MÉTODO CONTRUCTOR
	public Empleado(String nom, double sue, int agno,  int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); //Con la palabra new se manda a llamar al constructor de la clase.
		//Usando el método contructor de la clase GregorianCalendar(int year, int month(Enero=0, Febrero=1...), int dayOfTheMonth).
		
		altaContrato = calendario.getTime(); //.getTime es un método de la clase Calendar que es una clase padre de GregorianCalendar, por eso GregorianCalendar hereda todas sus propiedades y métodos.
		// .getTime devuelve una variable de tipo Date que es almacenada en la variable de tipo Date llamada altaContrato.
	}
	
	//OTRO MÉTODO CONTRUCTOR //SOBRECARGA DE CONSTRUCTORES //VIDEO 39
	public Empleado(String nom) {
		//nombre=nom; // Resultado: Nombre: "Parámetro". Sueldo: 0.0. Fecha de alta: null. //Dará 0 en todo excepto el parámetro que se le pasa y da null en fecha de alta porque se está almacenando en una variable de tipo date que es un objeto y cuando no se define un objeto, este es null.
		this(nom, 30000, 2000, 01, 01); //Este this lo que hace es llamar al otro constructor y enviar los valores por defecto que están dentro del this
	}
	
	//Si la clase no tuviera un constructor entraría el constructor por defecto que tendría el mismo nombre que la clase y no recibe parámetros //Generalmente esto no tiene mucho sentido en Java y es raro encontrarlo
	
	//getter-1
	public String dameNombre() {
		return nombre;
	}
	
	//getter-2
	public double dameSueldo() {
		return sueldo;
	}
	
	//getter-3
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//setter-1 //Método para subir el sueldo.
	public void subeSueldo(double porcentaje) { //Este método va a subir un tanto porciento el sueldo.
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	//PROPIEDADES
	private String nombre;
	private double sueldo;
	private Date altaContrato; //Date es como un objeto String, no es un tipo primitivo de dato, es una clase //String pertenece a java.lang, Date no, por eso hay que importar el paquete java.sql o java.util porque hay 2 clases Date, en este caso es java.util
	
	
}