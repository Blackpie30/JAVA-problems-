import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
    public void main (String arg[]) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    int s1 ,s2 ,s3,s4,s5;
    int Total_m  = 0 ;
    String Input ;

    System.out.println("Enter the marks of the s1: ");
    Input = reader.readLine();
    s1=Integer.parseInt(Input);
    Total_m += s1;
    System.out.println("Enter the marks of the s2 : " ) ; 
    Input = reader.readLine();
    s2 =Integer.parseInt(Input);
    Total_m += s2;
    System.out.println("enter the marks of s3 : ") ;
    Input = reader.readLine();
    s3= Integer.parseInt(Input);
    Total_m += s3;
    System.out.println("enter the marks of s4: ");
    Input = reader.readLine();
    s4=Integer.parseInt(Input);
    Total_m += s4;
  System.out.println("enter the marks of s5: " ) ;
Input = reader.readLine();
  s5 = Integer.parseInt(Input);
  Total_m += s5;
   
  System.out.println("the total marks is : "+Total_m);
  float percentage;
  
  percentage= (float)Total_m/500*100;
  System.out.println("percentage of the student is: "+percentage);
  if( percentage >=90)    System.out.println("grade A+");

  else if ( percentage>=80 && percentage<90 )  System.out.println("grade A");

  else if ( percentage>=70 && percentage <80) System.out.println( " grade B" );
   
  else if(percentage>= 60 && percentage <70)  System.out.println(" grade C");
  
  else if ( percentage >=50 && percentage<60) System.out.println("grade D");
  
  else if ( percentage <50 )  System.out.println("FAIL") ;
       }
 }