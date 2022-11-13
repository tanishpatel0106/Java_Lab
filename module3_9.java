import java.util.*;

public class module3_9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		try{
			if(age<=0)
				throw new ABC();
			else
				if(age>=18)
					System.out.println("Eligible Voter!");
				else
					System.out.println("Not an Eligible Voter!");
		}
		catch(ABC o){
			System.out.println(o);
		}
	}
}

class ABC extends Exception{
	public String errMsg;
	public ABC(){
		this.errMsg = "AgeLessThanZero: Age cannot be less than zero!";
	}
	public String toString(){
		return errMsg;
	}
}
