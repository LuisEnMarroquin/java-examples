package pi081$Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi118$DisposicionLibre {

  public static void main(String[] args) {

    MarcoLibre marco = new MarcoLibre();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoLibre extends JFrame{

  public MarcoLibre() {

    setBounds(450, 350, 600, 400);

    LaminaLibre lamina = new LaminaLibre();

    add(lamina);

    setVisible(true);

  }

}

class LaminaLibre extends JPanel{

  public LaminaLibre() {

    setLayout(null); // Setting Layout to 'null'

    JButton boton1 = new JButton("Bot�n 1"); // Creating new button
    boton1.setBounds(50, 50, 150, 50); // setLocation(); doesn't work with a 'NULL LAYOUT' that's why setBounds(); is used
    add(boton1); // Adding 'boton 1' to the panel

    JButton boton2 = new JButton("Bot�n 2");
    boton2.setBounds(300, 200, 150, 50);
    add(boton2);

  }

}
