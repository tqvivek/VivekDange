//6)WAP to enter length in cm and convert it into m,km......

 import java.util.Scanner;
  public class Length
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length in cm:");
       float cm=sc.nextFloat();

       float m;
       float km;

       m=cm/100;
       km=cm/100000;

       System.out.println("Length in meter:" +m+ "meter");
       System.out.println("Length in kilometer:" +km+ "kilometer");



  
  
  }



}
