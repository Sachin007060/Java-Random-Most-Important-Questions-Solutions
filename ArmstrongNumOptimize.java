import java.util.Scanner;

public class ArmstrongNumOptimize {
    
    public static int isPower(int base, int eq) {
        int pow = 1;
        for (int i = 1; i <= eq; i++) {
            pow *= base;
        }
        return pow;
    }
    
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int getSum(int n) {
        int x = countDigit(n);
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += isPower(rem, x);
            n /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if (getSum(n) == n) {
            System.out.println(n+" is a Armstrong number");
        }else{
            System.out.println(n+" is not Armstrong number");
        }
        sc.close();
    }
}