package pi042$HerenciaCorrecta;

/* Cuando recien se pone el 'extends Empleado' y 'Empleado' no mandará un error porque entiende que de llama al constructor por defecto 'public Empleado()'
 * pero en este caso no hay constructor que reciba 0 parámetros ya que se ha creado otro constructor y no se crea cuando pasa eso el constructor por defecto*/

public class Pi042$Jefatura extends Empleado{ 
	
	public Pi042$Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia); //Llamando al constructor de la clase padre Empleados //Hay que pasarle los parámetros que requiere: 5 o 1 porque solo hay constructores que acepten esa cantidad de parámetros
	}
	
	//setter-a
	public void entableceIncentivo(double b) {
		incentivo=b;
	}
	
	//Sobrescribiendo el método dameSueldo() de la clase Empleado con el fin de agregar un incentivo para el jefe
	@Override
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo(); //Super para que no llame al método de esta clase, si no que llame al de la clase padre 'Empleado'
		return sueldoJefe + incentivo;
	}
	
	//Propiedades //Por convenio se declaran al final
	private double incentivo;

}
