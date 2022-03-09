package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        float Number_1_Pathak, Number_2_Pathak, Sum, Substraction, Product, Quotient;

        BufferedReader  BuffRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program calculates Sum, Substraction, Product, Quotient for two Numbers.");
        System.out.println("Please enter your first number and press Enter :");
        Number_1_Pathak = Float.parseFloat(BuffRead.readLine());
        System.out.println("Please enter your second number and press Enter :");
        Number_2_Pathak = Float.parseFloat(BuffRead.readLine());

        Sum = Number_1_Pathak + Number_2_Pathak;
        Substraction  = Number_1_Pathak - Number_2_Pathak;
        Product = Number_1_Pathak * Number_2_Pathak;
        Quotient = Number_1_Pathak / Number_2_Pathak;

        System.out.printf("You entered two numbers, the first is: " + "%2.2f", Number_1_Pathak);
        System.out.printf(" and the second is: " + "%2.2f", Number_2_Pathak);

        System.out.println();

        System.out.printf("Sum = " + "%2.2f, \n", + Sum);
        System.out.printf("Difference = " + "%2.2f, \n", + Substraction);
        System.out.printf("Product = " + "%2.2f, \n", + Product);
        System.out.printf("Quotient = " + "%2.2f, \n", + Quotient);



















    }
}
