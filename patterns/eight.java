public class eight {
    public static void main(String[] args) {
       pattern31(4); 
    } 
    static void pattern31(int n){
        int on=n;
        n=2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int ind = on-Math.min(Math.min(row,col),Math.min(n-row,n-col))+1;
                System.out.print(ind +" ");
            }
            System.out.println();
        }
    }
}
