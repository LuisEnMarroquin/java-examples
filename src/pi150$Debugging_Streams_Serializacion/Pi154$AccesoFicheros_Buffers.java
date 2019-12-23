package pi150$Debugging_Streams_Serializacion; // Buffer = Informacion Intermedia entre al archivo de texto y el programa Java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pi154$AccesoFicheros_Buffers {

	public static void main(String[] args) {
		
		LeerFicheros accediendo = new LeerFicheros();
		
		accediendo.leer();

	}

}

class LeerFicheros {
	
	public void leer() {
		
		try {
			
			FileReader entrada = new FileReader("C:/Users/Chimney/Dropbox/eclipse/workspace/Pildoras/src/pi150$Debugging_Streams/Pi052Acceso.txt"); // To autocreate try catch choose "Surround with try-catch" in Eclipse
			
			BufferedReader myBuffer = new BufferedReader(entrada); // Storing on a buffer the file
			
			String linea = "";
			
			while(linea != null) { // This is because 'linea' will return 'null' when it finishes to read the file
				
				linea = myBuffer.readLine();
				
				if(linea != null) // Only print it when 'linea' != 'null'
					System.out.println(linea);
				
			} 
			
			entrada.close(); // Explication of why this is not inside a finally on video 153

		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
			
		} 
		
	}
	
}

// Escribir en un Buffer = 'BufferedReader' and 'BufferedWritter'