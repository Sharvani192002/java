package arrayprograms;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int [] array= new int[5];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
