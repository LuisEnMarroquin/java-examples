// Esta clase depende de Pi028$POO_UsoCoche.java

package pi028$POO_Packages; //Por convención los paquetes en Java comienzan con letra minuscula.

//Aquí se colocaría el import.

public class Pi028$POO_Coche { //Comportamiento de un objeto = método()

	//Propiedades
	int ruedas; //Propiedades no encapsuladas, por ello son modificables desde otra clase
	int largo;
	int ancho;
	int motor;
	int peso;
	
	//Método contructor: Para asignar los valores a las propiedades del objeto. //El método contructor es un método especial que se encarga de dar un estado inicial a nuestro objeto.
	public Pi028$POO_Coche() { //El método contructor siempre se debe llamar igual que la clase
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
	} //Cuando se manda a llamar el contructor y se termina de ejecutar lo que está dentro, el flujo de ejecución vuelve a la siguiente linea de la clase principal (En este caso al System.out.println).
		
}