package pi179$Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Pi180$Colecciones_CuentasUsuarios {

  public static void main(String[] args) {

    // Creando objetos de tipo cliente
    Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
    Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
    Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
    Cliente cl4 = new Cliente("Julio Iglesias", "00004", 300000);

    // Creando colecci�n de tipo 'Set' usando la clase 'HashSet' debido a que esta implementa la interfaz 'Set' // Interfaz Set // Colecci�n de tipo HashSet (Ventajas HashSet: No permite duplicados, Uso sencillo del m�todo add que ademas asegura no elementos duplicados || Inconvenientes: No tiene acceso aleatorio y poca eficiencia a la hora de ordenar elementos)
    Set <Cliente> clientesBanco = new HashSet <Cliente>(); // 'clientesBanco' ser� el nombre de la colecci�n // Set es una interfaz y como no se puede instanciar directamente una interfaz se ocupe intanciar la clase 'HashSet' que ya implementa esta interfaz

    // Agregando elementos a la colecci�n
    clientesBanco.add(cl1); // EL m�todo '.add' de la interfaz 'Set' permite agregar elementos del tipo genetico que se especific� antes
    clientesBanco.add(cl2);
    clientesBanco.add(cl3);
    clientesBanco.add(cl4);

    for (Cliente cliente : clientesBanco) { // bucle 'for each' para mostrar en consola los elementos de la colecci�n // Eclipse autogenerated 'for each' = fore -> SPACE -> ENTER
      System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() + " " + cliente.getSaldo()); // No hay criterio de ordenacion // La clase 'HashSet' no permite ordenar
    }

  }

}

class Cliente { // AutoGenerate 'getters' and 'setters' in Eclipse: Source -> Generate getters and setters... -> Select all

  public Cliente(String nombre, String nCuenta, double saldo) { // Constructor // Cuando se instancie la clase Cliente habr� que especificar estos 3 datos
    this.nombre = nombre; // Almacenando los par�metros en los campos de clase
    this.nCuenta = nCuenta;
    this.saldo = saldo;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getnCuenta() {
    return nCuenta;
  }
  public void setnCuenta(String nCuenta) {
    this.nCuenta = nCuenta;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  private String nombre;
  private String nCuenta;
  private double saldo;

}