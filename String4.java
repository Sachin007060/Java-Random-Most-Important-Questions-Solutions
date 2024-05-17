// WAJP to take a String and reverse the String?

import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s = sc.nextLine();
        reverseString(s);
        sc.close();
    }

    public static void reverseString(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.print(rev);
    }
}
