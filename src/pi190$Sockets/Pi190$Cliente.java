package pi190$Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi190$Cliente {

  public static void main(String[] args) {

    MarcoCliente mimarco=new MarcoCliente();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}


class MarcoCliente extends JFrame{

  public MarcoCliente(){

    setBounds(600,300,280,350);

    LaminaMarcoCliente milamina=new LaminaMarcoCliente();

    add(milamina);

    setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel{

  public LaminaMarcoCliente(){

    JLabel texto=new JLabel("CLIENTE");

    add(texto);

    campo1=new JTextField(20);

    add(campo1);

    miboton=new JButton("Enviar");
    EnviaTexto mievento = new EnviaTexto();
    miboton.addActionListener(mievento);
    add(miboton);

  }




  private class EnviaTexto implements ActionListener{ // Creando clase interna para el bot�n de Enviar

    @Override
    public void actionPerformed(ActionEvent e) {

      System.out.println(campo1.getText()); // Obteniendo el texto del label e imprimiendolo en la consola

      try {
        Socket miSocket = new Socket("192.168.1.102", 9999); // Obtener la IP local -> CMD -> ipconfig -> IPv4 adress // El segundo argumento es el puerto, este puede ser cualquiera
      } catch (UnknownHostException e1) {
        e1.printStackTrace();
      } catch (IOException e1) {
        System.out.println(e1.getMessage()); // Error si no conecta
      }

    }

  }

  private JTextField campo1;

  private JButton miboton;

}
