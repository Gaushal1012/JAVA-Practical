import java.util.Random;

class prac12 {

    public static void main(String args[]) {

        Random a = new Random(1000);

        for (int i = 0; i < 100; i++) {
            System.out.printf("%5d", a.nextInt(49));

            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }

    }

}
