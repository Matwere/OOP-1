package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input results:");
        Scanner input = new Scanner(System.in);
        int kcse = input.nextInt();
        int interview = input.nextInt();
        int confidence = input.nextInt();

        if ((kcse >= 65) && (interview >= 6))
        {
            System.out.println("You have passed and admitted to the University");
        }
        if ((kcse >= 65) && (confidence >= 5))
        {
            System.out.println("You have passed and admitted to the University");
        }
        else if (kcse <= 65)
        {
            System.out.println("You have failed and are rejected from the University");
        }
    }
}

