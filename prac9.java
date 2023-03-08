import java.util.Scanner;

class prac9 {
    public static int gcd(int num1, int num2) {
        while (num1 != num2) {

            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int n1=sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int n2=sc.nextInt();
        System.out.print("");
        System.out.print("GCD of "+n1+" and "+n2+" is "+gcd(n1,n2));

    }
}
