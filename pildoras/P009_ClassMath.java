package pildoras;

public class P009_ClassMath {
  public static void main(String[] args) {

    int num0 = 9;
    double root = Math.sqrt(num0); // Math.sqrt returns double
    System.out.println("The square root of " + num0 + " is " + root); // Will print 3.0

    float num1 = 5.85F;
    int r1 = Math.round(num1); // Math.round can get a float and return int or get a double and return long
    System.out.println(num1 + " rounded is " + r1);

    double num2 = 5.85F;
    int r2 = (int) Math.round(num2); // Parse means to turn a datatype into other
    System.out.println(num2 + " rounded is " + r2);

    double base = 5, power = 3; // Math.pow is to raise a number to a power
    int answer = (int) Math.pow(base, power); // Math.pow gets 2 doubles and returns double
    System.out.println("Number " + base + " raised to " + power + " is " + answer);

  }
}
