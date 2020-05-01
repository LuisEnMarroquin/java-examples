package examples;

class CosineFor {
  public static void main(String args[]) {
    for (double i = 0; i < 1; i = i + 0.1) {
      System.out.println("Cosine of " + i + " is " + Math.cos(i));
    }
  }
}
