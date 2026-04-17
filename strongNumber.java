public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        System.out.println(sum == n ? "Strong" : "Not Strong");
    }
}