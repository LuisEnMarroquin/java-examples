package pi081$Layouts; // Disposici�n en Muelle = SpringLayout

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Pi117$DisposicionEnMuelle_SpringLayout {

  public static void main(String[] args) {

    MarcoMuelle2 marco = new MarcoMuelle2();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MarcoMuelle2 extends JFrame{

  public MarcoMuelle2() {

    setBounds(300, 400, 1000, 350);
    LaminaMuelle2 lamina = new LaminaMuelle2();
    add(lamina);

  }

}

class LaminaMuelle2 extends JPanel{

  public LaminaMuelle2() {

    JButton boton1 = new JButton("Bot�n 1"); // Creating buttons
    JButton boton2 = new JButton("Bot�n 2");
    JButton boton3 = new JButton("Bot�n 3");

    SpringLayout myLayout = new SpringLayout(); // Instancing Spring Layout
    setLayout(myLayout); // Setting 'Spring Layout' to the panel

    add(boton1); // Adding buttons to the panel
    add(boton2);
    add(boton3);

    Spring muelle = Spring.constant(0, 10, 100); // Definiendo como va a ser el muelle.

    Spring muelleRigido = Spring.constant(20); // Definienco como va a ser el otro muelle.

    myLayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);

    myLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);

    myLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);

    myLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);

  }

}
