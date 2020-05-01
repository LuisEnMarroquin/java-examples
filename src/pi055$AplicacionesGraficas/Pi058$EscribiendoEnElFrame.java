package pi055$AplicacionesGraficas;

import javax.swing.*;
import java.awt.*;

public class Pi058$EscribiendoEnElFrame {

  public static void main(String[] args) {

    MarcoConTexto mark = new MarcoConTexto(); //Instancia

    mark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Detener ejecuci�n al cerrar ventana.

  }

}

class MarcoConTexto extends JFrame{

  ///Constructor
  public MarcoConTexto() {

    setVisible(true); //Cuadro visible

    setSize(600,450); //Tama�o (x,y)

    setLocation(400,200); //Ubicaci�n (x,y)

    setTitle("Minecraft");

    Lamina milamina = new Lamina(); //Instanciando la clase 'Lamina'
    add(milamina); //Agregando la clase L�mina enfrente de la ventana

  }

}

class Lamina extends JPanel{ //Crear una l�mina encima de la ventana para escribir ah�.

  @Override //Sobreescribiento m�todo heredado de JPanel
  public void paintComponent(Graphics g) {
    super.paintComponent(g); //Hay que llamar al constructor de la clase JComponent (porque JPanel hereda de esta) para que haga lo que deba de hacer y ya despu�s que haga aparte lo que yo le diga despu�s.
    g.drawString("Aprendiendo Swing", 100, 100); //Despu�s de llamar al constructor de la clase padre se hace esta linea para que escriba el String que quiero en coordenadas determinadas (x,y)
  }

}
