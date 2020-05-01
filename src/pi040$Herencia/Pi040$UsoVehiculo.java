package pi040$Herencia;

//import javax.swing.*;

public class Pi040$UsoVehiculo {

  public static void main(String[] args) {

    //Instancia a la clase Pi040$Coche                /ElegidoAhora
    Pi040$Coche micoche1 = new Pi040$Coche(); // NombreDeLaClase NombreDelObjeto = new NombreDelM�todoConstructor().

    micoche1.establece_color("Rojo");

    //Instancia a la clase Pi040$Furgoneta
    Pi040$Furgoneta mifurgoneta1 = new Pi040$Furgoneta(7, 580); //Hay que pasarle 2 par�metos afuerza porque en la clase Pi040$Furgoneta se pudo as�

    mifurgoneta1.establece_color("Azul");

    mifurgoneta1.configura_asientos("si");

    mifurgoneta1.configura_climatizador("si");

    //Imprimiendo datos en consola
    System.out.println(micoche1.dime_datos_generales() + micoche1.dime_color());
    System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());

  }

}
