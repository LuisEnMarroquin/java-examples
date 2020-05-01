package pi065$Eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color; //Hay muchas clases 'Color' en diferentes paquetes.
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Pi076$MultiplesFuentes {

public static void main(String[] args) {

    MarcoAccion marco = new MarcoAccion();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class MarcoAccion extends JFrame{

  public MarcoAccion() {

    setTitle("Prueba Acciones");

    setBounds(600,350,600,300);

    PanelAccion lamina = new PanelAccion();

    add(lamina);

  }

}

class PanelAccion extends JPanel{

  //Como los bot�nes se van a usar dentro del panel se declaran aqu�
  public PanelAccion() {

    //Instancia
    AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.YELLOW);
    AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.BLUE);
    AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.RED);

    //Esta forma de construir objetos requiere un objeto perteneciente a la clase Action
    JButton botonAmarillo = new JButton(accionAmarillo); add(botonAmarillo); //Nueva forma de construir los botones
    add(new JButton(accionAzul)); //Nueva forma de construir botones m�s simplificada
    add(new JButton(accionRojo)); //Despu�s de esto el programa continuar� en acctionColor -> actionPerformed.

    /*JButton botonAmarillo = new JButton("Amarillo"); //Construyendo los botones de forma antigua
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    //Agregando los bot�nes a la l�mina
    add(botonAmarillo);
    add(botonAzul);
    add(botonRojo);*/

  }

  //Clase Oyente //Como es una clase interna es bueno encapsularla.
  private class AccionColor extends AbstractAction{ // 'AbstractAction' implementa 6 de los 7 m�todos que se ocupan, por lo que hay que poner manualmente el otro.

    //Constructor
    public AccionColor(String nombre, Icon icono, Color colorBoton) {

      //Almacenando el nombre, el icono, la descripci�n y el color. Usando campos de clase pertenecientes a la interfaz 'Action'
      putValue(Action.NAME, nombre);
      putValue(Action.SMALL_ICON, icono);
      putValue(Action.SHORT_DESCRIPTION, "Poner la l�mina de color " + nombre);
      putValue("Color_de_fondo", colorBoton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

      Color c = (Color)getValue("Color_de_fondo"); //Guardando en una variable 'c' de tipo 'Color' un objeto de tipo 'Object' al que se le hizo casting a 'Color' //Se pasa creo que solo el Color

      setBackground(c); //Por este m�todo es que esta es una clase interna, si estuviera afuera de la otra clase no sabr�a a que cambiarle el color.

      System.out.println("Nombre: " + getValue(Action.NAME) + ". Descripci�n: " + getValue(Action.SHORT_DESCRIPTION));

    }

  }

}
