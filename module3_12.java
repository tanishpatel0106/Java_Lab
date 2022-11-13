import java.util.*;

class threading_methods extends Thread{
	String message;
	int a;
	threading_methods(String msg,int num){
		message = msg;
		a = num;
	}
	public void run(){
		for(int i = 0; i<=a; i++){
                        try{
                                System.out.println("Message passed into Thread: " + message);
                                Thread.sleep(100);
                        }
                        catch(InterruptedException e){
                                System.out.println("Exception: " + e.getMessage());
                        }
                }
	}
}

public class module3_12{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the message you want to pass in the Thread 1: ");
		String message1 = sc.nextLine();
		System.out.print("Enter how many times you want to pass the message: ");
		int num1 = sc.nextInt();
		threading_methods o1 = new threading_methods(message1,num1);
		System.out.print("Enter the name of the thread 1: ");
		String threadname = sc.next();
		o1.setName(threadname);
		System.out.print("Enter the priority of the thread 1: ");
		int prioritythread = sc.nextInt();
		o1.setPriority(prioritythread);
		System.out.print("Enter the message you want to pass in the Thread 2: ");
                String message2 = sc.next();
                System.out.print("Enter how many times you want to pass the message: ");
                int num2 = sc.nextInt();
                threading_methods o2 = new threading_methods(message2,num2);
                System.out.print("Enter the name of the thread 2: ");
                String threadname1 = sc.next();
                o2.setName(threadname1);
                System.out.print("Enter the priority of the thread 2: ");
                int prioritythread1 = sc.nextInt();
                o2.setPriority(prioritythread1);
                System.out.println("Starting thread 1");
		o1.start();
		System.out.println("Starting thread 2");
                o2.start();
	}
}

