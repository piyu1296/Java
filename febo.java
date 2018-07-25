import java.util.*;
class Febonacci{
 
 public static void main(String args[]){
 int a,f1=0,f2=1,next;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter length of febonacii series");
 a=in.nextInt();
  for(int i=0;i<a;i++)
  {
  if(i<2)
  {
  System.out.println(i);
  }
  else{
  next=f1+f2;
  f1=f2;
  f2=next;
  System.out.println(next);
  }
 
// System.out.println("-1 is factorial of given no");
 }
 }
}
