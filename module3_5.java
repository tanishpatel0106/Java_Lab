import java.io.*;
public class module3_5{
	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("file3_5.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output3_5.txt"));
		int i;
		do{
			i = br.read();
			if(i != -1){
				if(Character.isUpperCase((char)i))
					bw.write(Character.toLowerCase((char)i));
				else
					bw.write((char)i);
			}
		} while(i != -1);
		br.close();
		bw.close();
	}
}
