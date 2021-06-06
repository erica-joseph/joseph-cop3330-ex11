import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        DecimalFormat df2 = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double amtEuros = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        double conRate = sc.nextDouble();

        // c_to / c_frame = rate
        // us / euro = u/e
        // e * u/e = u
        double finalConversion = amtEuros * conRate;

        System.out.println( amtEuros +" euros at an exchange rate of " + conRate + " is");
        System.out.println( df2.format(finalConversion) + " U.S. dollars.");


    }
}
