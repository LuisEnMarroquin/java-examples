import java.util.Scanner;

class Pelicula {

    private String idAnterior;
    private String idSiguiente;
    private String id;
    private String name;

    public Pelicula(String idAnterior, String id, String idSiguiente, String name) {
       this.idAnterior = idAnterior;
       this.id = id;
       this.idSiguiente = idSiguiente;
       this.name = name;
    }

    public String getAnterior() {
        return idAnterior;
    }

    public String getID() {
        return id;
    }

    public String getSiguiente() {
        return idSiguiente;
    }

    public String getName() {
        return name;
    }

}

public class ListaCircularDoble {

    public static void main(String[] ar) {

        System.out.println("");

        String valorConsola = "E";
        Scanner entradaTexto = new Scanner(System.in);

        Pelicula p1 = new Pelicula( "4", "1", "2", "Sexo anal" );
        Pelicula p2 = new Pelicula( "1", "2", "3", "Daisy destruction" );
        Pelicula p3 = new Pelicula( "2", "3", "4", "Tijeras" );
        Pelicula p4 = new Pelicula( "3", "4", "1", "La Era de Hielo" );

        Pelicula[] misPeliculasFavoritas = new Pelicula[] { p1, p2, p3, p4 };

        Pelicula peliculaActual = misPeliculasFavoritas[0];

        do {
            System.out.println("Usted esta viendo la pelicula '" + peliculaActual.getName() + "' con ID '" + peliculaActual.getID() + "'");
            System.out.println("Elija una opcion: \n* Pelicula Anterior (A), \n* Pelicula Siguiente (S) \n* Cerrar el Programa (E)");
            valorConsola = entradaTexto.nextLine();

            if (valorConsola.equals("A")) {
                Pelicula peliculaNuevaActual = peliculaActual;
                for (int i = 0; i < misPeliculasFavoritas.length; i++) {
                    Pelicula peliculaNueva = misPeliculasFavoritas[i];
                    if (peliculaNueva.getID().equals(peliculaNuevaActual.getAnterior())) {
                        peliculaActual = peliculaNueva;
                    }
                }
            } else if (valorConsola.equals("S")) {
                Pelicula peliculaNuevaActual = peliculaActual;
                for (int i = 0; i < misPeliculasFavoritas.length; i++) {
                    Pelicula peliculaNueva = misPeliculasFavoritas[i];
                    if (peliculaNueva.getID().equals(peliculaNuevaActual.getSiguiente())) {
                        peliculaActual = peliculaNueva;
                    }
                }
            } else if (valorConsola.equals("E")) {
                System.out.println("Adios");
            } else {
                System.out.println("El valor '" + valorConsola + "' no es valido");
            }

            System.out.println("");
        } while (!valorConsola.equals("E"));

        entradaTexto.close();

    }

}
