
import java.util.*;


public class triangle
{
   
  
    public static void main(String[] args) 
{
        
        Scanner sc=new Scanner(System.in);
        int a,b,c;
	
        System.out.println("enter 3 sides");
        a= sc.nextInt();
        b= sc.nextInt();
 	c= sc.nextInt();
	
               System.out.println("triangle");
	 	
               if(a==b && b==c && a==c)

                    {
                     System.out.println("triangle is equilateral");
                    }

		else if(a==b || a==c || b==c)
                    {
                     System.out.println("triangle is isosceles");
                    }

		else if (a!=b && b!=c && a!=c)
                    {
                     System.out.println("triangle is scalene");
                    }
                
  }
  }
    

