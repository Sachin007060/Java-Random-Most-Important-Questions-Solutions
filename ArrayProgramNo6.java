
// WAJP to print and count all the prime number of the array?

public class ArrayProgramNo6 {
    public static void main(String[] args) {
       int a[] = { 2, 5, 15, 30, 7, 23, 9, 0, 13, 25 };
       int count = 0;
       for (int i = 0; i < a.length; i++) {
          if (isPrime(a[i])) {
             System.out.print(a[i] + " ");
             count++;
          }
       }
       System.out.println("\nTotal prime no present in the array: " + count);
    }
 
    public static boolean isPrime(int n) {
       int count = 0;
       if (n == 0) {
          return false;
       }
       for (int i = 2; i <= n / 2; i++) {
          if (n % i == 0)
             return false;
       }
       return true;
    }
 }
 