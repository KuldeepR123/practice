package com.example.string;

public class StringPrint {
    public static void setString(int length) {
        if (length >= 13 && length <= 15) {
            Main.sb.append("trillions" + " ");
        } else if (length >= 10 && length <= 12) {
            Main.sb.append("billions" + " ");

        } else if (length >= 7 && length <= 9) {
            Main.sb.append("millions" + " ");

        } else if (length >= 4 && length <= 6) {
            Main.sb.append("thousand" + " ");

        } else if (length >= 1 && length <= 3) {
            Main.sb.append("hundred" + " ");

        } else {
            System.out.println("Invalid Input !");
        }
    }
}
