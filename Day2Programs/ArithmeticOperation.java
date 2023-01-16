import java.util.Scanner;
public class ArithmeticOperation
{
  public static void main(String args[])
  {
    int n1,n2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first num:");
        n1=sc.nextInt();

      System.out.println("enter second num:");
        n2=sc.nextInt();      
     
     //Addition:
     int add=n1+n2;
     System.out.println("Addition :"+add);
 
     //Subtraction:
     int sub=n1-n2;
     System.out.println("Subtraction:"+sub);

     //Multiplication:
     int mult=n1*n2;
     System.out.println("Multiplication:"+mult);

     //Division:
     int div=n1/n2;
     System.out.println("Division:"+div);

  
  }


}
