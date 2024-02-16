package com.pluralsight.views;

import java.util.Scanner;

public class UserInput
{

    Scanner scanner = new Scanner(System.in);

    public void displayHomeScreen()
    {
        System.out.println();
        System.out.println("Welcome to Daisy's Car Dealership");
        System.out.println("---------------------------------");
        System.out.println();
    }

    public String getDealersName()
    {
        System.out.println("Enter dealer name: ");
        return scanner.nextLine().strip();
    }


}
