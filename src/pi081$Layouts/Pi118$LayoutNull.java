package pi081$Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi118$LayoutNull {

  public static void main(String[] args) {

    MarcoLibre2 marco = new MarcoLibre2();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoLibre2 extends JFrame{

  public MarcoLibre2() {

    setBounds(450, 350, 600, 400);

    LaminaLibre2 lamina = new LaminaLibre2();

    add(lamina);

    setVisible(true);

  }

}

class LaminaLibre2 extends JPanel{

  public LaminaLibre2() {

    setLayout(null); // Setting Layout to 'null'

    JLabel nombre = new JLabel("Nombre: ");
    JLabel apellido = new JLabel("Apellido: ");
    JTextField c_nombre = new JTextField(/*10*/);
    JTextField c_apellido = new JTextField(/*10*/);

    nombre.setBounds(20, 20, 80, 10);
    c_nombre.setBounds(100, 15, 100, 20);
    apellido.setBounds(20, 60, 80, 15);
    c_apellido.setBounds(100, 55, 100, 20);

    add(nombre); // Adding items to the panel
    add(apellido);
    add(c_nombre);
    add(c_apellido);

  }

}
