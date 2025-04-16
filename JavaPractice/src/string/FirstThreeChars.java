package string;

import java.util.Arrays;

public class FirstThreeChars {
    public static void main(String[] args) {
        String[] s={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for(int i=0;i<s.length;i++){
            s[i]=s[i].substring(0,3);
        }
        System.out.println(Arrays.toString(s));
    }
}
