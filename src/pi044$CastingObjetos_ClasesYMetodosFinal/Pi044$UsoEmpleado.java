// CASTING = REFUNDICI�N

//VIDEO 43 - Minuto 4 uso de la barra lateral outline en eclipse
//VIDEO 43 - Minuto 23:25 explica que es el enlazado din�mico

package pi044$CastingObjetos_ClasesYMetodosFinal;
//IMPORTANTE EXPLICACI�N DE LAS VARIABLES EST�TICAS EN EL VIDEO 37 MINUTO 20 //VIDEO 38 MINUTO 12.15 EXPLICA DATOS DEL M�TODO MAIN
//Para usar una variable static hay que usar el nombre de la clase junto a la variable o constante, por ejemplo Math.PI

public class Pi044$UsoEmpleado { //Hay m�s de 1 clase en este programa, por ello solo 1 debe ser p�blica y solo esa debe tener el m�todo main.

  public static void main(String[] args) {

    //Instancia de la clase Jefatura
    /*43-a*/Jefatura jefe_RecursosHumanos = new Jefatura("Nallely", 55000, 2006, 9, 25); //Hay que pasarle 5 par�metros, se puede ver de que tipo es cada uno en el panel derecho outline.
    /*43*/jefe_RecursosHumanos.entableceIncentivo(2578.64); //Incentivo del jefe_RecursosHumanos, a los otros jefes no se les ha asignado incentivo

    /*43*/Empleado [] misEmpleados = new Empleado[6]; //Esto es propio del array para definirlo. Lo importante es cambiar el n�mero cada que se agrege un dato.

    //Estos acceden al primer constructor
    misEmpleados[0] = new Empleado("Luis", 85000, 1990, 12, 17); //Inicialmente no se puede hacer un array con diferentes tipos de datos.
    misEmpleados[1] = new Empleado("Juan", 65000, 1999, 3, 9); //Ahora si se pueden usar diferentes tipos de datos en un array porque se ha creado una clase Empleado (que maneje esos tipos de datos) y un array perteneciente a esa clase Empleado.
    misEmpleados[2] = new Empleado("Manuel", 25000, 2016, 27, 3); //En este array se est� guardando un String, un double y 3 enteros.
    //Estos acceden al segundo contructor
    misEmpleados[3] = new Empleado("Ana"); //Dar� 0 en todo excepto el par�metro que se le pasa y da null en fecha de alta porque se est� almacenando en una variable de tipo date que es un objeto y cuando no se define un objeto, este es null.

    /*43-a*/misEmpleados[4] = jefe_RecursosHumanos; //Polimorfismo: ya que espera un objeto de tipo Empleado pero se puede guardar uno de tipo Jefatura

    /*43-b*/misEmpleados[5] = new Jefatura("Mar�a", 95000, 1999, 5, 26); //Es igual que mis misEmpleados[4] pero con otra sintaxis
    /*44*///misEmpleados[5].estableceIncentivo(); //Esto no se puede hacer porque el array misEmpleados es de tipo Empleado aunque pueda almacenar objetos de tipo Jefatura
    /*44*/Jefatura jefa_finanzas = (Jefatura)misEmpleados[5]; //Refundici�n o Casting
    /*44*/jefa_finanzas.entableceIncentivo(42908);

    /*44*///No se puede hacer Casting de empleado a jefe porque un Jefe siempre es un empleado pero el empleado no siempre es Jefe
    /*44*///Jefatura jefe_compras = (Jefatura)misEmpleados[1];

    System.out.println("Subiendo el sueldo con bucles for each.");

    //setter-1 //Subiendo el sueldo un 5%.
    for(Empleado e: misEmpleados) { //Con bucle for mejorado (bucle for each)
      /*43*/e.subeSueldo(5); //Cuando entra un objeto de tipo Jefatura no entra al constructor de empleado, entra al constructor de Jefatura, esto es el Polimorfismo.
    }

    //getter-1-2-3
    for(Empleado e: misEmpleados) { //Con bucle for mejorado (bucle for each)
      System.out.println("Nombre: " + e.dameNombre() + ". Sueldo: " + e.dameSueldo() + ". Fecha de alta: " + e.dameFechaContrato() + ".");
    }

  }

}
