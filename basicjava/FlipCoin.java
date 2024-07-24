package basicjava;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("The num of coins: ");
        int c=sc.nextInt();
        System.out.println(Math.random());
        if(Math.random()<0.5){
            System.out.println("The percentage of Tails:" + Math.random()/c*100);
        }
        else{
            System.out.println("The percentage of heads:" +Math.random()/c*100);
        }

        C:\Users\sharvan.iikkurti\IdeaProjects\Java Problems1

    }
}
