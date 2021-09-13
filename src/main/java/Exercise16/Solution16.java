/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise16;

import java.util.Scanner;

public class Solution16
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age:");
        int age = scan.nextInt();

        int legalAge = 16;

        if (age < legalAge)
        {
            System.out.print("You are not old enough to legally drive.");
        }
        else
        {
            System.out.print("You are old enough to legally drive.");
        }
    }
}
