package practice;

// 10602 will be replaced by 15652
public class Replace_0_with_5 {
    public static void main(String[] args) {

        int num = 1020;
        System.out.println("before replace : " + num);
        num += replace_0_To_5(num);

        System.out.println("after replace :" + num);
    }

    public static int replace_0_To_5(int num) {

        int result = 0;
        int decimalPlace = 1;

        if (num == 0)
            result += (5 * decimalPlace);

        while (num > 0) {
            if (num % 10 == 0)
                result += (5 * decimalPlace);

            num /= 10;
            decimalPlace *= 10;

        }
        return num += result;

    }
}
