import java.util.Scanner;

class prac4
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);

     System.out.print("Enter Height in inches:");
     double a=sc.nextDouble();

     System.out.print("Enter Weight in pound:");
     double b=sc.nextDouble();

     System.out.println("BMI:"+(b*0.45359237)/(a*a*0.0254*0.0254));
     }
      
}