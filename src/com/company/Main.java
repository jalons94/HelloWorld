package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
            String name = "";
            System.out.print("Enter your name: ");
            name = keyboard.nextLine();
            System.out.println("Welcome " + name + "!... I see that you are working from Tree Top!");
    }
}
