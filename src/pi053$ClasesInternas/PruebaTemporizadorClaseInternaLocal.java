package pi053$ClasesInternas; //Las 'Clases Internas Locales' no llevan modificador de acceso
//Una 'Clase Interna Local' es una clase que est� dentro de otra clase y a la vez dentro de un m�todo.

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorClaseInternaLocal {

public static void main(String[] args) {

    //Instanciando reloj
    Reloj2 mireloj = new Reloj2(); //#54 - Reloj2 ahora es el constructor por defecto ya que se quit� el constructor modificado

    mireloj.enMarcha(3000, true); //Para poner en funcionamiento el reloj.

    JOptionPane.showMessageDialog(null, "Observa la consola o cierra el mensaje");

    System.exit(0);

  }

}

class Reloj2{

  //Constructor //#54 - Se prescinde del constructor porque las variables intervalo y final fueron declaradas dentro de la "Clase Interna Local"
  /*public Reloj2(int intervalo, boolean sonido) {
    this.intervalo = intervalo;
    this.sonido = sonido;
  }*/

  //M�todo para poner en marcha el programa. /*intervalo = No es final porque la 'Clase Interna Local' no est� accediendo a sonido*/
  public void/*Setter*/ enMarcha(int intervalo, final /*Debe ser final cuando sea usada por una 'variable interna local'*/ boolean sonido) { //#54

    //Clase Interna Local //Las 'Clases Internas Locales' no pueden tener modificadores de acceso y van dentro de un m�todo
    class DameLaHora3 implements ActionListener{ //ESTA CLASE SE PUEDE ACCEDER A LAS PROPIEDADES Y M�TODOS DE LA CLASE QUE LA CONTIENE PERO LA CLASE QUE LA CONTIENE NO PUEDE ACCEDER A ESTA CLASE A NO SER QUE SEA POR MEDIO DE GETTERS Y SETTERS
      public void actionPerformed(ActionEvent evento) {
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
        if(sonido) { //La clase interna puede acceder a 'sonido' aunque pertenezca a la clase padre y sea 'private' ya que es una clase interna
          Toolkit.getDefaultToolkit().beep();
        }
      }
    }

    ActionListener oyente = new DameLaHora3();
    Timer mitemporizador = new Timer(intervalo, oyente);
    mitemporizador.start();
  }

  //Propiedades //#54
  /*private int intervalo; //Se puede prescindir de estas declarandolas dentro de la 'Clase Interna Local'
  private boolean sonido;*/

}

//Una clase interna local es una clase sin modificador de acceso dentro de un m�todo
