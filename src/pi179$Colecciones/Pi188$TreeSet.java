package pi179$Colecciones; // La idea de este archivo es permitir ordenar objetos de una clase que no implemente la interfaz 'compareTo' (creo que es necesario ver desde el video 186 para entender el porque)

import java.util.Comparator;
import java.util.TreeSet;

public class Pi188$TreeSet { // TreeSet permite ordenaciones

	public static void main(String[] args) {
		
		TreeSet<String> ordenaPersonas = new TreeSet<String>(); // Colección de tipo TreeSet
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		System.out.println("Imprimiendo los nombres por orden alfabético por default, y al ser datos de tipo String se implementa la interfaz 'comparable' que tiene el método 'compareTo' que ordena los objetos.");
		for(String s : ordenaPersonas) {
			System.out.println(s);
		}
		
		System.out.println("Ordenando objetos de tipo Articulo3 (orden en base a la interfaz 'Comparable' de acuerdo al número)");
		
		Articulo3 primero = new Articulo3(1, "Primer Artículo");
		Articulo3 segundo = new Articulo3(2, "Segundo Artículo");
		Articulo3 tercero = new Articulo3(3, "Este es el tercer Artículo");

		TreeSet<Articulo3> ordenaArticulos = new TreeSet<Articulo3>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for (Articulo3 art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		
		System.out.println("Ordenando objetos de tipo Articulo3 (en base a la descripcion en orden alfabético)");
		
		//Articulo3 comparadorArticulos = new Articulo3(); // Objeto de tipo 'Comparator'
		//TreeSet<Articulo3> ordenaArticulos2 = new TreeSet<Articulo3>(comparadorArticulos);
		
		ComparadorArticulos comparaArt = new ComparadorArticulos();
		TreeSet<Articulo3> ordenaArticulos2 = new TreeSet<Articulo3>(comparaArt);
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for (Articulo3 art : ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		} 
		
	}
	
}


class Articulo3 implements Comparable<Articulo3>{
	
	public Articulo3(int num, String desc) {
		numeroArticulo = num;
		descripcion  = desc;
	}
	
	public String getDescripcion() { // Getter que devuelve la descripción
		return descripcion;
	}

	@Override // Interfaz 'Comparable'
	public int compareTo(Articulo3 o) { // Construyendo mi propio método 'compareTo' para ordenar los objetos de tipo Articulo3
		return numeroArticulo - o.numeroArticulo;
	}
	
	private int numeroArticulo;
	private String descripcion;
	
}

class ComparadorArticulos implements Comparator<Articulo3>{

	@Override
	public int compare(Articulo3 o1, Articulo3 o2) { // Comparando ambos
		String descripcion1 = o1.getDescripcion();
		String descripcion2 = o2.getDescripcion();
		return descripcion1.compareTo(descripcion2);
	}
	
}