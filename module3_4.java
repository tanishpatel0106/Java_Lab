import java.io.*;
import java.util.*;
public class module3_4{
	public static void getInfo() throws IOException{
		FileInputStream inp = new FileInputStream("new.txt");
		int i = 0;
		while((i=inp.read()) != -1){
			System.out.print((char)i);
		}
		inp.close();
	}
	public static void addInfo() throws IOException{
		FileOutputStream out = new FileOutputStream("new.txt", true);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of student: ");
		String name = sc.nextLine();
		System.out.print("Enter Roll Number of student: ");
		String roll = sc.nextLine();
		System.out.print("Enter the age: ");
		String age = sc.nextLine();
		System.out.print("Enter the branch: ");
		String branch = sc.nextLine();
		String str = "\nNAME: " + name + " Roll No.: " + Roll + " Age: " + age + " Branch :" + branch;
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
		System.out.println("Data Entered Successfully");
	}
	public static void main(String [] args) throws IOException{
		int select;
		boolean check = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter a choice \n1. ADD INFO \n2. SHOW INFO \n3. EXIT");
			select = sc.nextInt();
			switch(select){
				case 1: {
					addInfo(); break;
				}
				case 2: {
					getInfo(); break;
				}
				case 3: {
					check = false; break;
				}
				default: {
					System.out.println("Enter a valid choice");
				}
			}
		} while(check);
	}
}
