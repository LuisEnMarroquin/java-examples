package pildoras;
//IMPORTANTE EXPLICACI�N DE LAS VARIABLES EST�TICAS EN EL VIDEO 37 MINUTO 20 //VIDEO 38 MINUTO 12.15 EXPLICA DATOS DEL M�TODO MAIN
//Para usar una variable static hay que usar el nombre de la clase junto a la variable o constante, por ejemplo Math.PI

public class Pi036$Final_Static {

  public static void main(String[] args) { //Al m�todo main se le pasa de par�metro un Array de Strings llamado args

    Empleados trabajador1 = new Empleados("Paco");
    System.out.println(trabajador1.devuelveDatos());
    trabajador1.cambiaSeccion("Recursos Humanos");
    System.out.println(trabajador1.devuelveDatos());

    System.out.println(); //Empleados.Id++; //Para usar una variable est�tica hay que poner primero el nombre de la clase.

    Empleados trabajador2 = new Empleados("Juan");
    System.out.println(trabajador2.devuelveDatos());

    Empleados trabajador3 = new Empleados("Ana");
    trabajador3.cambiaSeccion("Ventas");
    System.out.println(trabajador3.devuelveDatos());

    Empleados trabajador4 = new Empleados("Dariel");
    System.out.println(trabajador4.devuelveDatos());

    //Llamando al m�todo est�tico: dameIdSiguiente() //Como no operan con objetos, si no que pertenecen a la clase se mandan a llamar como a las variables o constantes est�ticas.
    System.out.println(Empleados.dameIdSiguiente()); //Se mandan a llamar como: NombreDeLaClase.M�todo() //Video38

  }

}

//Clase que construye empleados que tienen un nombre y una secci�n a la que pertenecen dentro de la empresa.

class Empleados{

  //Constructor
  public Empleados(String nom) {
    nombre = nom;
    seccion = "Administraci�n";

    Id=IdSiguiente;
    IdSiguiente++;
  }

  //setter-1
  public void cambiaSeccion(String seccion/*B*/) {
    this.seccion/*A*/ = seccion/*B*/; //La que lleva el .this corresponde a las propiedades y la otra corresponde al par�metro que se la pasa a la funci�n (argumento).
  }

  //getter-1
  public String devuelveDatos() {
    return "El nombre es: " + nombre + ", la secci�n es " + seccion + " y su ID es " + Id + ".";
  }

  //setter-2
  /* public void cambiaNombre(String nombre) {
    this.nombre = nombre;
  } */

  //M�todo est�tico //VIDEO 38
  public static String dameIdSiguiente() {
    return "El ID siguiente es: " + IdSiguiente;
  }

  //Propiedades
  private final String nombre; //Ahora nombre no es modificable por el setter-2
  private String seccion/*A*/;
  //Propiedad static
  private int Id; //Cada objeto tiene su copia de nombre, seccion e id pero nadie tiene una copia de IdSiguiente porque es static
  private static int IdSiguiente = 1; //EST� EN CURSIVA - La variable IdSiguiente no pertenece a ningun objeto, pertenece a la propia clase.
  /*Explicaci�n de static: Cuando se hace una instancia de esta clase se hace una copia de todos los m�todos y propiedades, es decir que cada
   * trabajador tiene una copia de la variable nombre y de la variable seccion, pero como se le puso la palabra revervada static a id ambos,
   * trabajador1 y trabajador2 tienen la misma variable Id */

}

//De este archivo son est�ticos:
  //M�todo: dameIdSiguiente()
  //Variable: IdSiguiente.
