import java.io.*;
import java.util.*;
public class module3_3 {
	public static void main(String args[]) throws IOException{
		String filePath = "duplicate.txt";
		String input = null;
		Scanner sc = new Scanner(new File(filePath));
		FileWriter fw = new FileWriter("output.txt");
		Set set = new HashSet();
		while(sc.hasNextLine()){
			input = sc.nextLine();
			if(set.add(input)) {
				fw.append(input+"\n");
			}
		}
		fw.flush();
		System.out.println("Contents added successfully!!");
	}
}
