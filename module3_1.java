import java.util.*;
import java.io.*;
public class module3_1{
	public static void main (String [] args) throws FileNotFoundException{
		String filename, input;
		int lcount = 0, vcount = 0, pcount = 0, ccount = 0, wcount = 0, scount = 0;
		int i,j; char ch;
		char vowel[] = {'A','a','E','e','I','i','O','o','U','u'};
		char punct[]={'.','?','!',',',':',';'};
		char white[]={'\n','\t',' '};
	       	Scanner sc = new Scanner(System.in); 
		System.out.print("Enter input file name:");
		filename=sc.next();
		try{
			Scanner finput = new Scanner(new FileReader(filename));
			if(!finput.hasNext()){
				System.out.println(filename + " The File is empty. Aborting the Program");
				System.exit(1);
			}
			while(finput.hasNextLine()){
				input = finput.nextLine();
				wcount++;
				for(i=0; i<input.length(); i++){
					ch = input.charAt(i);
					ccount++;
					for(j=0; j<white.length; j++)
						if(ch==punct[j]){
							pcount++;
							if(j<3)
								scount++;
						}
					for(j=0; j<vowel.length; j++)
						if(ch==vowel[j])
							vcount++;
				}
				lcount++;
			}
			System.out.println("Words: " + wcount);
			System.out.println("Lines: " + lcount);
			System.out.println("Sentences: " + scount);
			System.out.println("Vowels: " + vcount);
			System.out.println("Characters: " + ccount);
			System.out.println("Punctuations: " + pcount);
			finput.close();
			System.exit(0);
		}
		catch(FileNotFoundException e){
			System.out.println("Error" + e);
			System.exit(2);
		}
	}
}
