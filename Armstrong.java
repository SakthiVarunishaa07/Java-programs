import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;

        int digits = String.valueOf(num).length(); 
        int sum = 0;

        while (num > 0) {
            int last = num % 10;
            sum += Math.pow(last, digits); 
            num /= 10;
        }

        if (sum == original) {
            System.out.println("is an Armstrong number");
        } else {
            System.out.println(" is not an Armstrong number");
        }
    }
}