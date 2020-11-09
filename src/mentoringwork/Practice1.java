package mentoringwork;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Practice1 {
    public static void main(String[] args) {
        printTodaysDate();
    }
    public static void printTodaysDate() {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));


        LocalDate printDate = LocalDate.now();
        System.out.println(java.time.LocalDate.now());
    }

    }


