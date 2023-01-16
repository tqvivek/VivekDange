//WAP to calculate area of equilateral triangle......
import java.util.Scanner;
public class AreaOfEquilateral
{
  public static void main(String args[])
  {
         float side; 
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the side:");
        side=sc.nextFloat();

     double area=(1.73*side*side)/4;
     System.out.println("Area of Equilateral Triangle is:"+area);
  
  
  }




}
