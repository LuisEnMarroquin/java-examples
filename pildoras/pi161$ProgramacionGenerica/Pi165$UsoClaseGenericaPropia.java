package pi161$ProgramacionGenerica;

public class Pi165$UsoClaseGenericaPropia {

  public static void main(String[] args) {

    Pi165$ClaseGenericaPropia <String> una = new Pi165$ClaseGenericaPropia <String>(); // Por ahora: primero = null

    una.setPrimero("Este es String"); // Por ahora: primero = "Este es String"

    System.out.println(una.getPrimero());

    // ----------------------------------------

    Persona pers1 = new Persona("Ana");

    Pi165$ClaseGenericaPropia <Persona> otra = new Pi165$ClaseGenericaPropia <Persona>();

    otra.setPrimero(pers1);

    System.out.println(otra.getPrimero()); // Devuelve la referencia a Objeto cuando no se sobreescribe el m�todo '.toString' de la clase 'Object'

  }

}

class Persona {

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String toString() { // Comentar esta sobreescritura del m�todo '.toString()' para ver como se devuelve un objeto
    return nombre;
  }

  private String nombre;

}
