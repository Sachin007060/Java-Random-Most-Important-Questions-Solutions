import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for cheking the perfect number:- ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<number; i++){
            if(number%i==0){
                sum += i;
            }
        }
        if(number == sum)
            System.out.println(number+" is a perfect number");
        else
            System.out.println(number+" not a perfect number");
        sc.close();
    }
}

//++++++++++++++++++++++++++ Solved using method +++++++++++++++++++++++++++++++++++++++++

/*

import java.util.Scanner;

class Perfect{
    int sum = 0;
    public int perfectNumber(int num){
        for (int i = 1; i<num; i++){
            if(num%i==0){
                sum += i;
            }
        }
        return sum;
    }
}
public class OnlyForExperiments{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for cheking the perfect number:- ");
        int number = sc.nextInt();
        Perfect obj = new Perfect();
        int result = obj.perfectNumber(number);

        if(number == result)
            System.out.println(number+" It is a perfect number");
        else
            System.out.println(number+" It is not a perfect number");
        sc.close();
    }
}

*/

