import java.util.Scanner;

public class TriangleClient{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int s1 = input.nextInt();
      int s2 = input.nextInt();
      int s3 = input.nextInt();
      Triangle obj = new Triangle(s1, s2, s3); 
      System.out.println(obj);
      
      if(obj.isEquilateral()){
         System.out.println("This triangle is an equilateral triangle.");
      }
      else{
         if(obj.isIsoceles()){
            System.out.println("This triangle is an isoceles triangle.");}
         else{
            System.out.println("This triangle is a scalene triangle.");}
      }
   }
}