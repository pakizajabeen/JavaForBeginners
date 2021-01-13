package Format;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class formatting {

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double payment = sc.nextDouble();
        try {

            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

            String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);


            System.out.println("China" + ":" + china);
            System.out.println("US" + ":" + us);
            System.out.println("INDIA" + ":" + india);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
