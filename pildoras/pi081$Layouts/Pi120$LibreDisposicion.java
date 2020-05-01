package pi081$Layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi120$LibreDisposicion {

  public static void main(String[] args) {

    MarcoLibre4 marco = new MarcoLibre4();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoLibre4 extends JFrame{

  public MarcoLibre4() {

    setBounds(450, 350, 800, 400);

    LaminaLibre4 lamina = new LaminaLibre4();

    add(lamina);

    setTitle("Elementos Centrados");

    setVisible(true);

  }

}

class LaminaLibre4 extends JPanel{

  public LaminaLibre4() {

    setLayout(new ElementosEnColumnas2()); // Setting Layout to 'ElementosEnColumnas2()'

    JLabel nombre = new JLabel("Nombre: ");
    JLabel apellido = new JLabel("Apellido: ");
    JLabel edad = new JLabel("Edad: ");

    JTextField c_nombre = new JTextField(/*10*/);
    JTextField c_apellido = new JTextField(/*10*/);
    JTextField c_edad = new JTextField(/*10*/);

    /*nombre.setBounds(20, 20, 80, 10);
    c_nombre.setBounds(100, 15, 100, 20);
    apellido.setBounds(20, 60, 80, 15);
    c_apellido.setBounds(100, 55, 100, 20);*/

    add(nombre); // Adding items to the panel
    add(c_nombre);
    add(apellido);
    add(c_apellido);
    add(edad);
    add(c_edad);

  }

}

class ElementosEnColumnas2 implements LayoutManager{

  @Override
  public void addLayoutComponent(String arg0, Component arg1) {}

  @Override
  public void layoutContainer(Container miContenedor) {

    int d = miContenedor.getWidth(); // Getting container width
    x = d/2;
    int contador = 0;
    int componentesAgregadosAlContenedor = miContenedor.getComponentCount(); // '.getComponentCount()' returns the number of elements to add

    for(int i = 0; i < componentesAgregadosAlContenedor; i++) {

      contador++;

      Component c = miContenedor.getComponent(i); // Saving the item added to the layout in a 'Component' variable

      c.setBounds(x-100 /* -100 because is the size of each component*/ , y, 100 /*size of each component*/, 20); // At the end of this class are declared 'x' and 'y' as '20'

      x += 100;

      if(contador%2 == 0) { // Cuando el n�mero de 'contador' es par
        x = d/2; // Return 'x' to the start of the line
        y += 40; // New line in 'y'
      }

    }

  }

  @Override
  public Dimension minimumLayoutSize(Container parent) {
    return null;
  }

  @Override
  public Dimension preferredLayoutSize(Container parent) {
    return null;
  }

  @Override
  public void removeLayoutComponent(Component comp) {}

  private int x /*= 20*/, y = 20; // Declaring variables

}
