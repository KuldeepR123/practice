package com.example.pattern;

public class EighthPattern {
    private static void getPattern(int n){
        if(n!=1 && n%2!=0){
            int firstHalf = n/2;
            for(int i=0; i<firstHalf; i++){
                for(int j=0;j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for(int i=n; i>firstHalf; i--){
                for(int j = firstHalf+1; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        EighthPattern.getPattern(17);
        String str = "1201";
        System.out.println(str.charAt(str.length()-2));
    }
}
