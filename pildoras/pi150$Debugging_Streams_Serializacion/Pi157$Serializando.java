package pi150$Debugging_Streams_Serializacion; // Se crea el archivo "D:/empleado.dat" y luego se lee

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pi157$Serializando {

  public static void main(String[] args) {

    Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);

    jefe.setIncentivo(5000);


    Empleado[] personal=new Empleado[3]; // Array con 3 elementos

    personal[0]=jefe;

    personal[1]=new Empleado("Ana", 25000, 2008, 10,1);

    personal[2]=new Empleado("Luis", 18000, 2012, 9,15);

    try {

      ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("D:/empleado.dat")); // Creando stream de salida de datos // Guardar� un array

      escribiendoFichero.writeObject(personal); // Que escriba todo lo que hay en 'personal' en el archivo

      escribiendoFichero.close(); // Cerrando flujo de datos

      ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("D:/empleado.dat")); // Creando stream de entrada de datos // Recibir� un array

      Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject(); // Array de tipo 'Empleado' llamado 'personalRecuperado'

      recuperandoFichero.close(); // Cerrando flujo de datos

      for(Empleado e : personalRecuperado) {
        System.out.println(e);
      }

    } catch (Exception e) {

      System.out.println("\nHa ocurrido un error escribiendo el archivo");

    }

  }

}

class Empleado implements Serializable { // Con esta interfaz se le dice a la clase que puede convertirse en bytes



  public Empleado(String n, double s, int agno, int mes, int dia){

    nombre=n;

    sueldo=s;

    GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);

    fechaContrato=calendario.getTime();

  }



  public String getNombre() {
    return nombre;
  }

  public double getSueldo() {
    return sueldo;
  }

  public Date getFechaContrato() {
    return fechaContrato;
  }


  public void subirSueldo(double porcentaje){

    double aumento=sueldo*porcentaje/100;

    sueldo+=aumento;

  }

  public String toString(){ // El m�todo 'toString' es de la clase 'Object' y se usa para describir que es lo que hace la clase

    return "El Nombre del empleado " + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;

  }

  private String nombre;

  private double sueldo;

  private Date fechaContrato;

}

class Administrador extends Empleado{



    public Administrador(String n, double s, int agno, int mes, int dia){

      super(n,s,agno,mes,dia);

      incentivo=0;

    }

    public double getSueldo(){

      double sueldoBase=super.getSueldo();

      return sueldoBase + incentivo;

    }

    public void setIncentivo(double b){

      incentivo=b;
    }


    public String toString(){

      return super.toString() + " Incentivo=" + incentivo;

    }

    private double incentivo;

}
