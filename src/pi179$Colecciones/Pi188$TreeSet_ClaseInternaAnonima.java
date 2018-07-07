package pi179$Colecciones; // La idea de este archivo es permitir ordenar objetos de una clase que no implemente la interfaz 'compareTo' (creo que es necesario ver desde el video 186 para entender el porque)

import java.util.Comparator;
import java.util.TreeSet;

public class Pi188$TreeSet_ClaseInternaAnonima { // TreeSet permite ordenaciones

	public static void main(String[] args) {
		
		TreeSet<String> ordenaPersonas = new TreeSet<String>(); // Colección de tipo TreeSet
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		System.out.println("Imprimiendo los nombres por orden alfabético por default, y al ser datos de tipo String se implementa la interfaz 'comparable' que tiene el método 'compareTo' que ordena los objetos.");
		for(String s : ordenaPersonas) {
			System.out.println(s);
		}
		
		System.out.println("Ordenando objetos de tipo Articulo4 (orden en base a la interfaz 'Comparable' de acuerdo al número)");
		
		Articulo4 primero = new Articulo4(1, "Primer Artículo");
		Articulo4 segundo = new Articulo4(2, "Segundo Artículo");
		Articulo4 tercero = new Articulo4(3, "Este es el tercer Artículo");

		TreeSet<Articulo4> ordenaArticulos = new TreeSet<Articulo4>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for (Articulo4 art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		
		System.out.println("Ordenando objetos de tipo Articulo4 (en base a la descripcion en orden alfabético)");
		
		//Articulo4 ComparadorArticulos2 = new Articulo4(); // Objeto de tipo 'Comparator'
		//TreeSet<Articulo4> ordenaArticulos2 = new TreeSet<Articulo4>(ComparadorArticulos2);
		
		//ComparadorArticulos2 comparaArt = new ComparadorArticulos2();
		TreeSet<Articulo4> ordenaArticulos2 = new TreeSet<Articulo4>(new Comparator<Articulo4>() {
			@Override
			public int compare(Articulo4 o1, Articulo4 o2) { // Comparando ambos
				String descripcion1 = o1.getDescripcion();
				String descripcion2 = o2.getDescripcion();
				return descripcion1.compareTo(descripcion2);
			}
		});
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for (Articulo4 art : ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		} 
		
	}
	
}


class Articulo4 implements Comparable<Articulo4>{
	
	public Articulo4(int num, String desc) {
		numeroArticulo = num;
		descripcion  = desc;
	}
	
	public String getDescripcion() { // Getter que devuelve la descripción
		return descripcion;
	}

	@Override // Interfaz 'Comparable'
	public int compareTo(Articulo4 o) { // Construyendo mi propio método 'compareTo' para ordenar los objetos de tipo Articulo4
		return numeroArticulo - o.numeroArticulo;
	}
	
	private int numeroArticulo;
	private String descripcion;
	
}

/*class ComparadorArticulos2 implements Comparator<Articulo4>{

	@Override
	public int compare(Articulo4 o1, Articulo4 o2) { // Comparando ambos
		String descripcion1 = o1.getDescripcion();
		String descripcion2 = o2.getDescripcion();
		return descripcion1.compareTo(descripcion2);
	}
	
}*/