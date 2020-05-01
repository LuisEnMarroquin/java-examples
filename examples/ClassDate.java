package examples;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ClassDate {

  public static void main(String[] args) {

    System.out.println(LocalDate.now()); // 1 forma de crear una fecha

    System.out.println(LocalDate.of(2018, 10, 10));

    try {
      System.out.println(LocalDate.of(999999, 12, 32));
    } catch (DateTimeException e) {
      System.out.println("Fecha Incorrecta");
    }

    System.out.println(LocalTime.now()); // 2 forma de crear una fecha

    System.out.println(LocalDateTime.now()); // 3 forma de crear una fecha

    System.out.println("//////////////////////////////////////////////////");

    System.out.println("Cumplea�os de To�o");
    LocalDate cumple = LocalDate.of(1996, Month.MARCH, 28);
    System.out.println("To�o cumple a�os el " + cumple);

    System.out.println(cumple.plusDays(2)); // Imprime un aumento de 2 d�as a la fecha
    cumple.plusDays(2); // Aumentando 2 d�as a la fecha
    System.out.println(cumple); // No imprime los 2 d�as extra porque la variable es inmutable

    cumple = cumple.plusDays(2); // Esta es la �nica forma de aumentar 2 d�as
    System.out.println(cumple); // Imprimiendo la fecha ya aumentada con los 2 d�as

    cumple = cumple.plusWeeks(2); // Aumentando 2 semanas la fecha de 'cumple'
    System.out.println(cumple); // El valor de la variable no va a cambiar al menos que se vuelva a asignar

    System.out.println("//////////////////////////////////////////////////");

    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, 1990);
    System.out.println(c.get(Calendar.YEAR));

    System.out.println("//////////////////////////////////////////////////");

    LocalDate daniel = LocalDate.of(1993, 11, 9);
    daniel.getDayOfYear();
    DateTimeFormatter F = DateTimeFormatter.ofPattern("hh:mm"); // Solo funciona en 'Java 8' = Es para darle un formato
                                                                // a la fecha
    F.format(LocalTime.now());
    System.out.println(F); // As� no funciona
    System.out.println(F.format(LocalTime.now())); // As� si funciona

  }

}
