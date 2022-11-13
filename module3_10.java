import java.util.*;

class bankac{
	int bankacno, acbal;
	public bankac(){
	}
	public bankac(int bankacno, int acbal){
		this.bankacno = bankacno;
		this.acbal = acbal;
	}
	//Defining a withdraw method
	public void withdrawfunds(int witamt){
		try{
			if(witamt>acbal)
				throw new Exception();
			acbal = acbal-witamt;
			System.out.println("Successfully withdrawn: " + witamt);
			System.out.println("Current balance: " + acbal);
		}
		catch (Exception e){
			System.out.println("Insufficient Funds!");
		}
	}
	//Defining a deposit method
	public void depositfunds(int depamt){
		acbal = acbal+depamt;
		System.out.println("Amount deposited: " + depamt);
		System.out.println("Current balance: " + acbal);
	}
}

public class module3_10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bank account number: ");
		int b1 = sc.nextInt();
		System.out.print("Enter bank balance: ");
		int b2 = sc.nextInt();
		bankac a1 = new bankac(b1,b2);
		int flag = 1;
		while(flag==1){
			System.out.print("Enter 1 for Withdraw, 2 for Deposit: ");
			int opt = sc.nextInt();
			if(opt==1){
				System.out.print("Enter amount to be withdrawn: ");
				int amtwit = sc.nextInt();
				a1.withdrawfunds(amtwit);
			}else if(opt==2){
				System.out.println("Enter amount to be deposited: ");
				int depamt = sc.nextInt();
				a1.depositfunds(depamt);
			}else if(opt==3){
				System.out.println("Goodbye");
				flag++;
			}
		}
		sc.close();
	}
}

