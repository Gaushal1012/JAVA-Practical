import java.util.Scanner;

class prac13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("expression: ");
        String eq = sc.nextLine();
        String a = eq.replaceAll(" ", "");

        if (a.length() < 3) {
            System.out.println("Invalid Expression");
            System.exit(0);
        }

        int res = 0;
        int i = 0;

        while (a.charAt(i) != '+' && a.charAt(i) != '-' && a.charAt(i) != '/' && a.charAt(i) != '*') {
            i++;

        }

        switch (a.charAt(i)) {

            case '+':
                res = Integer.parseInt(a.substring(0, i)) + Integer.parseInt(a.substring(i + 1, a.length()));
                break;

            case '-':
                res = Integer.parseInt(a.substring(0, i)) - Integer.parseInt(a.substring(i + 1, a.length()));
                break;

            case '*':
                res = Integer.parseInt(a.substring(0, i)) * Integer.parseInt(a.substring(i + 1, a.length()));
                break;

            case '/':
                res = Integer.parseInt(a.substring(0, i)) / Integer.parseInt(a.substring(i + 1, a.length()));
                break;

        }

        System.out.println("Result : " + res);

    }

}
