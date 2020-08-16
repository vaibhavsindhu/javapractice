/**
 * Assignments
 * <p>
 * 1                A          $$$$
 * 12               AB         $  $
 * 123              ABC        $  $
 * 1234                        $$$$
 * 12345
 * 123456
 */


public class Loops {
    public static void main(String[] args) {

            pattern1();
        System.out.println("=============================================");
            pattern2();
        System.out.println("=============================================");
            pattern3();
        System.out.println("=============================================");
            pattern4();
        System.out.println("=============================================");
            pattern5();
        System.out.println("=============================================");
            pattern6();
        System.out.println("=============================================");
            pattern7();
        System.out.println("=============================================");
            pattern8();
        System.out.println("=============================================");
            pattern9();


    }

    /**
     * 1
     * 12
     * 123
     * 1234
     * 12345
     * 123456
     */
    public static void pattern1() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     * ABCDEF
     */
    public static void pattern2() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }

    /**
     * 1234
     * 2341
     * 3412
     * 4123
     */
    public static void pattern3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(j);

            }
            for (int k = 1; k <= i; k++) {
                if (i != k)
                    System.out.print(k);
            }

            System.out.println();


        }


    }


    /**
     * ***
     * *
     * *
     * ***
     */
    public static void pattern4() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }

    /**
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */
    public static void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     */
    public static void pattern7() {
        int j;
        for (int i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {

                if ((i + j) > 10) {
                    continue;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    /**
     * J A V A
     * A V A
     * V A
     * A
     */
    public static void pattern8() {
        String s = "JAVA";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(s.charAt(j - 1) + " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *       1
     *     1 2
     *   1 2 3
     * 1 2 3 4
     *
     * */

    public static void pattern9() {
        for (int i = 1; i <= 4; i++) {

                for(int k=3;k>=i;k--){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
            System.out.println();
            }

        }
    }





