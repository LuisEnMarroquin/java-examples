package pi065$Eventos;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class copiarParaTodo {

  public static void main(String[] args) {

    MarcoFocow mimarco = new MarcoFocow();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoFocow extends JFrame{

  public MarcoFocow() {

    setVisible(true);

    setBounds(300,300,600,450);

    add(new LaminaFocow());

  }

}

class LaminaFocow extends JPanel{

  public void paintComponent(Graphics g) {

    super.paintComponent(g);

  }

}
