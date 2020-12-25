package practice.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseUsingByte("vaibhav singh"));
        System.out.println(reverseUsingStringBuilder("vaibhav singh"));
//        byUsingArray("vaibhav singh");
//        byUsingSwapping("vaibhav singh");
//        byRecursion("vaibhav singh sindhu");
        getReverse();
    }

    /**
     * Reverse a String using byte[]
     *
     * @param str
     * @return
     */
    public static String reverseUsingByte(String str) {

        //convert to bytes
        byte[] strToByte = str.getBytes();

        //create new byte array to hold revered str , size is = to original string
        byte[] reversedStr = new byte[strToByte.length];

        //reverse and store in new byte
        for (int i = 0; i < strToByte.length; i++) {
            reversedStr[i] = strToByte[strToByte.length - i - 1];
        }
        return new String(reversedStr);
    }

    /**
     * Reverse a String using string builder
     *
     * @param str
     * @return
     */
    public static String reverseUsingStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

    public static void byUsingArray(String str) {
        char[] str2 = str.toCharArray();
        for (int i = str2.length - 1; i >= 0; i--) {
            System.out.print(str2[i]);
        }
    }

    public static void byUsingSwapping(String str) {
        char[] newStr = str.toCharArray();
        int start = 0;
        int end = newStr.length - 1;

        for (start = 0; start < end; start++, end--) {
            char temp = newStr[start];
            newStr[start] = newStr[end];
            newStr[end] = temp;
        }

        System.out.println();
        for (char c : newStr) {
            System.out.print(c);
        }
        System.out.println();

    }


    public static void byRecursion(String str) {

        if (str == null || str.length() <= 1) {
            System.out.print(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            byRecursion(str.substring(0, str.length() - 1));
        }
    }

    /**
     * input:    I am vaibhav singh
     * output: singh vaibhav am I
     */
    public static void getReverse() {

        String input = "I am vaibhav singh";
        String output = " ";
        //start i from the last char
        int i = input.length() - 1;

        //initialize j with i ( ie..last char)
        int j = i;
        //loop till string ends
        while (i >= 0) {

            // till we find null reduce i
            while (i >= 0 && input.charAt(i) != ' ') i--;

            // i will be at null char
            //get a sub string from next char of null to last char ...(ie.. singh)
            output = output.concat(input.substring(i + 1, j + 1));
        }
        System.out.print(output);
    }
}
