package practice;
import java.util.Scanner;
public class CyberSpeed {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int speed= sc.nextInt();
		 sc .close();
		if(speed<0)
			System.out.println("Opps! Start the Car!");
		else if(speed==0)
		System.out.println("Opps! Start the Car!");
		else if(speed>=1&&speed<61)
			System.out.println("You are driving safely.keep it up!");
		else if(speed>60&&speed<71)
			System.out.println("Warning you are slightly over the speed limit");
		else if(speed>70&&speed<201)
			System.out.println("you are speeding!ypu will receive a ticket");
		else
			System.out.println("invalid input");
		
		

	}

}
