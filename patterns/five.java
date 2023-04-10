public class five {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28 (int n) {
       
        for (int row =0;row<=2*n;row++) {
            int c = row > n ? 2 * n - row : row;

            int spaces = n-c ;
            for (int space = 0; space < spaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= c; col++) {
               System.out.print("* "); 
            }
            System.out.println();
        }
    }
    
}

