package pi150$Debugging_Streams_Serializacion; // Es necesario copiar la 'imagen.jpg' a 'D:/' para que este archivo funcione // No se puede en 'C:/' porqué está protegido

import java.io.*; 

public class Pi156$LecturaEscritura_StreamsByte { // Este prigrama imprime los bytes de los que está formada la imagen

	public static void main(String[] args) {
		
		int contador = 0;
		
		int datosEntrada[] = new int [808]; // Array para guardar todos los bytes de la imagen // 808 porque son los bytes que tiene la imágen
		
		try {
			
			FileInputStream archivoLectura = new FileInputStream ("D:/imagen.jpg"); // Abriendo stream byte para leer el archivo
		
			boolean finalArchivo = false;
			
			while(!finalArchivo) {
				
				int byteEntrada = archivoLectura.read(); // Aqui se van almacenando los bytes que va leyendo
				
				if(byteEntrada != -1)
					datosEntrada[contador] = byteEntrada;
				else // '-1' es lo que devuelve el método read cuando ha acabado de leer el archivo
					finalArchivo = true; // Indica que ya se ha terminado de leer el archivo
				
				System.out.print(datosEntrada[contador] + " ");
				
				contador++;
			
			}
		
			archivoLectura.close(); // Cerrando el flujo de datos 
			
		} catch (IOException e) {
			
			System.out.println("Error al acceder al archivo");
			
		}

		System.out.println("\nHay " + (contador-1) + " bytes en la imágen."); // 'Contador -1' porque también toma en cuenta el '-1' que se genera al terminar el archivo
		
		creaFichero(datosEntrada); // Crear fichero apartir del array
		
	}
	
	// Nuevo método // Es estático porque la llamada se hace desde el main que también es estático // void porque no devuelve nada // Recibe de parámetro un array de 'int' al que se le da el nombre de 'datosNuevoFichero'
	static void creaFichero(int datosNuevoFichero[]) {
		
		try {
			
			FileOutputStream ficheroNuevo = new FileOutputStream("D:/imagenCopia.jpg"); // 'FileOutputStream' para sacar datos del programa
			
			for(int i = 0; i < datosNuevoFichero.length; i++) {
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
			
			ficheroNuevo.close(); // Cerrando el flujo de datos
			
		} catch (IOException e) {
			
			System.out.println("Error al crear el archivo");
			
		}
		
	}

}
