import java.util.Scanner;

public class prac10 {

  public static void reverse(int[] arr) {

    int[] temp = new int[10];

    for (int i = 0; i < 10; i++) {
      temp[i] = arr[i];
    }

    for (int i = 0; i < 10; i++) {
      arr[i] = temp[9 - i];
    }

  }

  public static void printarr(int[] arr) {

    System.out.println("Reverse digit: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] number = new int[10];

    System.out.println("enter no: ");
    for (int i = 0; i < 10; i++) {
      int k = sc.nextInt();
      number[i] = k;
    }

    reverse(number);

    printarr(number);

  }
}
