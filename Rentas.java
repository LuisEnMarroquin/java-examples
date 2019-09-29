import java.util.Scanner;

public class Rentas {
  public static void main(String[] args) {
    Scanner in = new Scanner( System.in );
    // char s[] = {'*','#','#','#','#','#','#','#','#','#'};
    int ind = 0;

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

      System.out.print("Ingresa una instrucción por favor: ");
      String entrada = in.nextLine();

      if (entrada.equals("U") || entrada.equals("u")) { break; }

      if (entrada.equals("T") || entrada.equals("t")) { break; }

      Videojuego V1 = new Videojuego("Mario Kart 8", 50, 7, "Wii", 1);
      System.out.println(V1.estaRentado());

    }

    in.close();
    System.out.println("Programa terminado");
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

	public String estaRentado() { // Getter
		return nombre;
	}

}