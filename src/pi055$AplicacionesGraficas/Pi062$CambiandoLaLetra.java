package pi055$AplicacionesGraficas;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Pi062$CambiandoLaLetra {

  public static void main(String[] args) {

    String fuente = JOptionPane.showInputDialog("Introduce la fuente");

    boolean estaLaFuente = false;

    String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    for(String nombreDeLaFuente : nombresDeFuentes) {
      if(nombreDeLaFuente.equals(fuente)) {
        estaLaFuente = true;
      }
    }

    if(estaLaFuente) {
      System.out.println("Fuente instalada");
    }else {
      System.out.println("Fuente no instalada");
    }

    //Almacena en un array los tipos de fuentes que tiene el usuario instaladas en su dispositivo
    String [] nombresDeLasFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    for(String nombreDeLaFuente : nombresDeLasFuentes) {
      System.out.print(nombreDeLaFuente + " ");
    }

  }

}
