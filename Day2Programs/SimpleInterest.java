//WAP to calculate Simple Interest........

import java.util.Scanner;
public class SimpleInterest
{
  public static void main(String args[])
  {
	  float P,R,T,SI;
  
     Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the principal amount:");
             P=sc.nextFloat();    
      System.out.println("Enter the rate:");
           R=sc.nextFloat();

      System.out.println("Enter the time in  year:");
           T=sc.nextFloat();
      
	   //LOGIC......
         SI=(P*R*T)/100;
      System.out.println("Simple_Interest:"+SI);

  }





}
