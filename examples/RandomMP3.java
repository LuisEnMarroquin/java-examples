package examples;

import java.util.concurrent.TimeUnit;

public class RandomMP3 {
  public static void main(String[] args) {

    String[] arr = { "Yesterday_The Beatles_5", "Stairway To Heaven_Led Zeppelin_3", "Rocket Queen_Guns N' Roses_4" };
    String[] arr2 = new String[arr.length];
    int aleatorio, counter = 0;
    boolean isRepeated;

    do {
      isRepeated = false;
      aleatorio = (int) (Math.random() * arr.length);
      for (int i = 0; i < arr.length; i++) {
        if (arr[aleatorio] == arr2[i]) {
          isRepeated = true;
        }
      }
      if (isRepeated) continue; // This will go to the start of the while loop
      arr2[counter] = arr[aleatorio];
      counter++;
    } while (counter < arr.length);

    String[] all;
    String song, artist;
    int seconds;

    for (String music : arr2) {
      all = music.split("_");
      song = all[0];
      artist = all[1];
      seconds = Integer.parseInt(all[2]);
      System.out.println("Playing: " + song + ", by: " + artist);
      try { // https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
        for (int i = 0; i < seconds; i++) {
          System.out.println("Time: 0:0" + (i + 1) + " - 0:0" + seconds);
          TimeUnit.SECONDS.sleep(1);
        }
      } catch (InterruptedException e) {
        System.out.println("Error playing song");
        e.printStackTrace();
      }
    }

  }
}
