package pi053$ClasesInternas; // CLASE INTERNA = INNER CLASE

import javax.swing.*; //Para 'Timer' y 'JOptionPane'
import java.awt.Toolkit; //Para 'Toolkit'
import java.awt.event.*; //Para 'ActionEvent' y 'ActionListener'
import java.util.Date; //Para 'Date'


public class PruebaTemporizadorClaseInterna {

	public static void main(String[] args) {
		
		//Instanciando reloj
		Reloj mireloj = new Reloj(3000, true); //Cada 3 segundos y con sonido.
		
		mireloj.enMarcha(); //Para poner en funcionamiento el reloj.
		
		JOptionPane.showMessageDialog(null, "Observa la consola o cierra el mensaje");
		
		System.exit(0);

	}

}

class Reloj{
	
	//Constructor
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	//Método para poner en marcha el programa. Setter.
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	//Propiedades
	private int intervalo;
	private boolean sonido;
	
	//Clase interna //Solo las clases internas pueden tener el modificador de acceso private. Las clases normales pueden ser solo public o default.
	private class DameLaHora2 implements ActionListener{ 
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
			if(sonido) { //La clase interna puede acceder a 'sonido' aunque pertenezca a la clase padre y sea 'private' ya que es una clase interna
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}