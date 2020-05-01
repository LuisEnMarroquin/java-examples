package pildoras;

public class Pi023$Arrays_Matrices { //Los arrays solo pueden almacenar datos del mismo tipo

  public static void main(String[] args) { // QueDatosAlmacenar�[] nombre = new TipoDeDatos[CantidadDeDatos];

    //Declarando una matriz para 5 datos de tipo entero.
    int[] nombre = new int[5];
    //Iniciando los valores de la matr�z en diferente linea que la declaraci�n.
    nombre[0]=15;
    nombre[1]=15;
    nombre[2]=15;
    nombre[3]=15;
    nombre[4]=15;

    //Declarando e iniciando una matriz en la misma linea.
    int [] matriz = { 15, 25, 8, -34, 2 };
    System.out.println("El cuarto valor de 'matriz' es: " + matriz[3] +"."); //Recordar que comienzan a contar los valores desde el 0.

    System.out.println("");

    //Otra forma de colocar los corchetes [].
    int mi_matriz [] = { -32, 73, 45, -39, 91, 35, 12, -94, -38, };
    for(int i=0; i<mi_matriz.length; i++) {
      System.out.println("El valor "+i+ " de 'mi_matriz' es " + mi_matriz[i] +".");
    }

  }

}
