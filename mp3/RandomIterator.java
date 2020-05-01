package random_mp3;

import java.util.Random;
import java.util.Vector;

public class RandomIterator {
  Vector<Integer> used; // records the numbers that have been generated so far
  int max; // highest number generated will be max-1
  Random select = new Random();

  // constructor
  public RandomIterator(int max) {
    used = new Vector<Integer>(max);
    this.max = max;
  }

  public int next() {
    int next = -1;
    boolean foundInt = false;
    if (used.size() == max)
      return -1;
    while (!foundInt) {
      next = select.nextInt(max);
      if (!used.contains(new Integer(next))) { // check whether number has already been generated
        used.add(new Integer(next));
        foundInt = true;
      }
    }
    return next;
  }

  public static void main(String[] args) {
    String[] set = { "A", "B", "C", "D", "E" };
    System.out.println("If you were in a fight with Batman, it would sound like this:\n");
    RandomIterator ri = new RandomIterator(set.length);
    int next = ri.next();
    while (next != -1) {
      if (next == -1)
        break;
      System.out.println(set[next] + "!");
      next = ri.next();
    }
  }

}
