package pi161$ProgramacionGenerica;

public class Pi167$Herencia_TiposComodin {

	public static void main(String[] args) {
		
		Pareja<Employee> Administrativa = new Pareja<Employee>();
		
		Pareja<Boss> DirectoraComercial = new Pareja<Boss>();
		
		Pareja.imprimirTrabajador(Administrativa);
		
		Pareja.imprimirTrabajador(DirectoraComercial); // Para permitir la herencia de esta manera se modificó la clase 'Pareja'

	}

}

class Employee {
	
	public Employee(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.salario = salario;
		
	}
	
	private String nombre;
	
	private int edad;
	
	private double salario;
	
}

class Boss extends Employee{
	
	public Boss(String nombre, int edad, double salario) {
		
		super(nombre, edad, salario);
		
	}
	
	double incentivo(double inc) {
		
		return inc;
		
	}
	
}

class Pareja<T> {
	
	public Pareja() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public static void imprimirTrabajador(Pareja<? extends Employee> p) { // Comodín para permitir la herencia = <Employee> se cambió por <? extends Employee>
		Employee primero = p.getPrimero();
		System.out.println(primero);
	}
	
	public T getPrimero() {
		return primero;
	}
	
	private T primero;
	
}
