package logicalprogrames;

public class Average {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i] ;

        }
        System.out.println(sum);
        float avg=(float) sum/arr.length;
        System.out.println(avg);
    }

}
