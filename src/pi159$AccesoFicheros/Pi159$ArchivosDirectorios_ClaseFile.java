package pi159$AccesoFicheros; // Una carpeta "D:/TestJava" con archivos y una carpeta con mas archivos adentro es buena para ver como funciona este proyecto

import java.io.*;

public class Pi159$ArchivosDirectorios_ClaseFile {

  public static void main(String[] args) {

    // ----------------- Archivo ----------------------

    File archivo = new File("ejemploArchivo");

    System.out.println("El archivo existe: " + archivo.exists());

    System.out.println("La ruta donde estar�a este archivo es: " + archivo.getAbsolutePath());

    // ----------------- Carpeta ----------------------

    File carpeta = new File("bin");

    System.out.println("La carpeta existe: " + carpeta.exists());

    System.out.println("La ruta donde est� la carpeta es: " + carpeta.getAbsolutePath());

    System.out.println(); // ----------------- ------------------------------

    File ruta = new File("D:/TestJava");

    System.out.println("La ruta donde est� la carpeta es: " + ruta.getAbsolutePath());

    String[] nombresArchivos = ruta.list(); // Almacenando en un array de Strings llamado 'nombresArchivos' todos los nombres de todos los archivos que est�n dentro de la carpeta

    System.out.println("Los archivos de " + ruta.getAbsolutePath() + " son: ");

    for(int i = 0; i < nombresArchivos.length; i++) {

      System.out.println(nombresArchivos[i]);

      // Evaluando si es un archivo o es un directorio
      File f = new File(ruta.getAbsolutePath(), nombresArchivos[i]); // Este constructor de file guarda algo as�: "D:/TestJava/archivo.txt"
      if(f.isDirectory()) { // Evaluendo si f es un folder
        String[] archivosSubcarpeta = f.list(); // Almacenando en un array de Strings llamado 'archivosSubcarpeta' todos los nombres de todos los archivos que est�n dentro de la carpeta
        for(int j = 0 ; j < archivosSubcarpeta.length; j++) {
          System.out.println(" - " + archivosSubcarpeta[j]);
        }
      }


    }

  }

}
