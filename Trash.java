public class Trash {
  public static void main(String[] args) {
    int m = 6;
    System.out.println(m*=3);
    int a = 10;
    do {
      System.out.println(a);
      a-=2;
    } while (a >= 0);
    for(int z=10; z>=1; z--){
      System.out.println("z" + z);
    }
  }
}
