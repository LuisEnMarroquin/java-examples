package examples;

import java.util.Scanner;

public class Blockbuster {
  public static void main(String[] args) {
    Scanner in = new Scanner( System.in );

    Pelicula P1 = new Pelicula("IT 2", 50, 6, "Terror", 2019, 0);
    Pelicula P2 = new Pelicula("Avengers Endgame", 70, 8, "Acción", 2019, 1);
    Pelicula P3 = new Pelicula("IT 2", 50, 7, "Terror", 2019, 0);
    Videojuego V1 = new Videojuego("Mario Kart 8", 50, 7, "Wii", 1);
    Videojuego V2 = new Videojuego("Halo 5", 90, 8, "Xbox One", 1);
    Videojuego V3 = new Videojuego("Spider Man", 80, 9, "Play Station 4", 0);

    System.out.println("***********************************************");
    System.out.println("**************** Instrucciones ****************");
    System.out.println("* T/t: Despliega todos los productos.");
    System.out.println("* P/p: Despliega todas las películas.");
    System.out.println("* V/v: Despliega todos los videojuegos.");
    System.out.println("* S/s: Checar si una película está rentada.");
    System.out.println("* J/j: Verifica si un videojuego está o no rentado.");
    System.out.println("* C/c: Devuelve la cantidad de películas que están rentadas.");
    System.out.println("* X/x: Indica la cantidad de videojuegos cuya plataforma es Xbox One.");
    System.out.println("* U/u: Termina el programa.");
    System.out.println("***********************************************");

    while (true) {

      System.out.print("# Ingresa una instrucción por favor: ");
      String entrada = in.nextLine();

      if (entrada.equals("U") || entrada.equals("u")) { break; }

      if (entrada.equals("T") || entrada.equals("t")) {
        System.out.println("* Todos los productos");
        P1.mostrarDatos();
        P2.mostrarDatos();
        P3.mostrarDatos();
        V1.mostrarDatos();
        V2.mostrarDatos();
        V3.mostrarDatos();
      }

      if (entrada.equals("P") || entrada.equals("p")) {
        System.out.println("* Todas las peliculas");
        P1.mostrarDatos();
        P2.mostrarDatos();
        P3.mostrarDatos();
      }

      if (entrada.equals("V") || entrada.equals("v")) {
        System.out.println("* Todos los videojuegos");
        V1.mostrarDatos();
        V2.mostrarDatos();
        V3.mostrarDatos();
      }

      if (entrada.equals("S") || entrada.equals("s")) {
        System.out.println("* Peliculas rentadas");
        P1.estaRentado();
        P2.estaRentado();
        P3.estaRentado();
      }

      if (entrada.equals("J") || entrada.equals("j")) {
        System.out.println("* Videojuegos rentados");
        V1.estaRentado();
        V2.estaRentado();
        V3.estaRentado();
      }

      if (entrada.equals("C") || entrada.equals("c")) {
        int r1 = P1.estaRentado();
        int r2 = P2.estaRentado();
        int r3 = P3.estaRentado();
        int res = r1 + r2 + r3;
        System.out.println("* Cantidad de peliculas rentadas: " + res);
      }

      if (entrada.equals("X") || entrada.equals("x")) {
        int r1 = V1.estaRentado();
        int r2 = V2.estaRentado();
        int r3 = V3.estaRentado();
        int res = r1 + r2 + r3;
        System.out.println("* Cantidad de videojuegos de Xbox One: " + res);
      }

    }

    in.close();
    System.out.println("Programa terminado");
  }
}

class Pelicula {

  private String nombre;
  private int costoRenta;
  private int dias;
  private String genero;
  private int agno;
  private int rentado; // 0 || 1

  public Pelicula(String a1, int a2, int a3, String a4, int a5, int a6) { // Constructor
    nombre = a1;
    costoRenta = a2;
    dias = a3;
    genero = a4;
    agno = a5;
    rentado = a6;
  }

  public String mostrarDatos() {
    System.out.println("Nombre: " + nombre + ", costo: $" + costoRenta + ", dias: " + dias + ", genero: " + genero + ", año: " + agno + ", rentado: " + rentado); return "";
  }

  public int estaRentado() {
    if (rentado == 1) System.out.println(nombre); return rentado;
  }

}

class Videojuego {

  private String nombre;
  private int costoRenta;
  private int dias;
  private String plataforma;
  private int rentado; // 0 || 1

  public Videojuego(String a1, int a2, int a3, String a4, int a5) { // Constructor
    nombre = a1;
    costoRenta = a2;
    dias = a3;
    plataforma = a4;
    rentado = a5;
  }

  public String mostrarDatos() {
    System.out.println("Nombre: " + nombre + ", costo: $" + costoRenta + ", dias: " + dias + ", plataforma: " + plataforma + ", rentado: " + rentado); return "";
  }

  public int estaRentado() {
    if (rentado == 1) System.out.println(nombre); return rentado;
  }

  public int esXBOX() {
    if (plataforma.equals("Xbox One")) return 1;
    else return 0;
  }

}
