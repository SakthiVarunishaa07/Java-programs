import java.util.*;

public class Q1_ReverseInteger {
    public static void main(String[] args) {
        int n = -123;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println(0);
                return;
            }

            rev = rev * 10 + digit;
        }

        System.out.println(rev);
    }
}