public class third {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            for (int col = 0; col <=n-row; col++) {
                
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
