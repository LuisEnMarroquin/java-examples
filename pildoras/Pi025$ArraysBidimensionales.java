package pildoras;

public class Pi025$ArraysBidimensionales { //Los Arrays Bidimensionales no existen en Java como tal, si no que se trata de un array dentro de otro array.

  /**
   * @param args
   */
  public static void main(String[] args) { //Una matriz bidimensional se declara casi igual a una matriz normal, lo que cambia es que se ponen 2 corchetes al principio y 2 corchetes al final.

    int [] [] matrix = new int [4] [5]; //Es una matr�z de 4 por 5.

    matrix[0][0]=15;
    matrix[0][1]=14;
    matrix[0][2]=18;
    matrix[0][3]=34;
    matrix[0][4]=-9;

    matrix[1][0]=25;
    matrix[1][1]=17;
    matrix[1][2]=-8;
    matrix[1][3]=32;
    matrix[1][4]=97;

    matrix[2][0]=34;
    matrix[2][1]=-2;
    matrix[2][2]=-4;
    matrix[2][3]=98;
    matrix[2][4]=12;

    matrix[3][0]=-5;
    matrix[3][1]=44;
    matrix[3][2]=-8;
    matrix[3][3]=33;
    matrix[3][4]=23;

    System.out.println("El valor almacenado en la posici�n 2,3 es: " + matrix[2][3] + "."); System.out.println(""); //Ver el valor en una posici�� determinada.

    System.out.println("Imprimiendo el valor del array bidimensional 'matrix' con bucles for anidados.");
    for(int i=0; i<4; i++) {
      for(int j=0; j<5; j++) { //Este es un 'Bucle For Anidado' ya que es un Bucle For dentro de otro Bucle For.
        System.out.println("El valor de la posici�n "+ i + "," + j + " es: "  + matrix[i][j] + ".");
      }
    }

    System.out.println(" ");

    System.out.print("Imprimiendo el valor del array bidimensional 'matrix' en forma de tabla.");
    for(int i=0; i<4; i++) {
      System.out.println();
      for(int j=0; j<5; j++) { //Este es un 'Bucle For Anidado' ya que es un Bucle For dentro de otro Bucle For.
        System.out.print(matrix[i][j] + " ");
      }
    }

    System.out.println(""); System.out.println("");

    System.out.println("Video 26"); System.out.println("");

    System.out.println("Haciendo una matr�z nueva llamada 'matriz' con declaraci�n e inicaci�n en la misma linea.");

    int [][] matriz = {
      { 3, 4, 5, 2, -5 },
      { 2, 87, 2, 1, 0 },
      { -7, 2, 4, 1, 7 },
      { 4, 34, 3, 4, 4 }
    };

    System.out.println("");

    System.out.print("Imprimiendo el valor del array bidimensional 'matriz' en forma de tabla.");
    for(int i=0; i<4; i++) {
      System.out.println();
      for(int j=0; j<5; j++) { //Si se exceden los l�mites del array (por ejemplo poniendo j<6) dir� ArrayIndexOutOfBoundsException
        System.out.print(matriz[i][j] + " ");
      }
    } System.out.println(); System.out.println();

    System.out.print("Recorriendo el array bidimensional 'matriz' con un bucle for each (for mejorado)");

    for(int [] fila:matriz) {
      System.out.println();
      for(int z: fila) {
        System.out.print(z + " ");
      }
    } System.out.println(); System.out.println();

    System.out.println("Banco"); //Imprimir� el inter�s del 10% al 15%. Est� en horizontal.

    double acumulado;
    double interes = 0.10; // Comienza con un interes de 10%.

    double saldo [][] = new double [6][5]; //Creando el Array Saldo

    //Rellenando el Array Saldo.

    for(int i=0; i<6; i++) { //Bucle For para recorrer la primera dimensi�n del array.

      saldo[i][0] = 10_000;
      acumulado = 10_000;

      for(int j=1; j<5; j++) { // Es 'j=1' porque ya habr� recorrido la posici�n 0 del array al inicio del bucle anterior

        acumulado = acumulado+ (acumulado * interes); //Se incrementa el saldo con el inter�s correspondiente.
        saldo[i][j] = acumulado; // Que vaya rellevando el array con las posiciones de 'i' y 'j'

      }
      interes = interes + 0.01; // Cada que llegue aqu� incrementar� el inter�s un 1%
    }

    //Imprimiendo en consola el Array Banco.

    int v=10;
    for(int z=0; z<6; z++) {

      System.out.println("");
      System.out.print(v + "% ");
      v++;

      for(int h=0; h<5; h++) {
        System.out.printf("%1.2f",saldo[z][h]); //Para imprimir con solo 2 decimales cada n�mero.
        System.out.print(" "); //Para dejar espacio entre cada uno.
      }

    }

  }

}
