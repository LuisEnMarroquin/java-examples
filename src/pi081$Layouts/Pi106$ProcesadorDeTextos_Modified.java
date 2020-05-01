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
import javax.swing.text.StyledEditorKit;

public class Pi106$ProcesadorDeTextos_Modified {

  public static void main(String[] args) {

    MenuProcesador5 marco = new MenuProcesador5();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MenuProcesador5 extends JFrame {

  public MenuProcesador5() {

    setBounds(500, 300, 550, 400);

    LaminaProcesador5 lamina = new LaminaProcesador5();

    add(lamina);

    setVisible(true);

  }

}

class LaminaProcesador5 extends JPanel {

  public LaminaProcesador5() {

    setLayout(new BorderLayout()); // Setting 'LaminaProcesador5' layout

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

    add(laminaMenu, BorderLayout.NORTH); // Adding Panel 'laminaMenu' to the Panel 'LaminaProcesador5'

    /*JTextPane*/ area = new JTextPane(); // Creating a new 'JTextPane' // 'JTextPane' is similar to 'JTextArea' but with a few more options

    add(area, BorderLayout.CENTER); // Adding 'area' to the center of 'LaminaProcesador5'

  }

  // Method
  public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {

    // To create menu sections
    JMenuItem elementoMenu = new JMenuItem(rotulo);

    if(menu=="fuente") {

      fuente.add(elementoMenu);

      if(tipoLetra=="Arial") {
        elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial")); // Turns the selected text into 'Arial'
      } else if (tipoLetra=="Courier") {
        elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier")); // Turns the selected text into 'Courier'
      } else if (tipoLetra=="Verdana") {
        elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Verdana")); // Turns the selected text into 'Verdana'
      }

    } else if (menu=="estilo") {

      estilo.add(elementoMenu);

      if(estilos==Font.BOLD) {
        elementoMenu.addActionListener(new StyledEditorKit.BoldAction()); // Turns the selected text into 'Bold'
      } else if (estilos==Font.ITALIC) {
        elementoMenu.addActionListener(new StyledEditorKit.ItalicAction()); // Turns the selected text into 'Italic'
      }

    } else if (menu=="tamano") {

      tamano.add(elementoMenu);

      elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tama�o", tam)); // Modifies the size only for the selected text

    }

  }

  // Created here to be able to use it in the anonymous or internal class
  JTextPane area; // Text Area
  JMenu fuente, estilo, tamano; // Menu Sections
  Font letras; // Font to

}
