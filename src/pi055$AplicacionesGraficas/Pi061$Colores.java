package pi055$AplicacionesGraficas;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Pi061$Colores {

	public static void main(String[] args) {
		
		MarcoConColor mimarco = new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoConColor extends JFrame{
	
	//Constructor
	public MarcoConColor() {
		
		setTitle("Prueba de colores");
		
		setSize(400,400);
		
		LaminaConColor milamina = new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(/*Color.PINK*/SystemColor.window); // 'SystemColor.window' aplica el color de las ventanas del sistema operativo que se use
		
	}
	
}

class LaminaConColor extends JPanel{
	
	@Override // Override al método 'paintComponent' de la clase 'JPanel'
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g; //Convirtiendo g de un objeto do tipo "Graphics" a un objeto "Graphics 2D"
		
		//Dibujo del rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		//Definiendo borde
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		
		//Definiendo color de fondo
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		
		//Dibujo del elipse
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(0,140,255)/*.brighter()*//*.darker()*/);
		
		g2.fill(elipse);
		
	}
	
}

// La clase 'Java 2D' es mejor que 'Graphics'