package pi150$Debugging_Streams_Serializacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pi152$AccesoFicheros_Streams {

  public static void main(String[] args) {

    LeerFichero accediendo = new LeerFichero();

    accediendo.leer();

  }

}

class LeerFichero {

  public void leer() {

    try {

      FileReader entrada = new FileReader("C:/Users/Chimney/Dropbox/eclipse/workspace/Pildoras/src/pi150$Debugging_Streams/Pi052Acceso.txt"); // To autocreate try catch choose "Surround with try-catch" in Eclipse
      int c = entrada.read();

      while(c != -1) { // This is because the method 'read()' returns a '-1' when it finish to read the file

        char letra = (char)c;

        System.out.print(letra);

        c = entrada.read(); // Returns the unicode code of all the text inside the file
        //System.out.print(c + " "); // This instruction shows unicode characters

      }

      entrada.close(); // Explication of why this is not inside a finally on video 153

    } catch (IOException e) {

      System.out.println("No se ha encontrado el archivo");
      e.printStackTrace();

    }

  }

}

// Flujo de Bytes: InputStream (Abstract) and OutputStream (Abstract)
// Secuencia de Bytes: Reader (Abstract) and Writer (Abstract)
