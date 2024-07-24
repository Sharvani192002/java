package basicjava;

public class Power {
    public static void main(String[] args) {
        int exp= Integer.parseInt(args[0]);
        if(exp<31&& exp>=0){
            for(int i=0;i<=exp;i++){
                System.out.println("2^ " + i +"=" + Math.pow(2,i));
            }
        }
        else{
            System.out.println("overflow");
        }
    }
}
