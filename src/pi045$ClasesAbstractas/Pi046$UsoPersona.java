
package pi045$ClasesAbstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Pi046$UsoPersona { 

	public static void main(String[] args) { 
		
		Persona[] lasPersonas = new Persona[2]; // 2 porque tendrá solo 2 personas.
		lasPersonas [0] = new Empleado("Andres", 50000, 2009, 02, 25);
		lasPersonas [1] = new Alumno("Andrea", "Biología");
		
		for(Persona p: lasPersonas) { //Recorriendo el Array lasPersonas[]
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
		
	}

}

abstract class Persona{
	
	//Constructor
	public Persona(String nom) {
		nombre=nom;
	}
	
	//Método común getter-1
	public String dameNombre() {
		return nombre;
	}
	
	//Método abstracto
	public abstract String dameDescripcion();
	
	//Propiedades
	private String nombre;
	
}

class Empleado extends Persona{ 
	
	//MÉTODO CONTRUCTOR
	public Empleado(String nom, double sue, int agno,  int mes, int dia) {
		
		/*46*/super(nom); //Hay que llamar al constructor de la clase padre.
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); //Usando el método contructor de la clase GregorianCalendar(int year, int month(Enero=0, Febrero=1...), int dayOfTheMonth).
		
		altaContrato = calendario.getTime(); // .getTime devuelve una variable de tipo Date que es almacenada en la variable de tipo Date llamada altaContrato.
	
		++IdSiguiente;
		
		Id = IdSiguiente;
		
	}
	
	//getter-1
	@Override
	public String dameDescripcion() {
		return "Este empleado tiene un sueldo de " + sueldo + " y un Id de " + Id + ".";
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
	private double sueldo;
	private Date altaContrato; //Date es como un objeto String, no es un tipo primitivo de dato, es una clase //String pertenece a java.lang, Date no, por eso hay que importar el paquete java.sql o java.util porque hay 2 clases Date, en este caso es java.util
	private static int IdSiguiente;
	private int Id;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) { //Como se está heredando de la clase Persona lo primero que hay que hacer es mandar a llamar al constructor de la clase padre;
		super(nom);
		carrera = car;
	}
	
	@Override
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera + ".";
	}
	
	//Propiedades
	private String carrera;
	
}