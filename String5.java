// WAJP to take a String input and count total number of word s in the Stirng?

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s = sc.nextLine();
        getWordCount(s);
        sc.close();
    }

    public static void getWordCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i-1) == ' ')
                count++;
        }
        System.out.println("Total number of count is: " + count);
    }
}