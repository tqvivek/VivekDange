//total,average,percentage of 5 subject...
import java.util.Scanner;
public class MarksAvg
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter physics marks:");
        int phy=sc.nextInt();

    System.out.println("Enter chem Marks:");
        int chem=sc.nextInt();
    
    System.out.println("Enter maths marks:");
         int maths=sc.nextInt();

   System.out.println("Enter bio marks:");
       int bio=sc.nextInt();

   System.out.println("Enter eng marks:");
        int eng=sc.nextInt();

   //Total logic:

    double total=phy+chem+maths+bio+eng;
     System.out.println("Total Marks:"+total);

   //Average logic:

    double avg=total/5;
     System.out.println("Average of Marks:"+avg);
    
   //percentage Logic:

     double perc=(total/500)*100;
    System.out.println("Percentage:"+perc);    

     	
   
   }



}
