package pi150$Debugging_Streams_Serializacion; // Es necesario copiar la 'imagen.jpg' a 'C:/' para que este archivo funcione

import java.io.*;

public class Pi155$LecturaEscritura_StreamsByte { // Este prigrama imprime los bytes de los que est� formada la imagen

  public static void main(String[] args) {

    int contador = 0;

    try {

      FileInputStream archivoLectura = new FileInputStream ("C:/imagen.jpg"); // Abriendo stream byte para leer el archivo

      boolean finalArchivo = false;

      while(!finalArchivo) {

        int byteEntrada = archivoLectura.read(); // Aqui se van almacenando los bytes que va leyendo

        if(byteEntrada == -1) // '-1' es lo que devuelve el m�todo read cuando ha acabado de leer el archivo
          finalArchivo = true; // Indica que ya se ha terminado de leer el archivo

        System.out.print(byteEntrada + " ");

        contador++;

      }

      archivoLectura.close(); // Cerrando el flujo de datos

    } catch (IOException e) {

      System.out.println("Hay un error");

    }

    System.out.println("\nHay " + (contador-1) + " bytes en la im�gen."); // 'Contador -1' porque tambi�n toma en cuenta el '-1' que se genera al terminar el archivo

  }

}
