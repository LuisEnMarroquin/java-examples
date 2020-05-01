package pi081$Layouts;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Pi111$BarrasDeHerramientas {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Marco_Barra mimarco=new Marco_Barra();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mimarco.setVisible(true);

  }

}

class Marco_Barra extends JFrame{

  public Marco_Barra(){

    setTitle("Marco con Barra");

    setBounds(500,300,600,450);

    lamina=new JPanel();

    add(lamina);

    // configuraci�n de acciones

    Action accionAzul=new AccionColor("Azul", new ImageIcon("src/pi081$Layouts/blueCircle.png"), Color.BLUE);
    Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/pi081$Layouts/yellowCircle.png"), Color.YELLOW);
    Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/pi081$Layouts/redCircle.png"), Color.RED);

    Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/pi081$Layouts/exit.png")) { // Action to close the app
      @Override
      public void actionPerformed(ActionEvent arg0) {
        System.exit(0); // Exits the app
      }
    };

    // ------------------------------------------------------------------

    JMenu menu = new JMenu("Color"); // Creating new 'JMenu'

    menu.add(accionAzul); // Added buttons to the JMenu 'menu'
    menu.add(accionAmarillo);
    menu.add(accionRojo);

    JMenuBar barraMenu = new JMenuBar(); // Creating a 'JMenuBar'

    barraMenu.add(menu); // Added 'menu' to 'barraMenu'

    setJMenuBar(barraMenu); // Added 'barraMenu' to be the top bar of �JFrame 'Marco_Barra'?

    // Construcci�n de la barra de herramientas

    JToolBar barra = new JToolBar(); // Creating new ToolBar

    barra.add(accionAzul); // Adding actions to the toolbar
    barra.add(accionAmarillo);
    barra.add(accionRojo);

    barra.addSeparator();

    barra.add(accionSalir);

    add(barra, BorderLayout.NORTH); // By default the toolbar will go to the top, but can't move it if you don't set BorderLayout to be NORTH, SOUTH, EAST or WEST

  }


  private class AccionColor extends AbstractAction{

    public AccionColor(String nombre, Icon icono, Color c){

      putValue(Action.NAME, nombre);

      putValue(Action.SMALL_ICON, icono);

      putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);

      putValue("Color", c);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub

      Color c=(Color) getValue("Color");

      lamina.setBackground(c);

    }

  }
  private JPanel lamina;
}
