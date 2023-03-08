import java.util.Scanner;

class prac8{
    public static void main(String args[])
    {
       int a=2;
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter your no : ");
       int x=sc.nextInt();
       
       while(x>1)
       {
         if(x%a==0)
         {
            System.out.print(a+" ");
            x=x/a;
         }
         else
         {
            a++;
         }
       }       
    }
}
