//WAP to enter P,T,R and calculate Compound_Interest...........
import java.util.Scanner;
 class CompoundInterest
{

  public static void main(String args[])
  {
       double P,T,R,Comp_Interest;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Principle Number:");
             P=sc.nextDouble();

	System.out.println("Enter Interest rate:");
            R=sc.nextDouble();	

       System.out.println("Enter a Time period in year:");
           T=sc.nextDouble();

     
       Comp_Interest = P * (Math.pow((1 + R / 100), T)) - P;
         System.out.println("Compound Interest:"+Comp_Interest);       
		          
	    
  
  
  }




}
