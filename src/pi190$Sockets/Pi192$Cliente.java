package pi190$Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pi192$Cliente {

	public static void main(String[] args) {
		
		MarcoCliente2 mimarco=new MarcoCliente2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente2 extends JFrame{
	
	public MarcoCliente2(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente2 milamina=new LaminaMarcoCliente2();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente2 extends JPanel{
	
	public LaminaMarcoCliente2(){
	
		nick = new JTextField(5);
		add(nick);
		
		JLabel texto=new JLabel("- CHAT -");
		add(texto);
		
		ip = new JTextField(8);
		add(ip);
		
		campoChat = new JTextArea(12, 20);
		add(campoChat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		EnviaTexto mievento = new EnviaTexto();
		miboton.addActionListener(mievento);
		add(miboton);	
		
	}
		
	private class EnviaTexto implements ActionListener{ // Creando clase interna para el botón de Enviar

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(campo1.getText()); // Obteniendo el texto del label e imprimiendolo en la consola
		
			try {
			
				Socket miSocket = new Socket("192.168.1.102", 9999); // Obtener la IP local -> CMD -> ipconfig -> IPv4 adress // El segundo argumento es el puerto, este puede ser cualquiera
			
				PaqueteEnvio datos = new PaqueteEnvio(); // Instanciando la clase 'PaqueteEnvio'
				datos.setNick(nick.getText()); // Guardando lo que está dentro de las areas de texto en los Setters de la clase 'PaqueteEnvio'
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				//DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream()); // Haciendo flujo de salida de datos
				ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream()); // Creando flujo de salida para poder enviar el objeto por la red
				
				//flujoSalida.writeUTF(campo1.getText()); // Escribe en el flujo de salida lo que hay en el 'campo1'
				paqueteDatos.writeObject(datos); // Envia el objeto
				
				//flujoSalida.close(); // Cierra el flujo de datos
				miSocket.close();
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				System.out.println(e1.getMessage()); // Error si no conecta
			} 
		
		} 
		
	}
		
	private JTextField campo1, nick, ip;
	private JTextArea campoChat;
	private JButton miboton;
	
}

class PaqueteEnvio implements Serializable{ // Clase que hará un paquete (objeto) con el nick de usuario, la dirección IP del destinatario y el mensaje // Implementa la interfaz 'Serializable' (que indica que la clase es susceptible a enviarse por la red) porque si no se implementa se lanzaria una excepción de tipo 'Serializable'

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	private String nick, ip, mensaje; // Autogenerate Getters and Setters: RightClick -> Source -> Generate Getters and Setters... -> Select All
	
}
