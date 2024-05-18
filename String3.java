// Take a String and remove all the duplicate character from the String.
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[j] = arr[n-1];
                    n--;
                    j--;
                }
            }
        }
        String result = "";
        for(int i=0; i<n; i++){
            result += arr[i];
        }
        System.out.println(result);
        sc.close();
    }
}
