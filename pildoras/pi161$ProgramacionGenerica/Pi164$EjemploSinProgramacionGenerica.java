package pi161$ProgramacionGenerica; // No seguir lo que se hace en este archivo, mejor usar la Programaci�n Gen�rica

import java.io.File; // Incluye ERROR EN TIEMPO DE EJECUCI�N

public class Pi164$EjemploSinProgramacionGenerica { // Sin usar 'MyArrayList'

  public static void main(String[] args) {

    MyArrayList personas = new MyArrayList(4);

    personas.add("Juan");

    personas.add("Ana");

    personas.add("Mar�a");

    personas.add("Sa�l");

    String nombrePersona = (String)personas.get(2); // Almacenando lo que hay en al posici�n 2 del 'Array'
    System.out.println(nombrePersona);

    // ------------------------------------------------

    MyArrayList archivos = new MyArrayList(4);

    archivos.add(new File("gestion.accdb")); // Guardando objetos de tipo file en el array

    String nombreArchivo = (String)archivos.get(0); // Almacenando lo que hay en al posici�n 0 del 'Array'
    System.out.println(nombreArchivo);


  }

}

class MyArrayList {

  public MyArrayList(int z) { // Si a este constructor se le pase un 3 se le estar�a diciendo que el array 'datosElemento' tiene 3 elementos
    datosElemento = new Object[z];
  }

  public Object get(int i) { // Si a este m�todo se le pasa un 1 devolver� el elemento de la posici�n 1 del array 'datosElemento'
    return datosElemento[i];
  }

  public void add(Object o) { // Si a este m�todo se le pasa un Objeto con 4 elementos, estos elementos se almacenaran en la posici�n 0, 1, 2 y 3 del Array
    datosElemento[i] = o;
    i++;
  }

  private Object[] datosElemento;
  private int i = 0;

}
