package pi081$Layouts; // Grouped: boton1, boton2 and boton3 // Grouped: boton4 and boton5

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pi093$RadioButton {

  public static void main(String[] args) {

    MarcoRadio marco = new MarcoRadio();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoRadio extends JFrame {
  public MarcoRadio() {
    setVisible(true);
    setBounds(550, 300, 500, 300);
    LaminaRadio lamina = new LaminaRadio();
    add(lamina);
  }
}

class LaminaRadio extends JPanel {

  public LaminaRadio() {

    ButtonGroup grupo1 = new ButtonGroup(); // Creating object of type 'ButtonGroup'

    JRadioButton boton1 = new JRadioButton("Azul", false); // Creating "unselected" 'JRadioButton' with text "Azul"
    JRadioButton boton2 = new JRadioButton("Rojo", true); // Creating "selected" 'JRadioButton' with text "Rojo"
    JRadioButton boton3 = new JRadioButton("Verde", false);

    grupo1.add(boton1); // Adding 'boton1' to the group 'grupo1'
    grupo1.add(boton2); // Adding 'boton2' too to make all 'JRadioButton' to work together
    grupo1.add(boton3); // Only 1 button in a group can be selected

    // You need to add all the 'JRadioButton' to the Frame because is not possible to add the group
    add(boton1);
    add(boton2);
    add(boton3);

    // Doing the same thing again

    ButtonGroup grupo2 = new ButtonGroup();

    JRadioButton boton4 = new JRadioButton("Masculino"); // By default 'JRadioButton' is not selected
    JRadioButton boton5 = new JRadioButton("Femenino");

    grupo2.add(boton4);
    grupo2.add(boton5);

    add(boton4);
    add(boton5);

  }

}
