import java.util.Scanner;
import java.util.Random;

class prac11 {

    public static void main(String args[]) {

        int matrix[][] = new int[6][6];
        Random sc = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (sc.nextInt(2));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n row have ODD no of 1s ");
        int c;
        for (int i = 0; i < 6; i++) {
            c = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    c++;
                }
            }
            if (c % 2 != 0) {
                System.out.println("row  " + (i + 1) + "have ODD no of 1s");
            }
        }
        System.out.println("\n columns have ODD no of 1s ");
        for (int i = 0; i < 6; i++) {
            c = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    c++;
                }
            }
            if (c % 2 != 0) {
                System.out.println("columns  " + (i + 1) + "have ODD no of 1s");
            }
        }
    }
}
