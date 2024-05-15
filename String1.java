// WAJP to take a String input and count all numeric characters in the String..

// String s = "Mo45h7an";

import java.util.Scanner;

/**
 * String1
 */
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String with the numbers: ");
        String s = sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9' )
                count++;
        }
        System.out.println("Total numeric character in the String "+count);
        sc.close();
    }
}