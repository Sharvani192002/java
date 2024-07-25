package logicalprogrames;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int num ,s=0;
        Scanner sc= new Scanner(System.in);
         num=sc.nextInt();
        int i=1;
        while(i<num/2){

            if(num%i==0){
                s=s+i;
            }
            i++;
        }
        if(num==s){
            System.out.println("perfect");
        }
        else{
            System.out.println("not");
        }

    }
}