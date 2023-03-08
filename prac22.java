import java.util.*;

class prac22 {

    public static void main(String[] args) {
        int[] a = { 34, 45, 11, 22, 33 };
        System.out.println("array elements : ");
        for (int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);
        int n = MinValue(a, 0);
        System.out.println("\n minimum value from array is  : " + n);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int num = input.nextInt();
        System.out.println("The multiplication of " + n + " and " + num + " is = " + (num * n));

    }

    public static int MinValue(int[] a, int i) {
        if (i == a.length - 1)
            return a[i];
        int val = MinValue(a, i + 1);
        if (a[i] < val) {
            return a[i];
        } else {
            return val;
        }
    }
}