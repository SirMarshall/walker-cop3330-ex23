/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variable
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String response;

        //If-gate logic
        while (counter != 1)
        {
            System.out.println("Is the car silent when you turn the key?");
            response = input.next();
            if (response.equals("yes"))
            {
                System.out.println("Are the battery terminals corroded?");
                response = input.next();
                if (response.equals("yes"))
                {
                    System.out.println("Clean terminals and start again.");
                    counter = 1;
                }
                else
                {
                    System.out.println("Replace cables and try again.");
                    counter = 1;
                }
            }
            else
            {
                System.out.println("Does the car make a slicking noise?");
                response = input.next();
                if (response.equals("yes"))
                {
                    System.out.println("Replace the battery.");
                    counter = 1;
                }
                else
                {
                    System.out.println("Does the car crank up but fail to start?");
                    response = input.next();
                    if (response.equals("yes"))
                    {
                        System.out.println("Check spark plug connections.");
                        counter = 1;
                    }
                    else
                    {
                        System.out.println("Does the engine start and then die?");
                        response = input.next();
                        if (response.equals("yes"))
                        {
                            System.out.println("Does your car have fuel injection?");
                            response = input.next();
                            if (response.equals("yes"))
                            {
                                System.out.println("Get it in for professional service.");
                                counter = 1;
                            }
                            else
                            {
                                System.out.println("Check to ensure the choke is opening and closing.");
                                counter = 1;
                            }
                        }
                        else
                        {
                            System.out.println("This should not be possible. Good luck!");
                            counter = 1;
                        }
                    }
                }
            }
        }
        System.out.println("Goodbye!");
    }
}
