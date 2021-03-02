import java.util.Scanner;

class FindStartMusic{
  public static void main(String args[]){

    Scanner entrada = new Scanner(System.in);

    String[] canciones = { "Bichota", "Chicharron", "Cancion" };

    System.out.println("\nEstan estas canciones disponibles para buscar");
    for (int i = 0; i < canciones.length; i++) {
      String x = canciones[i];
      System.out.println(" - " + x);
    }

    System.out.println("\nIntroduce las iniciales de la musica que deseas buscar");
    String inicialCancion = entrada.nextLine();

    System.out.println("\nBuscando la musica que comienza con: " + inicialCancion);

    for (int i = 0; i < canciones.length; i++) {
      String x = canciones[i];
      if (x.startsWith(inicialCancion)) System.out.println(" - " + x);
    }

    entrada.close();

  }
}
