package pi055$AplicacionesGraficas;

import java.awt.*;
import javax.swing.*;

public class Pi057$CentrandoElFrame {

	public static void main(String[] args) {
		
		MarcoCentrado instancia = new MarcoCentrado();
		
		instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Que detenga la aplicación al cerrar la ventana.

		instancia.setVisible(true); //Cuadro visible
		
	}

}

class MarcoCentrado extends JFrame{
	
	//Constructor
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit(); //Devuelve un objeto de tipo Toolkit por eso se crea el objeto de tipo toolkit llamado 'mipantalla'.
	
		Dimension tamanoPantalla = mipantalla.getScreenSize(); //Objeto de tipo Dimension llamado 'tamanoPantalla'.
		
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2); //Haciendo el cuadro del tamaño de la mitad de la pantalla.
		
		setLocation(anchoPantalla/4, alturaPantalla/4); //Poniendo el cuadro en el centro de la pantalla.
		
		setTitle("Minecraft"); //Poniendole título a la ventana.
		
		Image miIcono = mipantalla.getImage("src/pi055$AplicacionesGraficas/minecraft.png"); //Método 'getImage' de la clase 'Toolkit' //Puede ser 'gif', 'png' o 'jpg'.
		setIconImage(miIcono); //Poniendo icono a la ventana (que establezca el icono) //El icono se coloca partiendo de las carpetas 'bin' y 'src'.
		
	}
	
}