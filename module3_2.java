import java.io.*;
import java.util.*;

public class module3_2{
    public static void main(String [] args){
        try{
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("file2.txt");
            PrintWriter pw = new PrintWriter(fw);
            Scanner sc = new Scanner(System.in);
            String s1, s2;
            s1 = br.readLine();
            while(s1 != null){
                s2 = s1.toUpperCase();
                pw.println(s2);
                s1 = br.readLine();
            }
            fr.close();
            br.close();
            pw.flush();
            sc.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
