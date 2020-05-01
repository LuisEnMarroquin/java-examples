package examples;

import java.util.Scanner;

public class NumberInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char s[] = { '*', '#', '#', '#', '#', '#', '#', '#', '#', '#' };
    int ind = 0;

    while (true) {
      System.out.println(s);
      System.out.print("Enter a number please: ");
      int numero = in.nextInt();

      if (numero == 0) {
        break;
      }
      if (numero > 0) {
        for (int i = 1; i < numero + 1; i++) {
          if (ind == 9) {
            continue;
          }
          s[ind] = '#';
          s[++ind] = '*';
        }
      } else {
        for (int i = -1; i > numero - 1; i--) {
          if (ind == 0) {
            continue;
          }
          s[ind] = '#';
          s[--ind] = '*';
        }
      }
    }

    in.close();
    System.out.println("Cerrar");
  }
}
