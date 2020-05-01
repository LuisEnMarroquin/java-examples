package pildoras;

public class P007_ConstantsOperators {
  public static void main(String[] args) {

    final int constante = 256;
    System.out.println("Constant value is: " + constante);

    int a = 250;
    int b = 250;
    int c = a + b;
    System.out.println("The value of the sum is: " + c);

    int d = 100;
    d += 75;
    System.out.println("The value of the sum is: " + d);

    // Convert cm to inches
    double cm = 6;
    final double inchesValue = 2.54;
    double resultado = cm / inchesValue;
    System.out.println("In " + cm + " cm there are " + resultado + " inches");

    // Declare and initialize a lot of variables in one line
    int num1 = 12, num2 = 23, num3 = 34;
    System.out.println(num1 + num2 + num3);

  }
}
