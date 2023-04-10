// import java.util.Scanner;

// public class seven {
//     public static void main (String[] args) {
//         Scanner input = new Scanner (System.in);
//         int n = input.nextInt();
//         int a= 0;
//         int b= 1;
//         while (n=b){
           
//             int c= a+b;
//             int d=b;
//             int f=c+d;
//             int g=
            


//         }
//     }

// }
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

      int n = input.nextInt(), firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series till " + n + " terms:");
        

      for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + ", ");
  
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
      }
    }
  }
