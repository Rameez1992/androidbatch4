
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

   
    public static void main(String[] args)
    {
     int a,i,j,n,flag;
     Scanner in = new Scanner(System.in);
     System.out.println("enter range");
     n=in.nextInt();
     for (i=2;i<=n;i++)
     {
         flag=0;
         for(j=2;j<i;j++)
         {
             if(i%j==0)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==0)
         {
             System.out.println("prime no's are=" +i);
         }
     }
    }
    
}
