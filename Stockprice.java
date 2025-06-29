package practice;
import java.util.Scanner;
public class Stockprice {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of stock");
		int i=1;
		int stock=sc.nextInt();
		int arr[]=new int [stock];
		while(i<=stock) {
			System.out.println("enter the value"+i);
			arr[i]=sc.nextInt();
			i++;
		}
		float avg=	(arr[0]+arr[1]+arr[2])/stock;
		if(arr[0]>arr[1]&&arr[0]>arr[2])
			System.out.println("highest"+arr[0]);
		else if(arr[1]>arr[stock])
			System.out.println("lowest"+arr[2]);
		else 
		System.out.println(avg);

}
}
