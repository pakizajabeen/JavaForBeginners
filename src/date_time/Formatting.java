package date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;

public class Formatting {
    public static void  main (String[] args)
    {
        // Printing CURRENT DATE
        LocalDate d = LocalDate.now();
        System.out.println(d);

        // Printing CURRENT TIME
        LocalTime t = LocalTime.now();
        System.out.println(t);

        // FORMATTING CURRENT DATE
        Date date = new  Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy z");
        System.out.println(format.format(date));

        // Printing a new DATE / TIME FORMAT
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, DD/MM/YY :: HH-mm-ss");
        System.out.println(dtf.format(dt));






    }

}

   // Date date = new Date();
//        System.out.println(date.toString());
//        System.out.println(date.getTime());
//        System.out.println(date.getMonth()+1);
//        System.out.println(1900+date.getYear());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy, M/dd HH:mm-ss");
//        System.out.println(sdf.format(date));
