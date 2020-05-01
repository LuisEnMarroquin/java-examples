package pi179$Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Pi185$PruebaListaEnlazada {

  public static void main(String[] args) {

    LinkedList<String> paises= new LinkedList<String>();
    paises.add("Espa�a");
    paises.add("Colombia");
    paises.add("M�xico");
    paises.add("Per�");

    LinkedList<String> capitales= new LinkedList<String>();
    capitales.add("Madrid");
    capitales.add("Bogot�");
    capitales.add("Ciudad de M�xico");
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

    iterarCapitales = capitales.listIterator(); // Volviendo a iniciar el iterador porque est� al final de la colecci�n y volviendolo a iniciar vuelve al principio

    while(iterarCapitales.hasNext()) { // Eliminando las posiciones impares (Bogot� y Lima)
      iterarCapitales.next();
      if(iterarCapitales.hasNext()) {
        iterarCapitales.next();
        iterarCapitales.remove();
      }
    }
    System.out.println(capitales); // Solo imprimir� las posiciones pares (Madrid y Ciudad de M�xico)

    paises.removeAll(capitales); // Eliminando toda la colecci�n 'capitales'
    System.out.println(paises); // No imprime 'Madrid' ni 'Ciudad de M�xico' porque fueron eliminadas antes

  }

}
