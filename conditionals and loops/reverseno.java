import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
       
        int no = 0;
        
        while(n>0){
            
          int  rem=n%10;
           no = no*10 + rem;
           
            
            n= n/10;
            
        }
        System.out.println(no);

    }
}
