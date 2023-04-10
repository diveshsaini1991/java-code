import javax.annotation.processing.SupportedSourceVersion;

public class hollow {
    public static void main(String[] args) {
        int n = 10;
        pattern1(n);
    }
    static void pattern1(int n){
        int row,col,mid=0;
        if (n%2==1) {
            n=n+1;
        }
        mid=n/2;
        for ( row = 1; row <=mid ; row++) {
            for (col = 1; col <=mid-row ; col++) {
                System.out.print(" ");
                
            }
            if(row==1){
                System.out.print("*");
            } else{
                System.out.print("*");
                for ( col = 1; col <= 2*row-3 ; col++) {
                    System.out.print(" ");
                    
                }
                System.out.print("*");
            }
            System.out.println();
            
        }
        for ( row =mid+1; row <n ; row++) {
            for ( col = 1; col <=row-mid ; col++) {
                System.out.print(" ");
            }
            if (row==n-1){
                System.out.print("*");
            }   else {
                System.out.print("*");
                for ( col = 0; col < 2*(n-row)-3; col++) {
                    System.out.print(" ");
                    
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
