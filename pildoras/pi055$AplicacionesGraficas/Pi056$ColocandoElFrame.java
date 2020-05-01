package pi055$AplicacionesGraficas;

import javax.swing.*;

public class Pi056$ColocandoElFrame {

  public static void main(String[] args) {

    //Instanciando al clase miMarco
    miMarco2 marco1 = new miMarco2();

  }

}

class miMarco2 extends JFrame{ //Heredando de JFrame que viene en javax.swing.*;

  //Constructor
  public miMarco2() { //M�todo de la clase JFrame.

    setVisible(true); //Haciendo la ventana visible Inicialmente las ventanas de Java son invisibles.

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Haciendo que termine la ejecuci�n al cerrar la ventana.

    //setSize(500,300); //Inicialmente las ventanas tienen un tama�o inutil de 0*0 pixeles.
    //setLocation(500,300); //Poniendo la ubicaci�n de la ventana en 'x=500' y 'y=300' considerando la esquina superior izquierda como '0,0' //VIDEO 56 min 6.

    //Se puede prescindir de 'setSize' y 'setLocation' usando 'setBounds' que hace lo mismo que esas
    setBounds(500, 300, 550, 250);

    //setResizable(false); //Para definir si la ventana se puede redimensionar o no.

    //setExtendedState(Frame.MAXIMIZED_BOTH); //Para que se abra a pantalla completa. //MAXIMIZED_BOTH es 'static' por eso se usa el nombre de la clase antes

    setTitle("Minecraft");

  }

}
