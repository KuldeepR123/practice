package com.example.string.method;

import com.example.string.constant.*;

import java.util.Scanner;

public class WordToString {
    public static StringBuilder sb = new StringBuilder("");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = Integer.toString(n);

        if (str.length() > 4) {
            System.out.println("Invalid Input !");
        } else if (str.length() == 2) {
            if (str.endsWith("0")) {
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, str.length() - 1));
                TenToTwenty.setNumber(firstDigit);
            } else {
                if (str.charAt(0) == '1') {
                    int lastDigit = Integer.parseInt(Integer.toString(n).substring(str.length() - 1, str.length()));
                    ElevenToNineteen.setNumber(lastDigit);
                } else {
                    for (int i = 0; i < 2; i++) {
                        int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                        switch (i) {
                            case 0:
                                TenToTwenty.setNumber(firstDigit);
                                break;
                            case 1:
                                ZeroToNine.getFirstDigit(firstDigit);
                                break;
                        }
                    }
                }
            }
        } else if (str.length() == 3 && str.endsWith("0")) {
            for (int i = 0; i < str.length() - 1; i++) {
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                switch (i) {
                    case 0:
                        Hundred.getFirstDigit(firstDigit);
                        break;
                    case 1:
                        TenToTwenty.setNumber(firstDigit);
                        break;
                }
            }
        } else if (str.endsWith("000")) {
            int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
            Thousand.getFirstDigit(firstDigit);
        } else if (str.length() == 4 && str.endsWith("00")) {
            for (int i = 0; i < 2; i++) {
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                switch (i) {
                    case 0:
                        Thousand.getFirstDigit(firstDigit);
                        break;
                    case 1:
                        Hundred.getFirstDigit(firstDigit);
                        break;
                }
            }
        } else if (str.length() == 4 && str.endsWith("0")) {
            if (str.charAt(str.length() - 2) != '1') {
                for (int i = 0; i < str.length() - 1; i++) {
                    int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                    switch (i) {
                        case 0:
                            Thousand.getFirstDigit(firstDigit);
                            break;
                        case 1:
                            Hundred.getFirstDigit(firstDigit);
                            break;
                        case 2:
                            TenToTwenty.setNumber(firstDigit);
                            break;
                    }
                }
            }
        } else if (str.length() == 4 && str.charAt(1) == '0' && str.charAt(str.length() - 2) == '0') {
            TwoDigits.setString(n);
        } else if (str.length() == 4 && str.charAt(1) == '0') {
            OneZeroDigit.setString(n);
        } else if (str.length() == 4) {
            if (str.charAt(str.length() - 2) != '1') {
                for (int i = 0; i < str.length(); i++) {
                    int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                    switch (i) {
                        case 0:
                            Thousand.getFirstDigit(firstDigit);
                            break;
                        case 1:
                            Hundred.getFirstDigit(firstDigit);
                            break;
                        case 2:
                            TenToTwenty.setNumber(firstDigit);
                            break;
                        case 3:
                            ZeroToNine.getFirstDigit(firstDigit);
                            break;
                    }
                }
            } else {
                for (int i = 0; i < str.length() - 2; i++) {
                    int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                    switch (i) {
                        case 0:
                            Thousand.getFirstDigit(firstDigit);
                            break;
                        case 1:
                            Hundred.getFirstDigit(firstDigit);
                            break;
                    }
                }
                ElevenToNineteen.setNumber(Integer.parseInt(Integer.toString(n).substring(str.length() - 1, str.length())));
            }
        } else if (str.length() == 3 && str.endsWith("00")) {
            int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
            Hundred.getFirstDigit(firstDigit);
        } else if (str.length() == 3) {
            if (str.charAt(str.length() - 2) == '1') {
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
                Hundred.getFirstDigit(firstDigit);
                ElevenToNineteen.setNumber(firstDigit);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i + 1));
                    switch (i) {
                        case 0:
                            Hundred.getFirstDigit(firstDigit);
                            break;
                        case 1:
                            TenToTwenty.setNumber(firstDigit);
                            break;
                        case 2:
                            ZeroToNine.getFirstDigit(firstDigit);
                            break;
                    }
                }
            }
        } else {
            int firstDigit = Integer.parseInt(Integer.toString(n));
            ZeroToNine.getFirstDigit(firstDigit);
        }
        System.out.println(sb);
    }
}
