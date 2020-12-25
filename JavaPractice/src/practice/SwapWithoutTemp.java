package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddWithoutTemp {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter input: ");
//        int t=scanner.nextInt();
//        System.out.println(t);
        int x=10;
        int y=20;
        System.out.println("x= " + x + " y= "+ y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping");
        System.out.println("x= " + x + " y= "+ y);
    }
}
