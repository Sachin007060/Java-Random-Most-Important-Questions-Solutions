// WAJP to take a String input and count all the characters without spaces int the String.
import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String ");
        String s1 = sc.nextLine();
        int count=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total number of character present in the String are: "+count);
        sc.close();
    }
}
