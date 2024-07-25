package logicalprogrames;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i, m=0, flag=0,num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        m=num/2;
        if(num==0||num==1){
            System.out.println("not prime");
        }
        else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println("not prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");
            }
        }



    }
}

