package pi142$Excepciones; // This class was originally was 'Pi064$Imagenes'

import java.awt.*; //Para 'image()'
import javax.swing.*;
import javax.imageio.*; //Para 'read()' que se usa para leer archivos
import java.io.*; //Es el paquete al que pertenece al clase 'File'

public class Pi144$ThrowsTryCatch { // To check how the exceptions work modify the image url: src/pi142$Excepciones/bola.jpg

	public static void main(String[] args) {
		
		MarcoImagen3 mimarco = new MarcoImagen3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoImagen3 extends JFrame{
	
	public MarcoImagen3() {
		
		setTitle("Marco Imagen");
		
		setBounds(50, 50, 900, 900); //(position, position, size, size)
		
		LaminaConImagen3 milamina = new LaminaConImagen3();
		
		add(milamina);
		
	}
	
}

class LaminaConImagen3 extends JPanel{
	
	public LaminaConImagen3() { // IOExeption = Excepción comprobada (lo programaste bien)
		try { //Capturando la excepcion ya que es obligatorio // EXCEPTION COMPROBADA = IOEXCEPTION
			imagen = ImageIO.read(new File("src/pi142$Excepciones/bolaaaaaaaa.jpg")); // The method read throws an exception that needs to be handled
		} // 'ImageIO' is the class // Method '.read()' belongs to 'ImageIO' and it needs and argument of type 'File'
		catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
	}
	
	@Override
	public void paintComponent(Graphics g) throws NullPointerException {

		try { // EXCEPCION NO COMPROBADA == RUNTIME
			
			super.paintComponent(g);
			
			int anchoImagen = imagen.getWidth(this); //This hace referencia a el objeto en que se encuentra, es decir la lámina 'LaminaConImagen3'
			int altoImagen = imagen.getHeight(this);
		
			g.drawImage(imagen, 0, 0, null);
			
			for(int i=0; i<90; i++) {
				for(int j=0; j<90; j++) {
					if(i+j>0){ //Porque la primera vez que pone la imagen la pondrá sobre la primera imagen que ya existe en la coordenada 0,0.
						g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
					}
				}
			}
			
		} catch(NullPointerException e) {
			
			g.drawString("No se ha podido cargar la imagen", 10, 10); // (text, coordinateX, coordinateY)
			
		}
			
			
	}
	
	private Image imagen; //Pertenece a 'java.awt.*;' /*63*/
	
}