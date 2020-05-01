package pi179$Colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Pi187$TreeSet { // TreeSet permite ordenaciones

  public static void main(String[] args) {

    TreeSet<String> ordenaPersonas = new TreeSet<String>(); // Colecci�n de tipo TreeSet
    ordenaPersonas.add("Sandra");
    ordenaPersonas.add("Amanda");
    ordenaPersonas.add("Diana");
    System.out.println("Imprimiendo los nombres por orden alfab�tico por default, y al ser datos de tipo String se implementa la interfaz 'comparable' que tiene el m�todo 'compareTo' que ordena los objetos.");
    for(String s : ordenaPersonas) {
      System.out.println(s);
    }

    System.out.println("Ordenando objetos de tipo Articulo2 (orden en base a la interfaz 'Comparable' de acuerdo al n�mero)");

    Articulo2 primero = new Articulo2(1, "Primer Art�culo");
    Articulo2 segundo = new Articulo2(2, "Segundo Art�culo");
    Articulo2 tercero = new Articulo2(3, "Este es el tercer Art�culo");

    TreeSet<Articulo2> ordenaArticulos = new TreeSet<Articulo2>();
    ordenaArticulos.add(tercero);
    ordenaArticulos.add(primero);
    ordenaArticulos.add(segundo);

    for (Articulo2 art : ordenaArticulos) {
      System.out.println(art.getDescripcion());
    }

    System.out.println("Ordenando objetos de tipo Articulo2 (en base a la descripcion en orden alfab�tico)");
    Articulo2 comparadorArticulos = new Articulo2(); // Objeto de tipo 'Comparator'

    TreeSet<Articulo2> ordenaArticulos2 = new TreeSet<Articulo2>(comparadorArticulos);
    ordenaArticulos2.add(primero);
    ordenaArticulos2.add(segundo);
    ordenaArticulos2.add(tercero);

    for (Articulo2 art : ordenaArticulos2) {
      System.out.println(art.getDescripcion());
    }

  }

}


class Articulo2 implements Comparable<Articulo2>, Comparator<Articulo2>{

  public Articulo2() {

  }

  public Articulo2(int num, String desc) {
    numeroArticulo = num;
    descripcion  = desc;
  }

  public String getDescripcion() { // Getter que devuelve la descripci�n
    return descripcion;
  }

  @Override // Interfaz 'Comparable'
  public int compareTo(Articulo2 o) { // Construyendo mi propio m�todo 'compareTo' para ordenar los objetos de tipo Articulo2
    return numeroArticulo - o.numeroArticulo;
  }

  @Override // Interfaz 'Comparator'
  public int compare(Articulo2 arg0, Articulo2 arg1) { // M�todo para comparar por descripci�n y no por n�mero(default)
    String descripcionA = arg0.getDescripcion();
    String descripcionB = arg1.getDescripcion();
    return descripcionA.compareTo(descripcionB);
  }

  private int numeroArticulo;
  private String descripcion;

}
