package javasecondlabbook;

import java.util.Scanner;

public class Printinteger {
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num1=reader.nextInt();
		reader.close();
		System.out.println("The number that you have entered is :"+num1);
	}

}
