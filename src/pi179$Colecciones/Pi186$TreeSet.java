package pi179$Colecciones;

import java.util.TreeSet;

public class Pi186$TreeSet { // TreeSet permite ordenaciones

  public static void main(String[] args) {

    TreeSet<String> ordenaPersonas = new TreeSet<String>(); // Colecci�n de tipo TreeSet
    ordenaPersonas.add("Sandra");
    ordenaPersonas.add("Amanda");
    ordenaPersonas.add("Diana");
    System.out.println("Imprimiendo los nombres por orden alfab�tico por default, y al ser datos de tipo String se implementa la interfaz 'comparable' que tiene el m�todo 'compareTo' que ordena los objetos.");
    for(String s : ordenaPersonas) {
      System.out.println(s);
    }

    System.out.println("Ordenando objetos de tipo Articulo (orden en base a la interfaz 'Comparable' de acuerdo al n�mero)");

    Articulo primero = new Articulo(1, "Primer Art�culo");
    Articulo segundo = new Articulo(2, "Segundo Art�culo");
    Articulo tercero = new Articulo(3, "Tercer Art�culo");

    TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
    ordenaArticulos.add(tercero);
    ordenaArticulos.add(primero);
    ordenaArticulos.add(segundo);

    for (Articulo art : ordenaArticulos) {
      System.out.println(art.getDescripcion());
    }

  }

}


class Articulo implements Comparable<Articulo>{

  public Articulo(int num, String desc) {
    numeroArticulo = num;
    descripcion  = desc;
  }

  public String getDescripcion() { // Getter que devuelve la descripci�n
    return descripcion;
  }

  @Override // Construyendo mi propio m�todo 'compareTo' para ordenar los objetos de tipo articulo
  public int compareTo(Articulo o) {
    return numeroArticulo - o.numeroArticulo;
  }

  private int numeroArticulo;
  private String descripcion;

}
