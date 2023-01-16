/***7)Write a Java program to input any character and check whether it is 
alphabet, digit or special character ******/

import java.util.Scanner;
class  AlphaDigit
{
   public static void main(String[] args) 
     {
			 
          Scanner sc=new Scanner(System.in);
		  
          System.out.println("Enter any char : ");
            char ch=sc.next().charAt(0);
		  
         if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
           {
             System.out.println(ch+" is Alphabit");
           }
         else if(ch>='0'&&ch<='9')
           {
             System.out.println(ch+" is Digit");
           }
         else   
          {
            System.out.println(ch+" is spacial Symbol");
          }
     }
}