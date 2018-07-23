
import java.util.*;


public class result
{
   
  
    public static void main(String[] args) 
{
        
        Scanner sc=new Scanner(System.in);
        int a,b,c;
	float per;
        System.out.println("enter 3 subjects marks");
        a= sc.nextInt();
        b= sc.nextInt();
 	c= sc.nextInt();
	
               System.out.println("percentage");
	 	per=(float) ((a+b+c)/3);
		System.out.println(per);
               if(per>=40 && per<60)

                    {
                     System.out.println("2nd class");
                    }

		else if(per>=60 && per<70)
                    {
                     System.out.println("first class");
                    }

		else if(70<per)
                    {
                     System.out.println("destinction");
                    }
                else
                    {
                     System.out.println("fail");
                    }
  }
  }
    

