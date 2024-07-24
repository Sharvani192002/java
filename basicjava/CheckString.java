package basicjava;

public class CheckString {
    public static void main(String[] args) {
        String s1="Sharvani";
        String s2="shravani";
        String s3= "Java";
        String s4="Java";
        System.out.println(s1.equals(s2));
        if(s3==s4){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
