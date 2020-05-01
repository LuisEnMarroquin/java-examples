package pi055$AplicacionesGraficas;

import java.awt.*;
import javax.swing.*;

public class Pi062$TrabajandoConFuentes {

  public static void main(String[] args) {

    MarcoConFuentes mimarco = new MarcoConFuentes();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mimarco.setVisible(true);

  }

}

class MarcoConFuentes extends JFrame{

  public MarcoConFuentes() {

    setTitle("Prueba con fuentes");

    setSize(400, 400);

    LaminaConFuentes milamina = new LaminaConFuentes();

    add(milamina);

    //Establecer el color de todos los elementos tanto texto como formas
    milamina.setForeground(Color.BLUE);

  }

}

class LaminaConFuentes extends JPanel{

  @Override
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g; //Intanciando Graphics2D

    // Texto 1

    Font mifuente = new Font("Courier", Font.BOLD, 26);

    g2.setFont(mifuente);

    //g2.setColor(Color.BLUE);

    g2.drawString("Luis", 100, 100);

    // Texto 2

    g2.setFont(new Font("Arial", Font.ITALIC, 34));

    //g2.setColor(new Color(128,90,50).brighter());

    g2.drawString("Curso de Java", 100, 200);

  }

}
