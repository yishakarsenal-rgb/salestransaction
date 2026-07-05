/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salestransaction;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Salestransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double VAT_RATE = 0.15;
        System.out.print("enter number of customers");
        int customers = input.nextInt();
        for (int c = 1; c <= customers; c++) {
            System.out.print("enter number of items for customer " + c);
            int n = input.nextInt();
            double[] prices = new double[n];
            double total = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("enter price of item " + (i + 1) + ": ");
                prices[i] = input.nextDouble();
                total += prices[i];
            }
            double vat = total * VAT_RATE;
            double netPayment = total + vat;
            System.out.println("Customer: " + c );
            System.out.println("Total (before VAT): " + total);
            System.out.println("VAT (15%): " + vat);
            System.out.println("Net Payment: " + netPayment);
        }
        input.close();
    }
}
