import java.util.*;
class factorial
	{
	 public static void main(String args[])
	{
	 int i,n,fact=1;
	 Scanner sc= new Scanner(System.in);
	
	 n=sc.nextInt();
	 System.out.println("Enter any no:");
	 for(i=1;i<=n;i++)
		{
		   fact = fact*i;
 
        
		}

 		System.out.println("Factorial of "+n+" is = "+fact);

	}
}