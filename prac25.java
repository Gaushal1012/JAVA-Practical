import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")

class prac25 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File fin = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(fin));

        StringBuffer buffer = new StringBuffer();
        String str;
        while ((str = br.readLine()) != null) {
            buffer.append(str);
            buffer.append(" ");

        }

        ArrayList list = new ArrayList();
        StringTokenizer st = new StringTokenizer(buffer.toString().toLowerCase());
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            list.add(s);
        }

        HashSet set = new HashSet(list);
        List arrayList = new ArrayList(set);
        Comparator c = Collections.reverseOrder();
        Collections.sort(arrayList, c);
        for (Object obj : arrayList)
            System.out.println(obj.toString());
    }
}
