package pildoras;

public class P011_ClassString {
  public static void main(String[] args) {

    String myName = "Luis"; // A String is always double quoted
    System.out.println("My name is " + myName);
    System.out.println("My name has " + myName.length() + " letters");
    System.out.println("The first letter of " + myName + " is " + myName.charAt(0));
    int lastLetter = myName.length();
    System.out.println("The last letter of " + myName + " is " + myName.charAt(lastLetter - 1));

    // Subtring: Extracting some characters from a String
    String frase = "Today is a great day to code";
    String frase_resume = frase.substring(11);
    System.out.println(frase_resume);
    String frase_resumen = frase.substring(11, 20) + " to play";
    System.out.println(frase_resumen);

    // Equals: Compare Strings
    String al1 = "David";
    String al2 = "david";
    System.out.println("With equals " + al1.equals(al2));
    System.out.println("With equalsIgnoreCase " + al1.equalsIgnoreCase(al2));

  }
}
