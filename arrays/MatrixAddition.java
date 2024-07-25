package arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int [][] arr3 ={{1,2,3} , {4,5,6}};
        int [][] arr4= {{3,5,7}, {8,9,7}};
        int [][] sum= new int[2][2];
        for(int i=0; i<2;i++){
            for(int j=0; j<2; j++){
                sum[i][j]=arr3[i][j]+arr4[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();

        }

    }
}
