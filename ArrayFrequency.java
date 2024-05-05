public class ArrayFrequency{
    public static void main(String[] args) {
        int[]a = {12, 20, 18, 12, 16, 20, 12, 20, 12};
        int n=a.length-1;
        for(int i=0; i<=n ; i++){
            int count=1; 
            for(int j=i+1; j<=n; j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    j--;
                    n--;
                }
            }
            System.out.println(a[i]+" is "+count+" times");
        }
    }

}