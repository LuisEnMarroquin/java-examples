package pi081$Layouts;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Pi100$CreacionDeMenus {

  public static void main(String[] args) {

    MenuFrame marco = new MenuFrame();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class MenuFrame extends JFrame {

  public MenuFrame() {

    setBounds(500, 300, 550, 400);

    MenuLamina lamina = new MenuLamina();

    add(lamina);

  }

}

class MenuLamina extends JPanel {

  public MenuLamina() {

    JMenuBar miBarra = new JMenuBar(); // Instancing class 'JMenuBar'

    JMenu archivo = new JMenu("Archivo"); // Creating elements for 'MenuBar'
    JMenu edicion = new JMenu("Edici�n");
    JMenu herramientas = new JMenu("Herramientas");

    JMenuItem guardar = new JMenuItem("Guardar"); // Creating dropdown items for 'JMenu archivo'
    JMenuItem guardar_como = new JMenuItem("Guardar como");
    archivo.add(guardar); // Adding dropdown items to 'JMenu archivo'
    archivo.add(guardar_como);

    JMenuItem cortar = new JMenuItem("Cortar"); // Creating dropdown items for 'JMenu edicion'
    JMenuItem copiar = new JMenuItem("Copiar");
    JMenuItem pegar = new JMenuItem("Pegar");
    edicion.add(cortar); // Adding dropdown items to 'JMenu edicion'
    edicion.add(copiar);
    edicion.add(pegar);

    JMenuItem generales = new JMenuItem("Generales"); // Creating dropdown items for 'JMenu herramientas'
    herramientas.add(generales); // Adding dropdown items to 'JMenu herramientas'

    herramientas.addSeparator(); // Adding separator line

    JMenu opciones = new JMenu("Opciones"); // Creating a submenu
    JMenuItem opcion1 = new JMenuItem("Opci�n 1"); // Creating items for submenu
    JMenuItem opcion2 = new JMenuItem("Opci�n 2");
    opciones.add(opcion1); // Adding items to submenu
    opciones.add(opcion2);
    herramientas.add(opciones); // A Menu that adds other menu

    miBarra.add(archivo); // Adding elements to 'MenuBar'
    miBarra.add(edicion);
    miBarra.add(herramientas);

    add(miBarra); // Adding 'MenuBar' to Panel 'MenuLamina'

  }

}
