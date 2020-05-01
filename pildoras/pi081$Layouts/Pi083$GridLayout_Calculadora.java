package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi083$GridLayout_Calculadora {

  public static void main(String[] args) {

    MarcoCalculadora marco = new MarcoCalculadora();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MarcoCalculadora extends JFrame {
  public MarcoCalculadora() {

    setTitle("Calculadora");
    setBounds(500,300,450,300);

    LaminaCalculadora lamina = new LaminaCalculadora();
    add(lamina);

  }
}

class LaminaCalculadora extends JPanel {
  public LaminaCalculadora() {

    setLayout(new BorderLayout()); // Using BorderLayouy
    JButton pantalla = new JButton("0"); // Creating button
    pantalla.setEnabled(false); // Disabling button to show it as display
    add(pantalla, BorderLayout.NORTH); // Choosing NORTH zone in BorderLayout

    // Crating a second layout
    // JPanel lamina2 = new JPanel(); // Declaration moved outside constructor to use it in the method used to add the buttons
    lamina2 = new JPanel(); // Replaces upper line
    lamina2.setLayout(new GridLayout(4,4)); // Choosing GridLayout inside 'lamina2'
    // Adding buttons by calling the method outside constructor
    ponerBoton("7");
    ponerBoton("8");
    ponerBoton("9");
    ponerBoton("/");
    ponerBoton("4");
    ponerBoton("5");
    ponerBoton("6");
    ponerBoton("*");
    ponerBoton("1");
    ponerBoton("2");
    ponerBoton("3");
    ponerBoton("-");
    ponerBoton("0");
    ponerBoton(".");
    ponerBoton("=");
    ponerBoton("+");
    add(lamina2, BorderLayout.CENTER); // Putting 'lamina2' as BorderLayout.CENTER inside window

  }
  private JPanel lamina2;

  // Creating a method to add buttons to Calculator
  private void ponerBoton(String rotulo) {
    JButton boton = new JButton(rotulo);
    lamina2.add(boton);
  }
}
