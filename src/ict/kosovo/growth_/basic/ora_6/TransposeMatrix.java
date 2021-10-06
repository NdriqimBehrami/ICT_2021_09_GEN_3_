package ict.kosovo.growth_.basic.ora_6;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int transpose[][] = new int[3][3];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Normal Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

    }
}
