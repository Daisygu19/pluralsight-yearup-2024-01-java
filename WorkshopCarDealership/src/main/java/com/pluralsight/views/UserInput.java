package com.pluralsight.views;

import java.util.Scanner;

public class UserInput
{

    Scanner scanner = new Scanner(System.in);

    //What is the specific function of this?
    public String getUserInput(String message)
    {
        System.out.println();
        return scanner.nextLine().strip();
    }

    public void displayHomeScreen()
    {
        System.out.println();
        System.out.println("Welcome to Daisy's Car Dealership");
        System.out.println("---------------------------------");
        System.out.println();
    }


}
