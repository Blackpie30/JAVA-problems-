import java.io.*;
public class Problem4 {
public static void main(String args[]) throws  IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;      
   int[] arr = new int [10] ;
   int i ,target; 
   int index = -1 ;
   int sum = 0 , avg = 0 ;
   int even = 0 , odd = 0 ;
   System.out.println("Enter the elements of the array : " );
   for(i=0;i<arr.length;i++)
    {
       arr[i] = Integer.parseInt(br.readLine());
           }
            System.out.println("Enter the number to find : ");
           target = Integer.parseInt(br.readLine());
            int small = arr[0];
                  int large = arr[0] ;
            for ( i = 0 ; i<arr.length; i++ ){
                 sum = sum + arr[i];
                     if(arr[i] == target && index == -1) {
                         index = i ;
                     }
                  if ( arr[i]<small ) small = arr[i];
                  else if ( arr[i] > large ) large = arr[i];
                  if ( arr[i] %2 == 0) even++ ;
                  else  odd++;
            }
                              avg = sum /10;
              System.out.println(" The smallest number is : " +small );
                  System.out.println(" The largest number is : " +large );
                  System.out.println(" The average of the numbers is : "+avg) ;
                  System.out.println("The total even number are : "+even);
                  System.out.println(" The total odd numbers are : " +odd);
              System.out.println(" The target is found at the position: "+index);
}
}