package pi190$Sockets;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pi192$Servidor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor2 mimarco=new MarcoServidor2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor2 extends JFrame implements Runnable{ // Implementa Runnable para hacer 'Threads' para que esté permanentemente a la escucha de mensajes
	
	public MarcoServidor2(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		// Creando el hilo // Al haber puesto esto dentro del constructor se ejecutará el hilo automáticamente
		Thread miHilo = new Thread(this);
		miHilo.start(); // Llama al método 'run()'
		
	}
	
	@Override // Sobreescribiendo el método 'run()' de la interfaz 'Runnable'
	public void run() {
		System.out.println("Estoy a la escucha");
		try {
			
			ServerSocket servidor = new ServerSocket(9999); // Escuchando el puerto 9999
			
			String nick, ip, mensaje; // Variables donde se almacenarán los datos que se reciben
			
			PaqueteEnvio paqueteRecibido = null; // Intancia de 'PaqueteEnvio' llamada 'paqueteRecibido' // Hay que inicializar la variable para poder usarla
			
			while(true) { // Dentro de un bucle infinito para que acepte más mensajes
				
				Socket miSocket = servidor.accept(); // Diciendo que acepte cualquier conección del exterior
				
				//DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream()); // Que abra un flujo de datos que usa como medio de entrada el Socket
				ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());
				
				//String mensajeTexto = flujoEntrada.readUTF(); // Se almacena en la variable 'mensajeTexto' lo que viaja por el flujo de datos que viene del cliente
				try {
					paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				//areatexto.append("\n" + mensajeTexto); // Insertando el texto en el area de texto
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
				mensaje = paqueteRecibido.getMensaje();
				
				areatexto.append(nick + ": " + mensaje + " para " + ip + "\n");
				
				miSocket.close(); // Cerrando la conección
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	private	JTextArea areatexto;

}


	