public class ArryaEleWhoseFrequecyIsOdd {
    public static void main(String[] args) {
        int a[] = { 5, 7, 3, 7, 1, 5 , 5};
        int n = a.length - 1;
        int max=0;
        for (int i = 0; i <= n; i++) {
            int count = 1;
            for (int j = i + 1; j <= n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n];
                    n--;
                    j--;
                }
            }
            if(count>max){
                max=count;
            }
        }
    }

}
