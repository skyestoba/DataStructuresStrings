package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String murder = "murder";
        String crimes = "crimes";
        String darkness = "darkness";
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter your deepest darkest thoughts");
        String secret = scanner.nextLine();
        if(secret.contains(murder)){
            System.out.println("Your deepest darkest secret contains the word 'murder'");
        }
        if(secret.contains(crimes)){
            System.out.println("Your deepest darkest secret contains the word 'crimes'");
        }
        if(secret.contains(darkness)){
            System.out.println("Your deepest darkest secret contains the word 'darkness'");
        }
        System.out.println("Cool Secret!");
        }
    }

