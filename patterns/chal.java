public class chal {
    public static void main(String args[])
    {
        int n = 47;
        printPattern(n);
    }
    
    static void printPattern(int n)
{
    int row,col,mid;
    if(n%2==1) //when n is odd, increase it by 1 to make it even
      n++;
    mid = n/2;
      
    // upper half pattern
    for(row = 1; row<= mid; row++) {
      for(col = 1; col<=mid-row; col++) //print the blank spaces and outer box before star
         System.out.print(" ");
           
      if(row == 1) {
         System.out.print("*");
      }else{
         System.out.print("*"); //in each line star at start and end position
         for(col = 1; col<=2*row-3; col++) { //print space to make hollow
            System.out.print(" ");
         }
         System.out.print("*");
      }
      for(col = 1; col<=mid-row; col++) //print the blank spaces and outer box after star
         System.out.print(" ");
           
      System.out.println();
   }
     
   // lower half pattern
   for(row = mid+1; row<n; row++) {
         
      for(col = 1; col<=row-mid; col++) //print the blank spaces and outer box before star
         System.out.print(" ");
           
      if(row == n-1) {
         System.out.print("*");
      }else{
         System.out.print("*"); //in each line star at start and end position
         for(col = 1; col<=2*(n - row)-3; col++) { //print space to make hollow
            System.out.print(" ");
         }
         System.out.print("*");
      }
      for(col = 1; col<=row-mid; col++) //print the blank spaces and outer box after star
         System.out.print(" ");
           
      System.out.println();
   }
         
}
     
    // driver's code
    
}
