package pi179$Colecciones;

public class Pi181$UsoLibro_MetodosEqualsHashcode {

  public static void main(String[] args) {

    Libro libro1 = new Libro("Programando en Java", "Luis Marroqu�n", 25);

    Libro libro2 = new Libro("Programando en Java", "Luis Marroqu�n", 25);

    if(libro1.equals(libro2)) {
      System.out.println("Es el mismo libro");
    } else {
      System.out.println("No es el mismo libro"); // Dir� esto porque hay que sobreescribir el m�todo equals (se hace en ejemplos siguientes)
    }

  }

}

class Libro {

  public Libro(String titulo, String autor, int ISBN) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
  }

  public String getDatos() {
    return "El t�tulo es :" + titulo + ". El autor es: " + autor + ". El ISBN es; " + ISBN + ".";
  }

  private String titulo;
  private String autor;
  private int ISBN;

}
