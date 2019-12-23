package pi004$JavaBasics;
// Tipos Enúmerados / Clase Enum
import java.util.*;

public class Pi048$ClaseEnum_UsoTallas {
	
	enum Talla{
		SMALL("S"), MEDIUM("M"), LARGE("L"); //Son los valores que admite el enum.
		
		//Constructor //setter-1
		private Talla(String abreviatura) { //El constructor dentro de un enum no se puede instanciar y se debe poner como private.
			this.abreviatura = abreviatura;
		}
		
		//getter-1
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		//Propiedades
		private String abreviatura;
	}
	
	//Cuando se declara un tipo enúmerado se debe hacer siempre fuera del main.
	//enum Talla {SMALL, MEDIUM, LARGE}
	//talla = "azul"; //Los tipos enúmerados son para que no se pueda poner en una variable un valor que no tenga nada que ver.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Talla: SMALL, MEDIUM, LARGE");
		String entrada_datos = entrada.next().toUpperCase(); //Poniendo la consola a la espera de que se introduzca algo y pasandolo a Upper Case.
		entrada.close();
		
		//Esto es una declaración de una variable de tipo talla.
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla: " + la_talla);
		
		System.out.println("Abreviatura: " + la_talla.dameAbreviatura());
		
		/*Talla s = Talla.SMALL;
		Talla m = Talla.MEDIUM;
		Talla l = Talla.LARGE;*/
		//Talla x = Talla.EXTRA; //Esto no se permite porque no está en el tipo enúmerado.
		
	}

}
