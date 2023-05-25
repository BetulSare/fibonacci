
package fibonacci;

import java.util.Scanner;

public class Fibonacci {
 
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOfElements=scan.nextInt();
        
        int n1=0;
        int n2=1;
        int sum=0;
        for (int i = 0; i < numberOfElements; i++) {
          
            sum=n1+n2;
            System.out.printf("%s + %s = %s",n1,n2,sum);
            System.out.println();
            n1=n2;
            n2=sum;
        }
    }
    
}
