package practice;
import java.util.Scanner;
public class ArrayArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr1[]=new int[k];
		int arr[]= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int p=0;p<n;p++) {
			arr1[p]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}for(int p=0;p<n;p++) {
			System.out.print(arr1[p]+" ");
		}

		
	}

}
