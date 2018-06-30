package pi004$JavaBasics;
import javax.swing.*;

public class Pi024$Bucle_ForEach_Arrays { //Los arrays solo pueden almacenar datos del mismo tipo

	public static void main(String[] args) {
		
		String paises [] = new String [5]; //Declarando la matríz. // Aquí si empieza a contar desde el 1.
		paises[0]="España"; //Iniciando los valores de la matríz. // Aquí empieza a contar desde el 0.
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		
		System.out.println("Recorriendo la matríz 'paises' con un Bucle For.");
		for(int i=0; i<paises.length; i++) {
			System.out.println("País "+(i+1)+": "+ paises[i]);
		}
		
		System.out.println("");
		
		System.out.println("Recorriendo la matríz 'paises' con un Bucle For Each.");
		int numero = 0;
		for(String elemento:paises) { //Declarando la variable elemento de tipo String (del mismo tipo de la matríz)
			numero++;
			System.out.println("País "+numero+": " + elemento);
		}
		
		System.out.println("");
		
		//Declarando e iniciando en una sola linea.
		String countries [] = { "España", "México", "Colombia", "Perú", "Chile" };
		
		System.out.println("Recorriendo la matríz 'countries' con un Bucle For Each.");
		for(String elemento:countries) {
			System.out.println(elemento);
		}
		
		System.out.println("");
		
		System.out.println("Rellenando la matríz 'lugares' con JOptionPane.");
		String [] lugares = new String[3]; //Habrá 3 lugares dentro de la matríz
		for(int i=0; i<3; i++) {
			lugares[i]= JOptionPane.showInputDialog("Introduce lugar " + (i+1) + " de 3.");
		}
		for(String elemento:lugares) {
			System.out.println(elemento);
		}
		
		System.out.println("");
		
		System.out.println("Rellenando la matriz 'aleatorios' con números aleatorios.");
		int aleatorios [] = new int[25];
		for(int i=0; i<aleatorios.length; i++) { //aleatorios.length es el número declarado dentro de los parentesis de la linea de arriba.
			aleatorios[i] = (int)Math.round(Math.random()*100); //Obtiene enteros entre 0 y 100
		}
		for(int numeros:aleatorios) {
			System.out.print(numeros + " ");
		}
		
	}

}
