package pi055$AplicacionesGraficas;

import java.awt.*; //Para 'image()'
import javax.swing.*;
import javax.imageio.*; //Para 'read()' que se usa para leer archivos
import java.io.*; //Es el paquete al que pertenece al clase 'File'

public class Pi064$Imagenes {

	public static void main(String[] args) {
		
		MarcoImagen2 mimarco = new MarcoImagen2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoImagen2 extends JFrame{
	
	public MarcoImagen2() {
		
		setTitle("Marco Imagen");
		
		setBounds(50, 50, 900, 900); //(position, position, size, size)
		
		LaminaConImagen2 milamina = new LaminaConImagen2();
		
		add(milamina);
		
	}
	
}

class LaminaConImagen2 extends JPanel{
	
	public LaminaConImagen2() {
		try { //Capturando la excepcion ya que es obligatorio
			imagen = ImageIO.read(new File("src/pi055$AplicacionesGraficas/bola.jpg"));
		}
		catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		/* //Puede estar aquí o dentro del constructor
		try { //Capturando la excepcion ya que es obligatorio
			imagen = ImageIO.read(new File("src/pi055$AplicacionesGraficas/bola.jpg"));
		}
		catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}*/
		
		g.drawImage(imagen, 0, 0, null);
		
		int anchoImagen = imagen.getWidth(this); //This hace referencia a el objeto en que se encuentra, es decir la lámina 'LaminaConImagen2'
		int altoImagen = imagen.getHeight(this);
		
		//Video 64
		
		for(int i=0; i<90; i++) {
			for(int j=0; j<90; j++) {
				if(i+j>0){ //Porque la primera vez que pone la imagen la pondrá sobre la primera imagen que ya existe en la coordenada 0,0.
					g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
				}
			}
		}
		
		//Min 14
			
	}
	
	private Image imagen; //Pertenece a 'java.awt.*;' /*63*/
	
}