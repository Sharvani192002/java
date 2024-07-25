package arrays;

import java.util.ArrayList;

public class Seperate {
    public static void main(String[] args) {
        int [] array={2,-4,-8,5,-9,3};
        ArrayList<Integer> positive= new ArrayList<>();
        ArrayList<Integer> negative= new ArrayList<>();
        for(int num : array){
            if(num>=0){
                positive.add(num);
            }
            else{
                negative.add(num);
            }
        }
        System.out.println("positive numbers" + positive);
        System.out.println("negative number" + negative);




    }
}
