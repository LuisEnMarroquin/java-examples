package pi050$Interfaces;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

  public static void main(String[] args) {

    System.out.println("Empleados Ordenados por sueldo usando Arrays.sort y la interfaz Compare");

    Jefatura jefe_RecursosHumanos = new Jefatura ("Juan", 55000, 2006, 9, 25);

    jefe_RecursosHumanos.estableceIncentivo(2570);

    Empleado [] misEmpleados = new Empleado[6];

    misEmpleados[0] = new Empleado("Luis", 85000, 1990, 12, 17);

    misEmpleados[1] = new Empleado("Juan", 65000, 1999, 3, 9);

    misEmpleados[2] = new Empleado("Manuel", 25000, 2016, 27, 3);

    misEmpleados[3] = new Empleado("Ana");

    misEmpleados[4] = jefe_RecursosHumanos; //Polimorfismo. Principio de Sustituci�n

    misEmpleados[5] = new Jefatura("Mar�a", 95000, 1999, 5, 26);

    // S - Video 50

    Jefatura jefa_finanzas = (Jefatura)misEmpleados[5];
    jefa_finanzas.estableceIncentivo(55000);

    Empleado director_comercial = new Jefatura("Sandra", 70000, 2014, 4, 23);

    //No se puede instanciar una interfaz a menos que sea por el principio de sustituci�n. Se crea instancia de la interfaz pero luego se le dice que es de tipo
    Comparable ejemplo = new Empleado("Elisabeth", 95000, 2001, 5, 11);

    if(director_comercial instanceof Empleado) { //Instance of te dife si un objeto es una instancia de una clase.
      System.out.println("El director_comercial es de tipo Jefatura.");
    }

    if(director_comercial instanceof Comparable) { //Instance of te dife si un objeto es una instancia de una clase.
      System.out.println("Implementa la interfaz comparable.");
    }

    System.out.println(jefa_finanzas.tomar_decisiones("Dar m�s d�as de vacaciones a los empleados."));

    // E - VIDEO 50

    for(Empleado e: misEmpleados) {
      e.subeSueldo(5);
    }

    //Ordenando el Array
    Arrays.sort(misEmpleados); //Para usar este m�todo hay que usar la interfaz Comparable en Empleado.

    for(Empleado e: misEmpleados) {
      System.out.println("Nombre: " + e.dameNombre() +
          ". Id: " + e.dameId() +
          ". Sueldo: " + e.dameSueldo() +
          ". Fecha de alta " + e.dameFechaContrato());
    }

  }

}

class Empleado implements Comparable{ //Al decirle a una clase que implemente una interfaz, esta clase debe cumplir con los requisitos que le pide la interfaz, es decir el m�todo de la interfaz comparable.

  //Constructor
  public Empleado(String nom, double sue, int agno, int mes, int dia) {
    nombre = nom;
    sueldo = sue;
    GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
    altaContrato = calendario.getTime();
    ++IdSiguiente;
    Id = IdSiguiente;
  }

  //OTRO M�TODO CONTRUCTOR //SOBRECARGA DE CONSTRUCTORES //VIDEO 39
  public Empleado(String nom) {
    //nombre=nom; // Resultado: Nombre: "Par�metro". Sueldo: 0.0. Fecha de alta: null. //Dar� 0 en todo excepto el par�metro que se le pasa y da null en fecha de alta porque se est� almacenando en una variable de tipo date que es un objeto y cuando no se define un objeto, este es null.
    this(nom, 30000, 2000, 01, 01); //Este this lo que hace es llamar al otro constructor y enviar los valores por defecto que est�n dentro del this
  }

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

  //getter-4
  public int dameId() {
    return Id;
  }

  //setter-1 //M�todo para subir el sueldo.
  public void subeSueldo(double porcentaje) { //Este m�todo va a subir un tanto porciento el sueldo.
    double aumento = sueldo * porcentaje / 100;
    sueldo += aumento;
  }

  //M�todo del implements Comparable
  @Override
  public int compareTo(Object miobjeto) {

    Empleado otroEmpleado = (Empleado) miobjeto; //Casting de Objeto a Empleado.

    if(this.sueldo < otroEmpleado.sueldo) {
      return -1;
    }

    if(this.sueldo > otroEmpleado.sueldo) {
      return 1;
    }

    return 0;

  }

  //PROPIEDADES
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  private int Id;
  private static int IdSiguiente = 1;

}

class Jefatura extends Empleado implements Jefes{

  //Constructor
  public Jefatura(String nom, double sue, int agno, int mes, int dia) {
    super(nom, sue, agno, mes, dia); //Llamando al constructor de la clase padre Empleados //Hay que pasarle los par�metros que requiere: 5 o 1 porque solo hay constructores que acepten esa cantidad de par�metros
  }

  //M�todo obligatorio de la interfaz
  public String tomar_decisiones(String decision) {
    return "Un miembro de la direcci�n ha tomado la decisi�n de: " + decision;
  }

  //setter-a
  public void estableceIncentivo(double b) {
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

}
