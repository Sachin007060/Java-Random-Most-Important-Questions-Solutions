
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] yo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int expo = sc.nextInt();
        long power = 1;
        for (int i = 1; i <= expo; i++) {
            power *= base;
            // System.out.println(power);
        }
        System.out.print(base+"'s power "+expo+" is = "+power);
        sc.close();
    }
}

