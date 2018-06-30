package pi028$POO_Packages;

public class Pi029$POO_UsoCoche {

	public static void main(String[] args) { //En un programa de Java siempre hay solo una única clase que contiene el método main.
		
		//Instanciar una clase - Creando a 2 objetos que pertenecen a la clase Pi029$POO_Coche
		
		//Nom de clase  //Nom Objeto  //Nombre del constructor  //Se dice que Renault es una instancia de la clase Pi029$POO_Coche.
		Pi029$POO_Coche Ford = new Pi029$POO_Coche(); //Esto es Instanciar/Ejemplarizar una clase. 
		//La palabra new lo que hace es llamar al contructor de la otra clase cambiando el flujo de ejecución del programa allá.
		
		// ruedas = 3; //Se puso en la otra clase el módificador de acceso private en la declaración de la varible ruedas para que no se pueda hacer esto desde esta clase.
		
		//Accediendo a las propiedades con la nomenclatura del punto = Objeto.propiedad
		System.out.println("Este coche tiene " + Ford.ruedas + " ruedas.");
	
	}

}
