import java .util.*;
class arm{
 public static void main(String args[]){
  int a,r,n,sum=0,temp;
 Scanner s =new Scanner(System.in);
 System.out.println("Enter a numer");
 
 a= s.nextInt();
 temp=a;
 while (a>0)
 {
	 r=a%10;
 a=a/10;
 sum=sum+ a*a*a;
}
  if(temp==sum)
	  System.out.println("Number is armstrong number");
  else
	  System.out.println("number is not an armstrong number");
}
}