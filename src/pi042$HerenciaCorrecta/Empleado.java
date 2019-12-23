package pi042$HerenciaCorrecta;

import java.util.Date;
import java.util.GregorianCalendar;

//Clase que construye empleados que tienen un nombre y una sección a la que pertenecen dentro de la empresa.

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