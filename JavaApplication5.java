
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          
        System.out.println("Select the options\n");
    
        System.out.println("1-Add student\n2-student list\n3-exit");
        
       
      
        String name = null,course = null,gender = null;
        int i,age = 0;
                
        for(int j=1;j<=5;j++)
        {
         
        System.out.println("enter number\n");
        i= sc.nextInt();
   
       
       
        switch(i)
        {
            case 1:
            {
         
         System.out.println("\nSTUDENT  DETAILS");
         
         System.out.println("\nEnter name: ");
         name = sc.next();
         System.out.println("\nEnter age: ");
         age = sc.nextInt();
       
         System.out.println("\nEnter course name: ");
         course = sc.next();
         System.out.println("\nEnter gender: ");
         gender = sc.next();
            
         break;
         }
         case 2:
         {
        System.out.println("\nSTUDENT  DETAILS LIST\n");
        System.out.println("NAME          : " + name);
        System.out.println("AGE           : " + age);
        System.out.println("COURSE        : " + course);
        System.out.println("GENDER        : " + gender);
        break;
        }
           
         case 3:
            {
                System.out.println("Display teacher");
                break;
            }
            case 4:
            {
                System.out.println("Add student");
                break;
            }
            case 5:
            {
                System.out.println("Remove student");
                break;
            }
            case 6:
            {
                System.out.println("Display student");
                break;
            }
            default:
            {
                System.out.println("error");
            }
        }

       }
       }

}

    
    
    



       
    
    
