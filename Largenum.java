package practice;
import java.util.Scanner;
public class Largenum {
	public static void main(String[] args) {
		System.out.println(" enter the num:");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("a is largest number:"+a);
		else if(b>c)
		System.out.println("b is largest number:"+b);
		else if(c>a)
			System.out.println("c is largest num:"+c);
		else
			System.out.println("all num is equal:");
		sc.close();
	}

}