package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Country (UK, UKR, CHN, JPN, EG, ETH)");
        Scanner scanner = new Scanner(System.in);
        String cnt = scanner.nextLine();
        switch (cnt){
            case "UK" : case "UKR":
                System.out.println(Continent.Europa);break;
            case "CHN" : case "JPN":
                System.out.println(Continent.Asia);break;
            case "EG" : case  "ETH":
                System.out.println(Continent.Africa);break;
            default:
                System.out.println("Wrong");
        }
    }

    public enum Continent {
        Europa , Asia, Africa
    }
}
