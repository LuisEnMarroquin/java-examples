package pi168$Threads; // Explicaci�n del error de la programaci�n concurrente en los primeros 10 minutos del video 175

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pi177$BancoSincronizado_CondicionesDeBloqueos { // Todos los hilos que entran dentro del m�todo 'transferencia' (es decir todos) tarde o temprano terminan haciendo la transferencia

  public static void main(String[] args) {

    Banco5 elBanco = new Banco5();

    for(int i = 0; i < 100; i++) { // i < 100 = porque hay 100 cuentas

      EjecucionTransferencias4 r = new EjecucionTransferencias4(elBanco, i, 2000); // Initanciando la clase que lleva la interfaz 'Runnable'

      Thread t = new Thread(r); // Instancia a la clase 'Thread'
      t.start(); // Arrancando el hilo

    }

  }

}

class Banco5 {

  public Banco5() {

    cuentas = new double[100]; // Habr� 100 cuentas

    for(int i = 0; i < cuentas.length; i++) { // Creando 100 cuentas
      cuentas[i] = 2000; // Asignando $2000 a cada cuenta
    }

    saldoSuficiente = soloUnHiloEjecutandoEsteMetodo.newCondition(); // Creando condici�n // Bloque establecido con una condici�n que se almacena en la variable 'saldoSuficiente'// 177

  } private Condition saldoSuficiente; // Creando variable de tipo 'Condition' llamada 'saldoSuficiente' // 177

  public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException { // M�todo que realiza las transferencias // throws InterruptedException = Debido a 'saldoSuficiente.await();'

    soloUnHiloEjecutandoEsteMetodo.lock(); // Bloqueando el c�digo dentro del try para que solamente un hilo pueda ejecutarlo a al vez

    try {

      while(cuentas[cuentaOrigen] < cantidad) { // Si el dinero de la cuenta de origen es menor que 'cantidad' (lo que se va a transferir)

        //return; // Esto convertir�a el hilo en un hilo que solo habre y cierra pero no hace nada: Explicaci�n video 176 // Se coment� porque se quiere que todas las transferencias se realizen

        saldoSuficiente.await(); // Este m�todo lanza una excepci�n que est� puesta en el m�todo y que debe ser capturada en cada llamada al m�todo // Video 177 minuto 6

      }

      System.out.println(Thread.currentThread()); // Imprime en consola le hilo que hace la transferencia

      cuentas[cuentaOrigen] -= cantidad; // Resta del dinero de la 'cuentaOrigen' la cierta cantidad

      System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

      cuentas[cuentaDestino] += cantidad; // Aumenta cierta cantidad a la 'cuentaDestino'

      System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal()); // Getting saldo total formated

      saldoSuficiente.signalAll(); // Que avise a todos los hilos que ya pueden despertar para comprobar si ya se puede realizar alguna transferencia pendiente // Video 177 minuto 8

    } finally {

      soloUnHiloEjecutandoEsteMetodo.unlock(); // Desbloqueando el c�digo para que otro hilo pueda usarlo

    }

  }

  private Lock soloUnHiloEjecutandoEsteMetodo = new ReentrantLock(); // Intancia perteneciente a la clase 'ReentrantLock' /// Campo encapsulado de la interfaz 'Lock'

  public double getSaldoTotal() { // M�todo para devolver el saldo total combinado de todas las cuentas
    double sumaCuentas = 0;
    for(double a : cuentas) {
      sumaCuentas += a;
    }
    return sumaCuentas; // Suma de todos los valores que est�n dentro del array
  }

  private final double[] cuentas;

}

class EjecucionTransferencias4 implements Runnable{ // M�todo que har� transferencias infinitas

  public EjecucionTransferencias4(Banco5 b, int cuentaOrigen, double cantidadMaximaPermitida) { // Constructor
    banco = b;
    delaCuenta = cuentaOrigen;
    cantidadMax = cantidadMaximaPermitida;
  }

  @Override
  public void run() {

    while(true) { // Bucle infinito para transferencias infinitas

      int cuentaDestinoDeLaTranferencia = (int)(100*Math.random()); // Devolver� un n�mero entero entre 0 y 100

      double cantidadTransferencia = cantidadMax * Math.random(); // Cantidad para la tranferencia

      try { // Est� dentro de un try-catch porque el m�todo al que est� mandando llamar lanza una excepci�n
        banco.transferencia(delaCuenta, cuentaDestinoDeLaTranferencia, cantidadTransferencia); // Aqu� se manda a llamar al m�todo que hace la transferencia
      } catch (InterruptedException e1) {
        System.out.println("Error en la transferencia");
      }

      try {
        Thread.sleep((int)Math.random()*10); // Que espere por una cantidad de tiempo variable
      } catch (InterruptedException e) {
        System.out.println("Error intentando dormir el hilo de ejecuci�n");
      }

    }

  }

  private Banco5 banco;
  private int delaCuenta;
  private double cantidadMax;

}
