import java.util.*;

class prac23 {

    public static void main(String[] args) {
        Integer[][] a = new Integer[3][3];
        int value = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                value = input.nextInt();
                a[i][j] = value;
            }
        }
        System.out.println("Minimum value is = " + min(a));
    }

    public static <E extends Comparable<E>> E min(E[][] list) {

        E min = list[0][0];
        for (E[] els : list) {
            for (E es : els) {
                if (es.compareTo(min) < 0) {
                    min = es;
                }
            }
        }
        return min;
    }

}