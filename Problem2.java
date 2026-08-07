import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Problem2 { 
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int bill = 0 ;      
   System.out.println(" Enter the name : " );
   String name = br.readLine();
   System.out.println(" Enter the number : "); 
       String number = br.readLine();
   System.out.println(" Enter the units consumed : ");
     int   units = Integer.parseInt(br.readLine());
    if ( units <= 100 )
        bill = units*3 ;
    else if ( units > 100 && units <= 200) 
        bill = 100*3 + (units-100)*5;
  
    else if ( units <=500)
        bill = 100*3 + 100*5 +(units-300)*7;
   
    else if ( units > 500 )  
        bill =  100*3+ 100*5 + 100*7+( units - 500) *10 ;

     if ( bill > 5000) { 
        double surcharge = units*0.05;
        bill +=surcharge;
     }           
     System.out.println(" The consumer details are as follows : " ) ;
     System.out.println("consumer name: "+name ) ; 
     System.out.println("consumer number : " +number ) ;
     System.out.println("your total bill is : " +bill);
     
    }
}