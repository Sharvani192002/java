package strings;

public class Frequency {
    public static void main(String[] args) {
        String str3 = "Apple";
        int[] freq = new int[str3.length()];
        int i, j;
        char[] string = str3.toCharArray();
        for (i = 0; i < str3.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str3.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }


        }


        System.out.println("frequency");
        for (; i < freq.length; )
            if (string[i] != ' ' && string[i] != 0)
                System.out.println(string[i] + "-" + freq[i]);


    }
}
//Java Problems1C:\Users\sharvan.iikkurti\IdeaProjects\Java Problems1\src\logicalprogrames
//C:\Users\sharvan.iikkurti\IdeaProjects\Java Problems1giy