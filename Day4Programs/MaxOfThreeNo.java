//3. Write a Java program to find maximum between three numbers
import java.util.Scanner;
class MaxOfThreeNo
{
  public static void main(String args[])
  {
    int n1,n2,n3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number...");
	    n1=sc.nextInt();
	System.out.println("Enter the second number...");
	    n2=sc.nextInt();
    System.out.println("Enter the third number...");
	    n3=sc.nextInt();	   
	   
	  if(n1>=n2 && n1>=n3)
	  {
		  System.out.println(n1+"is maximum number...");
	  }		  
	  else if(n2>=n1 && n2>=n3)
	  {
		  System.out.println(n2+"is maximum number...");
	  }
	  else{
		  System.out.println(n3+"is maximum number...");
	  }
  
  }


}