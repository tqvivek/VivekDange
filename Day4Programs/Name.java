import java.util.Scanner;
class Name
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your FirstName:");
       String firstName=sc.next();
      
     System.out.println("Enter the LastName:");
        String lastName=sc.next();

        String fullName=firstName+lastName;
     //System.out.println("Full Name:"+fullName);	

     System.out.println("Enter the phy marks:");
        double phy=sc.nextDouble();
     System.out.println("Enter the chem marks:");
        double chem=sc.nextDouble();
     System.out.println("Enter the maths marks:");
        double maths=sc.nextDouble();
     System.out.println("Enter the bio marks:");
          double bio=sc.nextDouble();
     System.out.println("Enter the eng marks:");
          double eng=sc.nextDouble();

     double total=phy+chem+maths+bio+eng;
     // System.out.println("Total:"+total);
    
     double avg=total/5;
      
     double perc=(avg/500)*100;

     System.out.println(fullName+ "has scored 100%");
          
  
  }


}
