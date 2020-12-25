package practice;

public class FindDup {
    public static void main(String[] args) {

        String arr = "test[]90@12#@";
        int count = 0;
        String num = "0123456789";
        for (int i = 0; i <= arr.length()-1; i++) {
            for (int j = 0; j <= arr.length()-1; j++) {

                if (arr.charAt(i) == arr.charAt(j)) {
                    count++;
                    System.out.print(arr.charAt(j));
                }

            }

            System.out.println("-------"+count);
            count=0;

            }

        }
    }

