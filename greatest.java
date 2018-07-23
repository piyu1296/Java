
import java.util.*;


public class greatest 
{
   
  
    public static void main(String[] args) 
{
        
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter two no.");
        a= sc.nextInt();
        b= sc.nextInt();

               System.out.println("greatest no. is");
               if (a>b)
               {
                   System.out.println("a is greater");
               }
               else if(b>a)
                    {
                     System.out.println("b is greater");
                    }
                else
                    {
                     System.out.println("both are equal");
                    }
  }
  }
    

