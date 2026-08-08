import java.io.*;
import java.util.Arrays;
public class Problem5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Enter the number of employees : ");
        int n = Integer.parseInt( br.readLine() );
        int[] arr = new int[n] ;
        int i ;
        System.out.println("Enter the ID of  employees : ");
        for(i=0;i<n;i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        String[] name = new String[n];
        System.out.println("Enter the names of employees : ") ;
        for(i=0;i<n;i++){
        name[i] = br.readLine();       
        }
           int[] DA = new int[n];
            int[] HRA =new int[n];
            int[] PF =new int[n];
            int[] gross = new int[n];
            int[] net_salary = new int[n];
           int sum  = 0;
                System.out.println("Enter the basic salary of the employees : " ) ;
        int[] basic_salary = new int[n];
         for( i = 0 ;i< n; i++) {
            basic_salary[i] = Integer.parseInt(br.readLine());
            DA[i] = (40 * basic_salary[i]) / 100;
            HRA[i] = (20 * basic_salary[i]) / 100;
            PF[i] = (12 * basic_salary[i]) / 100;            
            gross[i] = basic_salary[i] + DA[i] + HRA[i];
            net_salary[i] = gross[i] - PF[i];
            sum += net_salary[i];
            }
                     System.out.println(" The names are : "+Arrays.toString(name)); 
            for ( i=0;i<n;i++){
                System.out.println("The ID of the employee is : "+arr[i]);
             
            System.out.println("Salary for " + name[i] + " is: " + basic_salary[i]);
            }
            int highestIndex =0;
            int lowestIndex =0;
            for ( i=1;i<n;i++){
              if ( basic_salary[i]>highestIndex)highestIndex= i ;
               else if( basic_salary[i] < lowestIndex ) lowestIndex = i;
               }
               System.out.println("\n--- Employee Details ---");
        for (i = 0; i < n; i++){
            System.out.println("ID: " + arr[i] + " | Name: " + name[i] +  " | Basic Salary:  " + basic_salary[i] + " | Net Salary : " + net_salary[i]);
        }
        int average = sum / n;
        System.out.println("\n--- Summary ---");
        System.out.println("Highest Paid : " + name[highestIndex] + " (" + net_salary[highestIndex] + ")");
        System.out.println("Lowest Paid  : " + name[lowestIndex] + " (" + net_salary[lowestIndex] + ")");
        System.out.println("Average Salary: " + average);
            }
                }
                


        

        
       
       
