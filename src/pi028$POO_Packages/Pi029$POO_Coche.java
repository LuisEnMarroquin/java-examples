// Esta clase depende de Pi029$POO_UsoCoche.java

package pi028$POO_Packages; //Por convención los paquetes en Java comienzan con letra minuscula.

//Aquí se colocaría el import.

public class Pi029$POO_Coche { //Comportamiento de un objeto = método()

	//Propiedades
	/*private*/ int ruedas; //El private es para que esta propiedad no se pueda modificar desde otra clase.
	int largo;
	int ancho;
	/*private*/ int motor; // Encapsulado
	int peso; // No Encapsulado
	
	//Método contructor: Para asignar los valores a las propiedades del objeto. //El método contructor es un método especial que se encarga de dar un estado inicial a nuestro objeto.
	public Pi029$POO_Coche() { //El método contructor siempre se debe llamar igual que la clase
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
	} //Cuando se manda a llamar el contructor y se termina de ejecutar lo que está dentro, el flujo de ejecución vuelve a la siguiente linea de la clase principal (En este caso al System.out.println).
	
	
	// VIDEO 29
	/*Una forma desaconsejada de hacer lo mismo pero en una única clase. Así esta clase sería independiente y se podría eliminar la otra.
	public static void main (String args[]) {
		Pi029$POO_Coche Renault = new Pi029$POO_Coche(); // INSTANCIAR UNA CLASE / EJEMPLARIZAR UNA CLASE
		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
	}*/
	
}

/* class Camion{
	VIDEO 29 - Creando mas de una clase en el mismo archivo (esto también es posible pero desaconsejado). 
} */

//Siempre tiene que haber una clase pública que es a que dá el nombre al archivo, en este caso es: Pi029$POO_Coche.
//La clase pública es la que debe de tener el método main, y el resto de clases no deben de ser públicas ni tener método main.