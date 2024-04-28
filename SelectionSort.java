public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 7, 3, 2, 8, 1};
        int n=a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<n; i++){
            int smallest= a[i], index=i;
            for(int j=i+1; j<n; j++){
                if(a[j]<smallest){
                    smallest=a[j];
                    index=j;
                }
            }
            a[index]=a[i];
            a[i]=smallest;
        }
        System.out.println("\n++++++++++++++++++++");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
