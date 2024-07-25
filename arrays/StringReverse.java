package arrays;
class format{
    public static String revstring(String str){
        char ch[]=str.toCharArray();
        String rev ="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
public class StringReverse {
    public static void main(String[] args) {
        System.out.println(format.revstring("hello"));

        }

    }

