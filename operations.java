// Declare two numeric variables and show sum, subtraction, multiplication, division, and module
import java.util.InputMismatchException;
import java.util.Scanner;

public class operations {
  public static void main(String[] args) {

    Scanner myInput = new Scanner(System.in);
    int num1 = 1, num2 = 1;
    boolean errorIs2 = false;

    try {
      System.out.println("Enter number 1: "); num1 = myInput.nextInt();
      errorIs2 = true;
      System.out.println("Enter number 2: "); num2 = myInput.nextInt();
    } catch (InputMismatchException e) { // When (value !== number)
      if (errorIs2) System.out.println("You should only enter integer numbers, the second will be taken as 1");
      else System.out.println("You should only enter integer numbers, both numbers will be taken as 1");
    }

    myInput.close();
    System.out.println("Addition: " + (num1 + num2));
    System.out.println("Subtraction: " + (num1 - num2));
    System.out.println("Multiplication: " + (num1 * num2));

    if (num2 == 0) {
      System.out.println("Division: " + 0);
      System.out.println("Module: " + 0);
    } else {
      System.out.println("Division: " + (num1 / num2));
      System.out.println("Module: " + (num1 % num2));
    }

    if (num1 > num2) {
      System.out.println("The greater number is " + num1 + " and the smaller number is " + num2);
    } else if (num2 > num1) {
      System.out.println("The greater number is " + num2 + " and the smaller number is " + num1);
    } else {
      System.out.println("Number " + num1 + " and number " + num2 + " are equal");
    }

  }
}
