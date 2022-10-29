package javasecondlabbook;

import java.util.Scanner;

public class Addnumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1=reader.nextInt();
		System.out.println("Enter the number 2 :");
		int num2=reader.nextInt();
		reader.close();
		int sum=num1+num2;
		System.out.println("The sume of the two number is :"+sum);
		
	}

}
