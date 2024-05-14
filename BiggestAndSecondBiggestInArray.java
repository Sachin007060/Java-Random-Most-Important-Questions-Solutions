
public class BiggestAndSecondBiggestInArray {
    public static void main(String[] args) {
        int a[] = { 18, 20, 16, 24, 30, 27, 30 };
        int biggest = a[0], sec_big = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > biggest) {
                sec_big = biggest;
                biggest = a[i];
            } else if (a[i] > sec_big && sec_big != biggest) {
                sec_big = a[i];
            }
        }
        System.out.println("Biggest is : " + biggest + " Second biggest is: " + sec_big);
    }
}
