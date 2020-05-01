package pi150$Debugging_Streams_Serializacion; // This creates on disk 'D:/' a file called 'nuevo.txt' with some text on it

import java.io.*;


public class Pi153$AccesoFicheros_Streams {

  public static void main(String[] args) {

    Escribiendo accediendo = new Escribiendo();

    accediendo.escribir();

  }

}

class Escribiendo {

  public void escribir() {

    String frase = "Esto es una prueba de escritura";

    try {

      FileWriter escritura = new FileWriter("D:/nuevo.txt"/*, true*/); // What's on the comment /**/ is to write on a existing file

      for(int i = 0; i < frase.length(); i++) {
        escritura.write(frase.charAt(i));
      }

      escritura.close();

    } catch (IOException e) {
      System.out.println("E");
    }

  }

}
