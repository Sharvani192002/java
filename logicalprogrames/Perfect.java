package logicalprogrames;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int s=0;
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0; i<num; i++){
            s=s+i;
        }
        if(num==s){
            System.out.println("perfect");
        }
        else{
            System.out.println("not");
        }

    }
}