package practice;
import java.util.Scanner;
public class Precedence {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter " + n + " stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int highest = prices[0];
        int lowest = prices[0];
        double sum = 0;

        for (int price : prices) {
            if (price > highest)
            	highest = price;
            if (price < lowest) 
            	lowest = price;
            sum += price;
        }   
        double average =((sum / n) * 100.0) / 100.0;

        System.out.println("Highest stock price    " + highest);
        System.out.println("Lowest stock price " + lowest);
        System.out.printf("Average stock price", average);

        scanner.close();
    }
}

