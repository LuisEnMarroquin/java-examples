package pi028$POO_Packages;

public class Pi028$POO_UsoCoche {

  public static void main(String[] args) { //En un programa de Java siempre hay solo una �nica clase que contiene el m�todo main.

    //Instanciar una clase - Creando a 2 objetos que pertenecen a la clase Pi028$POO_Coche

    //Nom de clase  //Nom Objeto  //Nombre del constructor  //Se dice que Renault es una instancia de la clase Pi028$POO_Coche.
    Pi028$POO_Coche Renault = new Pi028$POO_Coche(); //Esto es Instanciar/Ejemplarizar una clase.
    //La palabra new lo que hace es llamar al contructor de la otra clase cambiando el flujo de ejecuci�n del programa all�.

    //Accediendo a las propiedades con la nomenclatura del punto = Objeto.propiedad
    System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

  }

}
