import java.util.*;

public class module3_7_1{
        public static void main(String [] args){
		try{
                	Scanner sc = new Scanner(System.in);
                	System.out.print("Enter number a: ");
               		 int a = sc.nextInt();
                	System.out.print("Enter number b: ");
                	int b = sc.nextInt();
			if(b==0)
				throw new Exception();
			System.out.println("The Divison Result is: " + a/b);
		} catch(Exception e){
			System.out.println("DivideByZero Error: Division by zero is not possible");
		}
        }
}

