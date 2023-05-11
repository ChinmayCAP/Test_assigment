/**
 * one
 */
/**
 * Innerpattern1
 */

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Print even level in reverse order
                for (int j = num + i - 1; j >= num; j--) {
                    System.out.print(j + " ");
                }
            } else {
                // Print odd level in normal order
                for (int j = num; j < num + i; j++) {
                    System.out.print(j + " ");
                }
            }
            num += i;
            System.out.println();
        }
    }
}    
