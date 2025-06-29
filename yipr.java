package practice;
import java.util.Scanner;
public class yipr {
	public static void main(String[] args) {
		        Scanner sc  =new Scanner(System.in);
		        System.out.println("enter the size of array");
		        int prime;
		        int size=sc.nextInt();
		        int mode=sc.nextInt();
		        int sum2=0;
		        int sum1=0;
		        int arr[]=new int[size];
		        for(int i=0;i<size;i++){
		            arr[i]=sc.nextInt();
		        
		        }
		        for (int i = 0; i < arr.length; i++) {
		        for (int j = 1; j <= arr[i]; j++) {
		        if ((i!=0||i!=1)&&arr[i]% j == 0) {
		            sum1+=arr[i];
		        }
		        }
		        }
	}
		      
 
	}


