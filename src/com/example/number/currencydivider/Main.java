package com.example.number.currencydivider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number > 0) {
            if (number >= Constants.TWO_THOUSAND) {
                int reminder = number / Constants.TWO_THOUSAND;
                System.out.println(Constants.TWO_THOUSAND + " : " + reminder);
                number = number % Constants.TWO_THOUSAND;
            } else if (number >= Constants.ONE_THOUSAND) {
                int reminder = number / Constants.ONE_THOUSAND;
                System.out.println(Constants.ONE_THOUSAND + " : " + reminder);
                number = number % Constants.ONE_THOUSAND;
            } else if (number >= Constants.FIVE_HUNDRED) {
                int reminder = number / Constants.FIVE_HUNDRED;
                System.out.println(Constants.FIVE_HUNDRED + " : " + reminder);
                number = number % Constants.FIVE_HUNDRED;
            } else if (number >= Constants.TWO_HUNDRED) {
                int reminder = number / Constants.TWO_HUNDRED;
                System.out.println(Constants.TWO_HUNDRED + " : " + reminder);
                number = number % Constants.TWO_HUNDRED;
            } else if (number >= Constants.HUNDRED) {
                int reminder = number / Constants.HUNDRED;
                System.out.println(Constants.HUNDRED + " : " + reminder);
                number = number % Constants.HUNDRED;
            } else if (number >= Constants.FIFTY) {
                int reminder = number / Constants.FIFTY;
                System.out.println(Constants.FIFTY + " : " + reminder);
                number = number % Constants.FIFTY;
            } else if (number >= Constants.TWENTY) {
                int reminder = number / Constants.TWENTY;
                System.out.println(Constants.TWENTY + " : " + reminder);
                number = number % Constants.TWENTY;
            } else if (number >= Constants.TEN) {
                int reminder = number / Constants.TEN;
                System.out.println(Constants.TEN + " : " + reminder);
                number = number % Constants.TEN;
            } else if (number >= Constants.FIVE) {
                int reminder = number / Constants.FIVE;
                System.out.println(Constants.FIVE + " : " + reminder);
                number = number % Constants.FIVE;
            } else if (number >= Constants.TWO) {
                int reminder = number / Constants.TWO;
                System.out.println(Constants.TWO + " : " + reminder);
                number = number % Constants.TWO;
            } else {
                int reminder = number / Constants.ONE;
                System.out.println(Constants.ONE + " : " + reminder);
                number = number % Constants.ONE;
            }
        }
    }
}
