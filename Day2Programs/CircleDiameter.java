//WAP to enter radius of circle and find its diameter,circumference and area

public class CircleDiameter
{
 public static void main(String args[])
 {	 
   float radius=12.0f;
   float pi=3.141f;

   float diameter=2*radius;
   System.out.println("Diameter of circle:"+diameter);

   float circumference=2*pi*radius;
   System.out.println("Circumference of Circle:"+circumference);

   float area=pi*radius*radius;
   System.out.println("Area of circle:"+area);
 }

}
