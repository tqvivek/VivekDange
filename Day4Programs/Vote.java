import java.util.Scanner;
class Vote
{
   public static void main(String args[])
   {
   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age in year...");
        int age=sc.nextInt();
     
	if(age>=18)
	{
	  System.out.println("Eligible for vote...");

	  if(age>=65)
	  {
	    System.out.println("Senior citizen");
	  }
	}
	else
	{
	  System.out.println("Not Eligible For Vote...");
	}


   
   }



}
