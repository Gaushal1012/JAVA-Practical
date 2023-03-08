import java.util.Scanner;

class prac16 {

    public static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b);
    }
    public static String toString(int real, int img) {
        long gcm = gcm(real, img);
        return img / gcm + "/" + real / gcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal no: ");
        String dec = sc.nextLine();
        int indDec = dec.indexOf(".");
        int length = dec.substring(indDec).length();
        int frac_part = (int) Math.pow(10, length - 1);
        int real_part = (int) (Double.parseDouble(dec) * frac_part);
        System.out.println("The Fraction Number is " + toString(frac_part, real_part));

    }

}
