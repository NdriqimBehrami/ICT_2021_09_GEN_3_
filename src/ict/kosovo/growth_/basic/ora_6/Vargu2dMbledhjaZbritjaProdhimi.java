package ict.kosovo.growth_.basic.ora_6;

public class Vargu2dMbledhjaZbritjaProdhimi {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[][] = {{1, 3, 4},  {2,7,8},{2,2,5}};
        int sum = 0;
        int[][]c= new int[3][3];
        System.out.println("=========================");
        System.out.println("Mbledhja");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                c[i][j] =sum+ a[i][j];
                System.out.print( c[i][j]);

            }
            System.out.println();

        }
        System.out.println("=========================");
        System.out.println("Zbritja");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                c[i][j] = a[i][j]-sum;
                System.out.print( c[i][j]);

            }
            System.out.println();

        }

        System.out.println("=========================");
        System.out.println("Prodhimi");
        int sum1 = 1;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                c[i][j] =sum1+ a[i][j];
                System.out.print( c[i][j]);

            }
            System.out.println();

        }






    }
}
