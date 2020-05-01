package pi190$Sockets; //

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pi196$Cliente {

  public static void main(String[] args) {

    MarcoCliente6 mimarco=new MarcoCliente6();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}


class MarcoCliente6 extends JFrame{

  public MarcoCliente6(){

    setBounds(600,300,280,350);

    LaminaMarcoCliente6 milamina=new LaminaMarcoCliente6();

    add(milamina);

    setVisible(true);

  }

}

class LaminaMarcoCliente6 extends JPanel implements Runnable{ // Implementa 'Runnable' para que funcione como un Thread para recibir mensajes

  public LaminaMarcoCliente6(){

    String nickUsuario = JOptionPane.showInputDialog("Nick:");

    JLabel txtNick = new JLabel("Nick:");
    add(txtNick);

    nick = new JLabel();
    nick.setText(nickUsuario);
    add(nick);

    JLabel texto=new JLabel("- Online: ");
    add(texto);

    ip = new JComboBox();
    ip.addItem("Usuario 1");
    ip.addItem("Usuario 2");
    ip.addItem("Usuario 3");
    add(ip);

    campoChat = new JTextArea(12, 20);
    add(campoChat);

    campo1=new JTextField(20);

    add(campo1);

    miboton=new JButton("Enviar");
    EnviaTexto mievento = new EnviaTexto();
    miboton.addActionListener(mievento);
    add(miboton);

    Thread mihilo = new Thread(this); // 'this' porque el m�todo 'run()' est� dentro de esta misma clase, si no estuviera ah� habr�a que poner una instancia
    mihilo.start();

  }

  private class EnviaTexto implements ActionListener{ // Creando clase interna para el bot�n de Enviar

    @Override
    public void actionPerformed(ActionEvent e) {

      //System.out.println(campo1.getText()); // Obteniendo el texto del label e imprimiendolo en la consola

      try {

        campoChat.append("Yo: " + campo1.getText() + "\n");

        Socket miSocket = new Socket("192.168.1.102", 9999); // Obtener la IP local -> CMD -> ipconfig -> IPv4 adress // El segundo argumento es el puerto, este puede ser cualquiera

        PaqueteEnvio6 datos = new PaqueteEnvio6(); // Instanciando la clase 'PaqueteEnvio6'
        datos.setNick(nick.getText()); // Guardando lo que est� dentro de las areas de texto en los Setters de la clase 'PaqueteEnvio6'
        datos.setIp(ip.getSelectedItem().toString()); // Para obtener el texto del JComboBox // 'setIp' requiere un String por eso es el casting
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

  @Override // M�todo 'run()' de la interfaz 'Runnable'
  public void run() {
    try {

      ServerSocket servidorCliente = new ServerSocket(9090);
      Socket cliente;
      PaqueteEnvio6 paqueteRecibido;

      while(true) {

        cliente = servidorCliente.accept(); // Aceptando todas las conecciones que vienen del exterior

        ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());

        paqueteRecibido = (PaqueteEnvio6) flujoEntrada.readObject(); // Casting

        campoChat.append(paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());

      }

    }catch(Exception e) {

    }
  }

  private JTextField campo1;
  private JComboBox ip; // 'JComboBox' es un men� desplegable
  private JLabel nick;
  private JTextArea campoChat;
  private JButton miboton;

}

class PaqueteEnvio6 implements Serializable{ // Clase que har� un paquete (objeto) con el nick de usuario, la direcci�n IP del destinatario y el mensaje // Implementa la interfaz 'Serializable' (que indica que la clase es susceptible a enviarse por la red) porque si no se implementa se lanzaria una excepci�n de tipo 'Serializable'

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
