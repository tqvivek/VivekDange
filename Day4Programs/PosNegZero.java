//6. Write a Java program to check whether a number is negative, positive or zero
import java.util.Scanner;
class PosNegZero
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		    num=sc.nextInt();
		    
		if(num>0)
		{
			System.out.println(num+"is positive number...");
		}
        else if(num<0)
		{
			System.out.println(num+"is negative number...");
		}
         else{
			 System.out.println(num+"is ZERO...");
		 }		
        		   
		
	}
	
}