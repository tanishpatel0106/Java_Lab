import java.util.*;

public class module3_7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number a: ");
		int a = sc.nextInt();
		System.out.print("Enter number b: ");
		int b = sc.nextInt();
		try{
			System.out.println("The division of the numbers (a/b) is: " + a/b);
		} catch (ArithmeticException e){
			System.out.println("DivideByZero Error: Cannot divide any number by 0");
		}
	}
}

