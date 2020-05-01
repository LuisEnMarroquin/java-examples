package pi168$Threads;

public class Pi173$BancoSinSincronizar {

  public static void main(String[] args) {



  }

}

class Banco {

  public Banco() {

    cuentas = new double[100]; // Habr� 100 cuentas

    for(int i = 0; i < cuentas.length; i++) { // Creando 100 cuentas
      cuentas[i] = 2000; // Asignando $2000 a cada cuenta
    }

  }

  public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) { // M�todo para las transferencias

    if(cuentas[cuentaOrigen] < cantidad) { // Si el dinero de la cuenta de origen es menor que 'cantidad' (lo que se va a transferir)
      return;
    }

    System.out.println("El hilo que est� haciendo la transferencia es: " + Thread.currentThread());

    cuentas[cuentaOrigen] -= cantidad; // Resta del dinero de la 'cuentaOrigen' la cierta cantidad

    System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

    cuentas[cuentaDestino] += cantidad; // Aumenta cierta cantidad a la 'cuentaDestino'

    System.out.printf("Saldo total: %10.2fn", getSaldoTotal()); // Getting saldo total formated

  }

  public double getSaldoTotal() { // M�todo para devolver el saldo total todas las cuentas a la vez
    double sumaCuentas = 0;
    for(double a : cuentas) {
      sumaCuentas += a;
    }
    return sumaCuentas; // Suma de todos los valores que est�n dentro del array
  }

  private final double[] cuentas;

}
