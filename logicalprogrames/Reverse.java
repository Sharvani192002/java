package logicalprogrames;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num=12345, rev=0;
        System.out.println("Number " + num);
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reverse number " + rev);
    }
}
