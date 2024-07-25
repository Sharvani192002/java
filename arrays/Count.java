package arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr1={9,7,6,5,4};
        int count=0;
        int ct=0;
        for(int i=0; i< arr1.length;i++){
            if(arr1[i]%2==0){
                count++;

            }
            else{
                ct++;
            }
        }
        System.out.println("even count " + count);
        System.out.println("odd count " + ct);
        }
    }

