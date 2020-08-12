package exam_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("test001/src/exam_test/a.txt")));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("test001/src/exam_test/b.txt")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("test001/src/exam_test/c.txt",true)));
        String a;
        StringBuilder word = new StringBuilder();
        List<String> s1 = new ArrayList<>();
        while ((a = br1.readLine()) != null){
            s1.add(a);
        }
        while ((a = br2.readLine()) != null){
            word.append(" ").append(a);
        }
        String[] s2 = word.toString().split(" ");
        int i = 0;
        while (i < s1.size() || i < s2.length){
            if(i < s1.size()){
                pw.println(s1.get(i));
            }
            if(i < s2.length){
                pw.println(s2[i]);
            }
            i++;
        }
        pw.close();

    }

}
