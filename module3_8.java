import java.util.*;

public class module3_8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size]; 
		for(int i=0; i<size; i++){
			System.out.print("Enter a["+i+"] :");
			a[i] = sc.nextInt();
		}
		try{
			System.out.print("Enter the index which you want to access: ");
	                int index_tst = sc.nextInt();
			int divisonval = a[index_tst];
			System.out.print("Enter the number which you want to divide to: ");
			int in_val = sc.nextInt();
			try{
				System.out.println("The division:" + divisonval + "/" + in_val + "=" + divisonval/in_val);
			}
			catch(ArithmeticException e){
				System.out.println("DivisionByZero Error: Cannot divide by zero!");
			}
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds!");
		}
	}
}
