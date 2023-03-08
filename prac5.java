import java.util.Scanner;

class prac5 {
  public static void main(String argd[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first integer Number: ");
    int a = sc.nextInt();

    System.out.print("Enter second integer Number: ");
    int b = sc.nextInt();

    System.out.print("Enter third integer Number: ");
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.print(a + " ");
      if (b > c) {
        System.out.println(b + " " + c);
      } else {
        System.out.print(c + " " + b);
      }
    }

    if (b > a && b > c) {
      System.out.print(b + " ");
      if (a > c) {
        System.out.println(a + " " + c);
      } else {
        System.out.print(c + " " + a);
      }
    }

    if (c > b && c > a) {
      System.out.print(c + " ");
      if (b > a) {
        System.out.println(b + " " + a);
      } else {
        System.out.print(a + " " + b);
      }
    }

  }
}