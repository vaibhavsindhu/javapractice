package practice;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 151;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum = sum + (a * a * a);
            n = n / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not");

    }
}
