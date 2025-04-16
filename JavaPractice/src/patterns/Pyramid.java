package patterns;

/**
 *
 *                  *
 *                  *  *
 *                  *  *  *
 *                  *  *  *  *
 */
public class Pyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("*  ".repeat(i));
        }

        for(int i=5;i>0;i--){
            System.out.println("*  ".repeat(i));
        }
    }
}
