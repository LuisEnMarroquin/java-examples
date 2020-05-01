package pi161$ProgramacionGenerica; // VIDEO IMPORTANTE

import java.util.GregorianCalendar;

public class Pi166$MetodosGenericos {

  public static void main(String[] args) {

    String nombres[] = { "Jos�", "Mar�a", "Pepe" };

    String elementos = MisMatrices./*<String>*/getElementos(nombres); // El segundo <String> tambi�n se puede poner pero es una instrucci�n redundante ya que el compilador de Java ya sabe que elemento manejar

    System.out.println(elementos);

    // -------------------- Creando nuevo array con Objetos de tipo Empleado (es otra clase que est� en este mismo paquete)

    Empleado nuevoArrayDeEmpleados[] = {
        new Empleado ("Ana", 45, 2500),
        new Empleado ("Juan", 45, 2500),
        new Empleado ("Sof�a", 45, 2500),
        new Empleado ("Miguel", 45, 2500)
    };

    System.out.println(MisMatrices.getElementos(nuevoArrayDeEmpleados));

    // ------------------- Obteniendo el elemento menor del array 'nombres[]'

    System.out.println("El elemento menor (orden alfab�tico) es: " + MisMatrices.getMenor(nombres));

    // ------------------- Obteniendo el elemento menor

    GregorianCalendar fechas[] = {
        new GregorianCalendar(2005, 05, 12),
        new GregorianCalendar(2010, 03, 11)
    };

    System.out.println(MisMatrices.getMenor(fechas));

  }

}

class MisMatrices { // Un m�todo gen�rico puede estar tnaot en una clase normal, como en una clase gen�rica

  // M�todo gen�rico: Es public para acceder desde otras clases, es est�tico para convertirlo en un m�todo de clase y no necesitar una instancia a la clase 'MisMatrices' para usarlo // <T> ArgumentoDeTipo // String = TipoDeDatoQueVaADevolver
  public static <T> String getElementos(T[]a) { // M�todo llamado 'getElementos()' y recibe de par�metros un array de tipo indefinido llamado 'a'
    return "El array tiene " + a.length + " elementos."; // Este m�todo funcionar� con cualquier tipo de array siempre y cuendo no se un array de datos primitivos
  }

  // Todos los arrays que se le pasen a est� m�todo deben implementar la interfaz 'Comparable' = String la implementa, al igual que GregorianCalendar
  public static <T extends Comparable> T getMenor(T[]a) {  // Recibe un argumento de tipo indefinido pero tambien devuelve un objeto de tipo indefinido

    if(a == null || a.length == 0) { // Si el array est� vaci� o tiene una longitud 0
      return null;
    }

    T elementoMenor = a[0];

    for(int i = 1; i<a.length; i++) {
      if(elementoMenor.compareTo(a[i])>0) { // Como el m�todo 'compareTo' implementa la interfaz Comparable hay que ponerlo en la declaracion del m�todo que lo contiene
        elementoMenor = a[i];
      }
    }
    return elementoMenor;

  }

}
