package pi053$ClasesInternas;

import javax.swing.*; //Para 'Timer' y 'JOptionPane'
import java.awt.Toolkit;
import java.awt.event.*; //Para 'ActionEvent' y 'ActionListener'
import java.util.Date; //Para 'Date' (se pone en especifico porque también hay un Timer en java.util)

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		//ActionListener oyente = new DameLaHora(); //Esto también funcionaría.
		
		Timer mitemporizador = new Timer(5000, oyente); //5000 milisegundos.

		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Mira la consola o pulsa aceptar para deterner"); 
		//Se pone esta ventana porque mantiene la ejecución del programa mientras la muestra.
		
		System.exit(0); //Se supone que es para detener el programa pero se detiene al cerrar .showMessageDialog()
		
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date(); //Instancia perteneciente a la clase Date
		
		System.out.println("Muestro la hora cada 5 segundos " + ahora);
		
		//Toolkit es una clase que permite acceder a recursos del Sistema Operativo como a la resolución del monitor, recursos de sonido, etc.
		Toolkit.getDefaultToolkit().beep(); //Beep hace un sonido cada que se ejecuta el evento.
	
	}
	
}