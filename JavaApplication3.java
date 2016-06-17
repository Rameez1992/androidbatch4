
package javaapplication3;


public class JavaApplication3 {

  
    public static void main(String[] args)
            
    {
        int j,flag,x = 0;
     int[] list = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
     for(int i=list[x];i<list.length;i++)
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
         
     
    
     
    
    

 
    