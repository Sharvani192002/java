package arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] array1={{2,4,5},{4,5,6}};
        int [][] array2={{3,5,6}, {3,5,6}};
        int mul[][]= new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                mul[i][j]=array1[i][j]*array2[i][j];
                System.out.print(mul[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
