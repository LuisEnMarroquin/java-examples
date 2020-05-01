import java.util.Scanner;

class App {
  public static void main(String[] args) {

    System.out.println("Teclea la secuencia de numeros:");

    int f1 = 1; String s1 = ""; Scanner n1 = new Scanner(System.in); s1 = n1.nextLine(); int x1 = Integer.parseInt(s1); n1.close(); if (x1 > 0) { f1 = 0; }
    int f2 = 1; String s2 = ""; Scanner n2 = new Scanner(System.in); s2 = n2.nextLine(); int x2 = Integer.parseInt(s2); n2.close(); if (x2 > 0) { f2 = 0; }
    int f3 = 1; String s3 = ""; Scanner n3 = new Scanner(System.in); s3 = n3.nextLine(); int x3 = Integer.parseInt(s3); n3.close(); if (x3 > 0) { f3 = 0; }
    int f4 = 1; String s4 = ""; Scanner n4 = new Scanner(System.in); s4 = n4.nextLine(); int x4 = Integer.parseInt(s4); n4.close(); if (x4 > 0) { f4 = 0; }
    int f5 = 1; String s5 = ""; Scanner n5 = new Scanner(System.in); s5 = n5.nextLine(); int x5 = Integer.parseInt(s5); n5.close(); if (x5 > 0) { f5 = 0; }
    int f6 = 1; String s6 = ""; Scanner n6 = new Scanner(System.in); s6 = n6.nextLine(); int x6 = Integer.parseInt(s6); n6.close(); if (x6 > 0) { f6 = 0; }
    int f7 = 1; String s7 = ""; Scanner n7 = new Scanner(System.in); s7 = n7.nextLine(); int x7 = Integer.parseInt(s7); n7.close(); if (x7 > 0) { f7 = 0; }
    int f8 = 1; String s8 = ""; Scanner n8 = new Scanner(System.in); s8 = n8.nextLine(); int x8 = Integer.parseInt(s8); n8.close(); if (x8 > 0) { f8 = 0; }
    int f9 = 1; String s9 = ""; Scanner n9 = new Scanner(System.in); s9 = n9.nextLine(); int x9 = Integer.parseInt(s9); n9.close(); if (x9 > 0) { f9 = 0; }
    int f0 = 1; String s0 = ""; Scanner n0 = new Scanner(System.in); s0 = n0.nextLine(); int x0 = Integer.parseInt(s0); n0.close(); if (x0 > 0) { f0 = 0; }

    System.out.println("La mascara que le corresponde es: " + f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9 + f0 );

  }
}
