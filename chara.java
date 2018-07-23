

package chara;


import java.util.*;


public class chara
{
   
  
    public static void main(String[] args) 
{
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter chara");
     	 char character ;
	character= (char) sc.next().charAt(0);
	 	
               if (character >= 65 && character <= 122)
        
                    {
                     System.out.println("Alphabet");
                    }

		 else if (character >= 48 && character <= 57)
      		   {
                     System.out.println("Digit");
                    }

                   
                else 
                    {
                     System.out.println("Special Character");
                    }
  }
  }
    






  