import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check Armstrong number:-");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while(number>0){
            int rem = number%10;
            sum +=(rem*rem*rem);
            number = number/10;
        }
        if(temp == sum)
            System.out.println(temp+" is a Armstrong number");
        else
            System.out.println(temp+" is not a Armstrong number");
        sc.close();
    }
}