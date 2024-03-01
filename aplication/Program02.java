package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program02 {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();         // Mostra a data
        LocalDateTime d02 = LocalDateTime.now(); // Mostra a data e hora local
        Instant d03 = Instant.now();             // Mostra a data e hora de Londres

        LocalDate d04 = LocalDate.parse("2023-04-29");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-29T05:45:30");
        Instant d06 = Instant.parse("2023-04-29T05:45:30Z");
        Instant d07 = Instant.parse("2023-04-29T05:45:30-03:00");

        LocalDate d08 = LocalDate.parse("20/10/2023", format01);
        LocalDateTime d09 = LocalDateTime.parse("20/10/2023 18:15", format02);

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 01, 30); 

        System.out.println("d01: " + d01);  // Data local             (LocalDate)
        System.out.println("d02: " + d02);  // Data e hora local      (LocalDateTime)
        System.out.println("d03: " + d03);  // Data e hora de Londres (Instant)
        System.out.println("d04: " + d04);  // Alterando a data para 29/04/2023                  (LocalDate)
        System.out.println("d05: " + d05);  // Alterando a data e hora para 29/04/2023 05:45:30  (LocalDateTime)
        System.out.println("d06: " + d06);  // Alterando a data e hora para 29/04/2023 05:45:30Z (Instant)
        System.out.println("d07: " + d07);  // Alt. a data e hora para 29/04/2023 05:45:30-03:00 (Instant)
        System.out.println("d08: " + d08);  // Alterando a data para 20/04/2023 usando o formatter     (LocalDate)
        System.out.println("d09: " + d09);  // Altera. a data para 20/04/2023 18:15 usando o formatter (LocalDateTime)
        System.out.println("d10: " + d10);  // Alterando a data para 20/07/2022 usando o LocalDate.of  (LocalDate)
        System.out.println("d11: " + d11);  // Alterando a data para 20/07/2022 01:30 com LocalDate.of (LocalDateTime)
    }

}
