package DatesAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesTime {
    public static void main(String[] args) {
        
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now(); 
        System.out.println(date);

        LocalTime time = LocalTime.now(); 
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(); 
        System.out.println(dateTime);

        Instant instant = Instant.now(); 
        System.out.println(instant);

        // Custom format - check the official java documentation for formats 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter); 
        System.out.println(newDateTime);

        // Custom DateTime object

        LocalDate dateCustom = LocalDate.of(2026, 12, 24);
        System.out.println(dateCustom);

        LocalDateTime dateTimeCustom = LocalDateTime.of(2026, 12, 24, 12, 0, 0);    // y, m, d, h, m, s
        System.out.println(dateTimeCustom);

        // compare times

        LocalDateTime dateTimeCustom2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(dateTimeCustom);
        System.out.println(dateTimeCustom2);

        if(dateTimeCustom.isBefore(dateTimeCustom2)){
            System.out.println(dateTimeCustom + " is earlier than " + dateTimeCustom2);
        }
        else if(dateTimeCustom.isAfter(dateTimeCustom2)){
            System.out.println(dateTimeCustom + " is later than " + dateTimeCustom2);
        }
        else if(dateTimeCustom.isEqual(dateTimeCustom2)){
            System.out.println(dateTimeCustom + " is equal to " + dateTimeCustom2);
        }
    }
}
