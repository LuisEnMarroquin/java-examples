package pi065$Eventos;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pi080MultiplesOyentes {

  public static void main(String[] args) {

    MarcoPrincipal marco = new MarcoPrincipal();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class MarcoPrincipal extends JFrame{ // Ventana


  public MarcoPrincipal() {

    setTitle("Multiples Oyentes");

    setBounds(1300, 100, 500, 400);

    LaminaPrincipal lamina = new LaminaPrincipal();

    add(lamina);

  }

}

class LaminaPrincipal extends JPanel{ // L�mina

  public LaminaPrincipal() {

    JButton botonNuevo = new JButton("Nuevo"); // Forma 1 de crear un bot�n
    add(botonNuevo);

    OyenteDelBotonNuevo oyente = new OyenteDelBotonNuevo(); // Instanciando la clase interna
    botonNuevo.addActionListener(oyente);

    botonCerrar = new JButton("Cerrar Todo"); // Se instancia de fuera del constructor
    add(botonCerrar); // Forma 2 de crear un bot�n
  }  JButton botonCerrar; // Se crea afuera del constructor porque despu�s habr� que usarlo en otros m�todos sin usar al constructor

  private class OyenteDelBotonNuevo implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent arg0) {

      MarcoEmergente marco = new MarcoEmergente(botonCerrar); // De aqu� se env�a el bot�n para cerrar todo al m�todo action performed que tiene el m�todo dispose para cerrar las ventanas

      marco.setVisible(true);

    }

  }

}

class MarcoEmergente extends JFrame{ // Ventanas Emergentes

  public MarcoEmergente(JButton botonCerrarTodoOtraClase) { // Hay que pasar el bot�n para cerrar por par�metro

    contador++;

    setTitle("Ventana " + contador);

    setBounds(10*contador, 10*contador, 500, 400);

    CierraTodos oyenteCerrar = new CierraTodos(); // Instanciando el boton para cerrar todas las ventanas
    botonCerrarTodoOtraClase.addActionListener(oyenteCerrar);

  }

  private class CierraTodos implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
      dispose(); // Cerrar las ventanas
      contador=0;
    }
  }

  private static int contador = 0; // 'static' para poderla usar en todas partes de la clase y private para encapsularla

}
