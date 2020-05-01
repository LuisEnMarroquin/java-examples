package pi044$CastingObjetos_ClasesYMetodosFinal;

/* Cuando recien se pone el 'extends Empleado' y 'Empleado' no mandar� un error porque entiende que de llama al constructor por defecto 'public Empleado()'
 * pero en este caso no hay constructor que reciba 0 par�metros ya que se ha creado otro constructor y no se crea cuando pasa eso el constructor por defecto*/

/*44*/final class Jefatura extends Empleado{

  public Jefatura(String nom, double sue, int agno, int mes, int dia) {
    super(nom, sue, agno, mes, dia); //Llamando al constructor de la clase padre Empleados //Hay que pasarle los par�metros que requiere: 5 o 1 porque solo hay constructores que acepten esa cantidad de par�metros
  }

  //setter-a
  public void entableceIncentivo(double b) {
    incentivo=b;
  }

  //Sobrescribiendo el m�todo dameSueldo() de la clase Empleado con el fin de agregar un incentivo para el jefe
  @Override
  public double dameSueldo() {
    double sueldoJefe = super.dameSueldo(); //Super para que no llame al m�todo de esta clase, si no que llame al de la clase padre 'Empleado'
    return sueldoJefe + incentivo;
  }

  //Propiedades //Por convenio se declaran al final
  private double incentivo;

}//Polimorfismo: Diferente comportamiento de acuerdo a las circunstancias.

//Como Jefatura es Final ya no se puede hacer una clase que extienda de esa.
/*class Director extends Jefatura{
  public Director(String nom, double sue, int agno,  int mes, int dia) {
    super(nom, sue, agno, mes, dia);
  }
}*/

//Un m�todo 'final' no puede ser sobreescrito.
