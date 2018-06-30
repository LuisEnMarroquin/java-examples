package pi159$AccesoFicheros; // Una carpeta "D:/TestJava" con archivos y una carpeta con mas archivos adentro es buena para ver como funciona este proyecto

import java.io.*;

public class Pi160$CreandoEliminandoArchivosCarpetas { // Solucionando problemas con diferentes SO con el uso de '/' o '\' en los 'path' con 'File.separator' // VIDEO 160 INICIO

	public static void main(String[] args) {
		
		// Creando un nuevo directorio
		File folder = new File("D:" + File.separator + "TestJava" + File.separator + "nuevo directorio");
		folder.mkdir();
		
		// Creando un nuevo archivo
		File archivo = new File("D:" + File.separator + "TestJava" + File.separator + "nuevo archivo.txt");
		try {
			archivo.createNewFile();
		} catch (IOException e) {
			System.out.println("No se puede crear el archivo");
			e.printStackTrace();
		}
		
		// Escribiendo en un nuevo archivo
		String archivoDestino = archivo.getAbsolutePath(); // Guardando el path del archivo en el String 'archivoDestino'
		Escribiendo accede = new Escribiendo(); // Instancia a clase 'Escribiendo' llamada 'accede'
		accede.escribir(archivoDestino); // Llamando al método '.escribir()' de la clase 'Escribiendo'
		
		// Creando un nuevo archivo
		File archivoNuevo = new File("D:" + File.separator + "TestJava" + File.separator + "eliminar.txt");
		try {
			archivoNuevo.createNewFile();
		} catch (IOException e) {
			System.out.println("No se puede crear el archivo");
			e.printStackTrace();
		}
		
		// Eliminando un archivo
		archivoNuevo.delete();
	}

}

class Escribiendo {
	
	public void escribir(String rutaArchivo) {
		
		String frase = "Esto es un ejemplo de texto dentro de un archivo";
		
		try {
			
			FileWriter escritura = new FileWriter(rutaArchivo); // Indica que se va a escribir en el archivo que esté en esa ruta
			
			for(int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i)); // Escribiendo lo que haya en el String 'frase' en el archivo caracter a caracter
			}
			
			escritura.close();
			
		} catch (IOException e) {
			
			System.out.println("Error escribiendo en el archivo");
			
		}
		
	}
	
}
