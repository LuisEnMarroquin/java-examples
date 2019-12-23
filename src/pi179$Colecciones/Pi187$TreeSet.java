package pi179$Colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Pi187$TreeSet { // TreeSet permite ordenaciones

	public static void main(String[] args) {
		
		TreeSet<String> ordenaPersonas = new TreeSet<String>(); // Colección de tipo TreeSet
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		System.out.println("Imprimiendo los nombres por orden alfabético por default, y al ser datos de tipo String se implementa la interfaz 'comparable' que tiene el método 'compareTo' que ordena los objetos.");
		for(String s : ordenaPersonas) {
			System.out.println(s);
		}
		
		System.out.println("Ordenando objetos de tipo Articulo2 (orden en base a la interfaz 'Comparable' de acuerdo al número)");
		
		Articulo2 primero = new Articulo2(1, "Primer Artículo");
		Articulo2 segundo = new Articulo2(2, "Segundo Artículo");
		Articulo2 tercero = new Articulo2(3, "Este es el tercer Artículo");

		TreeSet<Articulo2> ordenaArticulos = new TreeSet<Articulo2>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for (Articulo2 art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		
		System.out.println("Ordenando objetos de tipo Articulo2 (en base a la descripcion en orden alfabético)");
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
	
	public String getDescripcion() { // Getter que devuelve la descripción
		return descripcion;
	}

	@Override // Interfaz 'Comparable'
	public int compareTo(Articulo2 o) { // Construyendo mi propio método 'compareTo' para ordenar los objetos de tipo Articulo2
		return numeroArticulo - o.numeroArticulo;
	}
	
	@Override // Interfaz 'Comparator'
	public int compare(Articulo2 arg0, Articulo2 arg1) { // Método para comparar por descripción y no por número(default)
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
	
	private int numeroArticulo;
	private String descripcion;
	
}