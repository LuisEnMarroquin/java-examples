package pi081$Layouts;

import java.awt.FlowLayout;

import javax.swing.*;

public class Pi081$Layouts {

  public static void main(String[] args) {

    MarcoLayout marco = new MarcoLayout();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class MarcoLayout extends JFrame {

  public MarcoLayout() {

    setTitle("Prueba Acciones");
    setBounds(600, 350, 600, 300);

    PanelLayout lamina = new PanelLayout();
    FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT); // Alineando los elementos a la iquierda
    lamina.setLayout(disposicion);
    add(lamina);

  }

}

class PanelLayout extends JPanel {

  public PanelLayout() {
    add(new JButton("Amarillo"));
    add(new JButton("Rojo"));
    add(new JButton("Azul"));
  }

}
