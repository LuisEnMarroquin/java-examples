package pi055$AplicacionesGraficas;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Pi060$DibujandoEnElFrame2 {

  public static void main(String[] args) {

    MarcoConDibujos2 mimarco = new MarcoConDibujos2();



  }

}

class MarcoConDibujos2 extends JFrame{

  //Constructor
  public MarcoConDibujos2() {

    setTitle("Dibujos");

    setSize(400,400);

    setVisible(true);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    LaminaConFiguras2 milamina = new LaminaConFiguras2(); //Instanciando la clase 'LaminaConFiguras2'
    add(milamina); //Agregando la 'LaminaConFiguras2'

  }

}

class LaminaConFiguras2 extends JPanel{

  @Override //Sobreescribiendo el m�todo 'paintComponent' de la clase 'JPanel'
  public void paintComponent(Graphics g) {

    //VIDEO 59 - dibujando un cuadrado con java.awt

    super.paintComponent(g); //Llamando al m�todo de la clase padre para que haga su trabajo.

    g.drawRect(50, 50, 200, 200); // ( distancia x , distancia y , ancho, alto )

    //VIDEO 60 - dibujando cuadrado con Graphics2D

    //Creando un objeto de tipo 'Graphics2D'
    Graphics2D g2 = (Graphics2D) g; //Refundici�n

    //Instanciando Rectangle2D
    Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); //Pertertenece a java.awt.geom.*; //Este es un m�todo constructor de la clase Rectangle2D.Double

    g2.draw(rectangulo); //Dibujando rectangulo

    //dibujando elipse con Elipse2D

    Ellipse2D elipse = new Ellipse2D.Double();

    elipse.setFrame(rectangulo);  //Asignando el tama�o del rectangulo a la elipse.

    g2.draw(elipse); //Dibujando Elipse

    //dibujando una linea

    g2.draw(new Line2D.Double(100,100,300,400));

    //dibujando elipse fuera del rectangulo dibujado con graphics 2d

    double CentroenX = rectangulo.getCenterX();

    double CentroenY = rectangulo.getCenterY();

    double radio = 150;

    Ellipse2D circulo = new Ellipse2D.Double();

    circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);

    g2.draw(circulo);

  }

}

// La clase 'Java 2D' es mejor que 'Graphics'
