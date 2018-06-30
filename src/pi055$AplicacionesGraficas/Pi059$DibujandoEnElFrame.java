package pi055$AplicacionesGraficas;

import java.awt.*;
import javax.swing.*;

public class Pi059$DibujandoEnElFrame {

	public static void main(String[] args) {
		
		MarcoConDibujos mimarco = new MarcoConDibujos();
		
		

	}

}

class MarcoConDibujos extends JFrame{
	
	//Constructor
	public MarcoConDibujos() {
		
		setTitle("Dibujos");
		
		setSize(400,400);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras milamina = new LaminaConFiguras(); //Instanciando la clase 'LaminaConFiguras' 
		add(milamina); //Agregando la 'LaminaConFiguras'
		
	}
	
}

class LaminaConFiguras extends JPanel{
	
	@Override //Sobreescribiendo el método 'paintComponent' de la clase 'JPanel'
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); //Llamando al método de la clase padre para que haga su trabajo.
		
		g.drawRect(50, 50, 200, 200); // ( distancia x , distancia y , ancho, alto )
		
		//Ya está creada la lámina solo falta instanciarla en la clase 'MarcoConDibujos' porque es la que tiene la ventana.
		
		g.drawLine(100, 100, 300, 200); // ( x1, y1, x2, y2) //Pueden verse todas las figuras en la API de Java en la Clase 'Graphics'.
		
		g.drawArc(50, 100, 100, 200, 120, 150); //Dibujando un arco
		
	}
	
}

// La clase 'Java 2D' es mejor que 'Graphics'