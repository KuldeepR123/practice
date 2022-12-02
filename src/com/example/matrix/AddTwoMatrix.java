package com.example.matrix;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] array2 = {{1,2,3},{1,2,3},{1,2,3}};

        int firstMatrixRowLength = array1[0].length;
        int firstMatrixColLength = array1[1].length;
        int secondMatrixRowLength = array2[0].length;
        int secondMatrixColLength = array2[1].length;

        int[][] additionMatrix = new int[array1.length][array1.length];
        if((firstMatrixRowLength==secondMatrixRowLength) && (firstMatrixColLength == secondMatrixColLength)){
            for(int i=0; i< array1.length; i++){
                for(int j=0; j<array1.length; j++){
                    additionMatrix[i][j] = array1[i][j] + array2[i][j];
                }
            }
            for(int i=0; i< array1.length; i++){
                for(int j=0; j<array1.length; j++){
                    System.out.print(additionMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
