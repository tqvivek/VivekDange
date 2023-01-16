//WAP to convert temp in fahereinhit...

import java.util.Scanner;
public class Temperature
{
  public static void main(String args[])
  {
     double celcius;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the temp in degree celcius:");
        celcius=sc.nextDouble();

      //Logic
      double fahreinheit=(celcius*1.8)+32;
    System.out.println("Temp in Fahreinheit:"+fahreinheit);      
  
  
  }



}
