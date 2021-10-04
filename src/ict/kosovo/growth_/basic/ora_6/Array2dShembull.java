package ict.kosovo.growth_.basic.ora_6;

public class Array2dShembull {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3},{3,4,1},{1,2,3}};
        for (int i = 0; i < matrix.length;i++){
            for (int j =0; j<matrix[0].length;j++){
                System.out.printf("%10d",matrix[i][j]);
            }
            System.out.println();
        }
    }

}
