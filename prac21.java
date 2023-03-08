import java.util.*;
import java.io.*;

class prac21 {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\01\\OneDrive\\Desktop\\My Project\\JAVA practical\\123.txt"));
            for (int i = 0; i < 150; i++) {
                pw.write((int) (Math.random() * 150) + " ");
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}