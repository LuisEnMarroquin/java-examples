package pi190$Sockets;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pi191$Servidor {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    MarcoServidor1 mimarco=new MarcoServidor1();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}

class MarcoServidor1 extends JFrame implements Runnable{ // Implementa Runnable para hacer 'Threads' para que est� permanentemente a la escucha de mensajes

  public MarcoServidor1(){

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

      while(true) { // Dentro de un bucle infinito para que acepte m�s mensajes

        Socket miSocket = servidor.accept(); // Diciendo que acepte cualquier conecci�n del exterior

        DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream()); // Que abra un flujo de datos que usa como medio de entrada el Socket

        String mensajeTexto = flujoEntrada.readUTF(); // Se almacena en la variable 'mensajeTexto' lo que viaja por el flujo de datos que viene del cliente

        areatexto.append("\n" + mensajeTexto); // Insertando el texto en el area de texto

        miSocket.close(); // Cerrando la conecci�n

      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private  JTextArea areatexto;

}
