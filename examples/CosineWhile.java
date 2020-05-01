package examples;

class CosineWhile {
  public static void main(String args[]) {
    double i = 0;
    while (i < 1) {
      System.out.println("Cosine of " + i + " is " + Math.cos(i));
      i = i + 0.1;
    }
  }
}
