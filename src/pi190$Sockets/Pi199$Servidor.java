package pi190$Sockets;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pi199$Servidor {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    MarcoServidor9 mimarco=new MarcoServidor9();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}

class MarcoServidor9 extends JFrame implements Runnable{ // Implementa Runnable para hacer 'Threads' para que est� permanentemente a la escucha de mensajes

  public MarcoServidor9(){

    setBounds(1200,300,280,350);

    JPanel milamina= new JPanel();

    milamina.setLayout(new BorderLayout());

    areatexto=new JTextArea();

    milamina.add(areatexto,BorderLayout.CENTER);

    add(milamina);

    setVisible(true);

    // Creando el hilo // Al haber puesto esto dentro del constructor se ejecutar� el hilo autom�ticamente
    Thread miHilo = new Thread(this);
    miHilo.start(); // Llama al m�todo 'run()'

  }

  @Override // Sobreescribiendo el m�todo 'run()' de la interfaz 'Runnable'
  public void run() {
    System.out.println("Estoy a la escucha");
    try {

      ServerSocket servidor = new ServerSocket(9999); // Escuchando el puerto 9999

      String nick, ip, mensaje; // Variables donde se almacenar�n los datos que se reciben

      PaqueteEnvio9 paqueteRecibido; // Intancia de 'PaqueteEnvio9' llamada 'paqueteRecibido' // Hay que inicializar la variable para poder usarla

      ArrayList <String> listaIp = new ArrayList <String>(); // Creando lista para almacenar las Ip's de las personas que se conectan al servidor

      while(true) { // Dentro de un bucle infinito para que acepte m�s mensajes

        Socket miSocket = servidor.accept(); // Diciendo que acepte cualquier conecci�n del exterior

        //DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream()); // Que abra un flujo de datos que usa como medio de entrada el Socket
        ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());

        //String mensajeTexto = flujoEntrada.readUTF(); // Se almacena en la variable 'mensajeTexto' lo que viaja por el flujo de datos que viene del cliente
        paqueteRecibido = (PaqueteEnvio9) paqueteDatos.readObject(); // Lanza excepci�n de tipo 'ClassNotFoundException'

        //areatexto.append("\n" + mensajeTexto); // Insertando el texto en el area de texto
        nick = paqueteRecibido.getNick();
        ip = paqueteRecibido.getIp();
        mensaje = paqueteRecibido.getMensaje();

        if(!mensaje.equals("He conectado con el server")) { // Si ya ha conectado con el server antes

          areatexto.append(nick + ": " + mensaje + " para " + ip + "\n");

          Socket enviaDestinatario = new Socket(ip, 9090); // Socket para enviar los datos al destinatario
          ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream()); // Objeto de tipo 'ObjectOutputStream' llamado 'paqueteReenvio'
          paqueteReenvio.writeObject(paqueteRecibido);

          paqueteReenvio.close(); // Cerrando el flujo de datos

          enviaDestinatario.close(); // Cerrando el Socket de envio al destinatario

          miSocket.close(); // Cerrando el Socket de recepci�n del mensaje

        } else { // Si es la primera vez que se conecta con el server

          // ---------- Detectando quien est� online ----------
          InetAddress localizacion = miSocket.getInetAddress();
          String IpRemota = localizacion.getHostAddress(); // Almacenando la direcci�n IP del cliente que se acaba de conectar
          System.out.println("Online: " + IpRemota);

          listaIp.add(IpRemota); // Almacenando en el 'ArrayList' de las IP's la nueva IP

          paqueteRecibido.setIps(listaIp); // Metiendo dentro del paquete el 'ArrayList' con las direcciones IP

          /*for (String z : listaIp) {
            System.out.println("Array: " + z);
          }*/

        }

      }

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private  JTextArea areatexto;

}
