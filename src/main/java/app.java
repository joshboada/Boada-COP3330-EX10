/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

    public class app {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();

        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        double subtotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double taxes= (subtotal*5.5)/100;
        double total = subtotal + taxes;

        System.out.println("Subtotal is: $" + subtotal);
        System.out.println("Tax is: $" + taxes);
        System.out.println("Total is: $" + total);

    }
}