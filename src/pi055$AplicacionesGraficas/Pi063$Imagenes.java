package pi055$AplicacionesGraficas;

import java.awt.*; //Para 'image()'
import javax.swing.*;
import javax.imageio.*; //Para 'read()' que se usa para leer archivos
import java.io.*; //Es el paquete al que pertenece al clase 'File'

public class Pi063$Imagenes {

	public static void main(String[] args) {
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco Imagen");
		
		setBounds(700, 300, 300, 300); //(position, position, size, size)
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
		
	}
	
}

class LaminaConImagen extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		File miImagen = new File("src/pi055$AplicacionesGraficas/mineimage.jpg"); /*63*/

		try { //Capturando la excepcion ya que es obligatorio
			imagen = ImageIO.read(miImagen); /*63*/
		}
		catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		g.drawImage(imagen, 5, 5, null);
			
	}
	
	private Image imagen; //Pertenece a 'java.awt.*;' /*63*/
	
}