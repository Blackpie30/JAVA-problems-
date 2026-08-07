import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Problem3{
    public static void main (String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;      
      System.out.println(" enter the value of N: ") ; 
       int n = Integer.parseInt(br.readLine()) ;
                System.out.println("1.Check whether the number is Prime  ") ;
                 System.out.println("2.Check whether it is Palindrome ");
                  System.out.println("3.Check whether it is Armstrong ");
                    System.out.println("4.Find the Sum of Digits");
                      System.out.println("5.Reverse the Number");
                       System.out.println("6.Exit");
                  System.out.print("Enter your choice: ");
        int x = Integer.parseInt(br.readLine());
       int num = n;
         int  count = 0 ;
         switch(x) {
             case 1: 
                for ( int i = 1; i <=n ; i++){
                if ( n % i == 0 ) count++;
              }
                 if ( count == 2 ) System.out.println("The number is prime") ;
                 else System.out.println(" The number is not prime");
             break;
             case 2: 
                if ( n < 0 ) System.out.println(" Negative numbers are not allowed ") ;
              int  rev = 0;
               int No = n;      
                while(No != 0) {
            rev = rev * 10 + No % 10;
            No /= 10;
        }
        System.out.println("The number is palindrome");
         break ;
         case 3: 
             int sum3 =0 ; 
             int digits = String.valueOf(num).length();
             int originalNum = num;
             while (num > 0) {
            int lastDigit = num % 10;
            sum3 += Math.pow(lastDigit, digits);
            num /= 10;
        }
        if(sum3 == num) System.out.println("The number is an Armstrong " ) ;
           else System.out.println("The number is not an Armstrong");
           break;
           case 4: 
           int temp4 ;
           int sum4 =0 ; 
           while ( num > 0){
             temp4 = num %10;
            sum4 = sum4 + temp4 ;
            num /= 10;           
           }
            System.out.print(sum4);
           break;
           case 5: 
           int Rev = 0 ; 
           int temp5;
            num = n ;
          while (num > 0){
             temp5 = num %10 ;
              Rev = ( Rev*10) + temp5;
              num /= 10;  
          }
            System.out.println("The reverse of the number is : "+Rev); 
            break;
            case 6:
              break;
              default:
                System.out.println("Invalid choice");                       
      }          
         

    }
}
