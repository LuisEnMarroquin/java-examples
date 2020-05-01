package pi030$POO_Getters_Setters;

public class Pi030$POO_UsoCoche {

  public static void main(String[] args) {

    //Instanciar un objeto de tipo Pi030$POO_Coche
    Pi030$POO_Coche Renault = new Pi030$POO_Coche();

    //getter-1
    System.out.println(Renault.largo_coche());

    //getter-2
    System.out.println(Renault.dime_largo());

    //Instanciar un objeto de tipo Pi030$POO_Coche
    Pi030$POO_Coche Ford = new Pi030$POO_Coche();

    //setter-1
    Ford.establece_color(); //Con esta instrucci�n se modifica el color del coche al que est� en el setter-1 de la otra clase.

    //getter-3
    System.out.println(Ford.dime_color()); //Si no se definiera en el setter-1 el color del coche ser�a 'null' ya que el color no est� definido en el constructor como si lo est�n getter-1 y getter2.

  }

}
