package pi179$Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Pi185$PruebaListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises= new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales= new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("Ciudad de México");
		capitales.add("Lima");
		
		System.out.print(paises); System.out.println(capitales);

		ListIterator<String> iterarPaises = paises.listIterator();
		ListIterator<String> iterarCapitales = capitales.listIterator();
		
		while(iterarCapitales.hasNext()) { // Creando una sola lista a partir de las 2
			if(iterarPaises.hasNext()) { // Si la lista 'paises' tiene un siguiente elemento
				iterarPaises.next();
			}
			iterarPaises.add(iterarCapitales.next());
		}
		
		System.out.println(paises);
		
		iterarCapitales = capitales.listIterator(); // Volviendo a iniciar el iterador porque está al final de la colección y volviendolo a iniciar vuelve al principio
		
		while(iterarCapitales.hasNext()) { // Eliminando las posiciones impares (Bogotá y Lima)
			iterarCapitales.next();
			if(iterarCapitales.hasNext()) {
				iterarCapitales.next();
				iterarCapitales.remove();
			}
		}
		System.out.println(capitales); // Solo imprimirá las posiciones pares (Madrid y Ciudad de México)
		
		paises.removeAll(capitales); // Eliminando toda la colección 'capitales'
		System.out.println(paises); // No imprime 'Madrid' ni 'Ciudad de México' porque fueron eliminadas antes
		
	}

}
