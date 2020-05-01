package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Pi106$ProcesadorDeTextos {

  public static void main(String[] args) {

    MenuProcesador4 marco = new MenuProcesador4();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MenuProcesador4 extends JFrame {

  public MenuProcesador4() {

    setBounds(500, 300, 550, 400);

    LaminaProcesador4 lamina = new LaminaProcesador4();

    add(lamina);

    setVisible(true);

  }

}

class LaminaProcesador4 extends JPanel {

  public LaminaProcesador4() {

    setLayout(new BorderLayout()); // Setting 'LaminaProcesador4' layout

    JPanel laminaMenu = new JPanel(); // Creating new Panel

    JMenuBar barra = new JMenuBar(); // Creating 'JMenuBar'

    /*JMenu*/ fuente = new JMenu("Fuente"); // Creating new menu sections
    /*JMenu*/ estilo = new JMenu("Estilo");
    /*JMenu*/ tamano = new JMenu("Tama�o");

    configuraMenu("Arial", "fuente", "Arial", 0, 0);
    configuraMenu("Courier", "fuente", "Courier", 0, 0);
    configuraMenu("Verdana", "fuente", "Verdana", 0, 0);

    configuraMenu("Negrita", "estilo", "", Font.BOLD, 0);
    configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 0);

    configuraMenu("12", "tamano", "", 0, 12);
    configuraMenu("16", "tamano", "", 0, 16);
    configuraMenu("20", "tamano", "", 0, 20);
    configuraMenu("24", "tamano", "", 0, 24);

    barra.add(fuente); // Adding menu sections to the menu
    barra.add(estilo);
    barra.add(tamano);

    laminaMenu.add(barra); // Adding 'barra' to the Panel 'laminaMenu'

    add(laminaMenu, BorderLayout.NORTH); // Adding Panel 'laminaMenu' to the Panel 'LaminaProcesador4'

    /*JTextPane*/ area = new JTextPane(); // Creating a new 'JTextPane' // 'JTextPane' is similar to 'JTextArea' but with a few more options

    add(area, BorderLayout.CENTER); // Adding 'area' to the center of 'LaminaProcesador4'

  }

  // Method
  public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {

    // To create menu sections
    JMenuItem elementoMenu = new JMenuItem(rotulo);
    if(menu=="fuente") {
      fuente.add(elementoMenu);
    } else if (menu=="estilo") {
      estilo.add(elementoMenu);
    } else if (menu=="tamano") {
      tamano.add(elementoMenu);
    }

    elementoMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));

  }

  // Internal Class
  private class GestionaEventos implements ActionListener {

    String tipoTexto, menu;
    int estiloLetra, tamanoLetra;

    // Constructor
    GestionaEventos(String elementoPulsado, String texto2, int estilo2, int tam_letra){
      tipoTexto = texto2;
      estiloLetra = estilo2;
      tamanoLetra = tam_letra;
      menu = elementoPulsado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      letras = area.getFont(); // Saving old font into 'letras'

      if(menu=="Arial" || menu=="Courier" || menu=="Verdana") { // If Arial, Courier or Verdana were pressed

        estiloLetra = letras.getStyle(); // Saving in 'estiloLetra' the style of the old font
        tamanoLetra = letras.getSize(); // Saving in 'tamanoLetra' the size of the old font

      } else if (menu=="Cursiva" || menu=="Negrita") {

        if(letras.getStyle() == 1 || letras.getStyle() == 2) { // To verify if both are applied
          estiloLetra = 3; // This means that both are selected
        }

        tipoTexto = letras.getFontName();
        tamanoLetra = letras.getSize();

      } else if (menu=="12" || menu=="16" || menu=="20" || menu=="24") {

        estiloLetra = letras.getStyle();
        tipoTexto = letras.getFontName();

      }

      area.setFont(new Font(tipoTexto, estiloLetra, tamanoLetra));

      System.out.println("Tipo: " + tipoTexto + ". Estilo: " + estiloLetra + ". Tama�o: " + tamanoLetra);

    }

  }

  // Created here to be able to use it in the anonymous or internal class
  JTextPane area; // Text Area
  JMenu fuente, estilo, tamano; // Menu Sections
  Font letras; // Font to

}
