// Currency Converter 

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, result = 0;
        int from, to;

        System.out.println("=== Currency Converter ===");
        //input
        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        // currency type
        System.out.println("From Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        from = sc.nextInt();

        System.out.println("To Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        to = sc.nextInt();

        if(from == 1 && to == 2)        // rupy to dollar
            result = amount / 83;

        else if(from == 2 && to == 1)   //dollar to rupy
            result = amount * 83;

        else if(from == 1 && to == 3)   // rupy to euro
            result = amount / 90;

        else if(from == 3 && to == 1)   // euro to rupy
            result = amount * 90;

        else if(from == 2 && to == 3)   //dollar to euro
            result = amount * 0.9;

        else if(from == 3 && to == 2)   // euro to dollar
            result = amount / 0.9;

        else if(from == to)             // same currency
            result = amount;

        else
            System.out.println("Invalid choice!");

       
        System.out.println("Converted Amount = " + result);

        sc.close();
    }
}