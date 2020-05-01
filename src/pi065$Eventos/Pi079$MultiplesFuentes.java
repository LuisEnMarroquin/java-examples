package pi065$Eventos; //Con 'ctrl+A', 'ctrl+B' y 'ctrl+R' se cambian los colores

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import java.awt.Color; //Hay muchas clases 'Color' en diferentes paquetes.
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;

public class Pi079$MultiplesFuentes {

  public static void main(String[] args) {

    MarcoAccion2 marco = new MarcoAccion2();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MarcoAccion2 extends JFrame{

  public MarcoAccion2() {
    setTitle("Prueba Acciones");
    setBounds(600,350,600,300);
    PanelAccion2 lamina = new PanelAccion2();
    add(lamina);
  }

}

class PanelAccion2 extends JPanel{

  public PanelAccion2() { //Como los bot�nes se van a usar dentro del panel se declaran aqu�

    //Instancia
    AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.YELLOW);
    AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.BLUE);
    AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/pi065$Eventos/yellowCircle.png"), Color.RED);

    //Esta forma de construir objetos requiere un objeto perteneciente a la clase Action
    JButton botonAmarillo = new JButton(accionAmarillo); add(botonAmarillo); //Nueva forma de construir los botones
    add(new JButton(accionAzul)); //Nueva forma de construir botones m�s simplificada
    add(new JButton(accionRojo));

    // Asignando acciones al teclado: 1- Crear mapa de entrada.
    InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); //Ver en la API la clase InputMap y su m�todo getInputMap // 'WHEN_FOCUSED' no se pudo haber utilizado porque va a acceder a la l�mina, no al bot�n

    // Asignando acciones al teclado: 2- Crear la combinaci�n de teclas.
    KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
    // Asignando acciones al teclado: 3- Asignar combinaci�n de teclas al objeto.
    mapaEntrada.put(teclaAmarillo, "Fondo Amarillo"); //Se utiliza el m�todo 'put' de la clase 'InputMap'

    // Asignando acciones al teclado: Pasos 2 y 3 combinados
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo Azul");
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo Rojo");

    // Asignando acciones al teclado: 4- Asignar el objeto a la acci�n
    ActionMap mapaAccion = getActionMap(); //Creando un mapa de acci�n
    mapaAccion.put("Fondo Amarillo", accionAmarillo); //Con 'put' se asigna la combinaci�n al la acci�n.
    mapaAccion.put("Fondo Azul", accionAzul);
    mapaAccion.put("Fondo Rojo", accionRojo);
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

// Para asignar acciones al teclado.
  // 1- Crear mapa de entrada (asignar al elemento al que se le da el foco y sobre el que incidir� la combinaci�n de teclas) CLASES = 'InputMap' y 'JComponent' (M�todo getInputMap(int condicion))
  // 2- Crear la combinaci�n de teclas. CLASES 'KeyStroke' (M�todo static getKeyStroke(String s))
  // 3- Asignar combinaci�n de teclas al objeto. CLASES 'InputMap' (M�todo put(KeyStroke, Object))
  // 4- Asignar el objeto a la acci�n. CLASES 'ActionMap' (M�todo put(Object, acci�n))
