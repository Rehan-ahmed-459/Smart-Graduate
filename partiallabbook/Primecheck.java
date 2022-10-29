package javasecondlabbook;

import java.util.Scanner;

public class Primecheck {
	public static void main(String[] args) {
		int i;
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=reader.nextInt();
		reader.close();
		boolean f=false;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=true;
				break;
				
			}
		}
		if(f==false) {
			System.out.println("The number"+n+"is a prime number ");
		}
		else {
			System.out.println("The number is "+n+"is not a prime number ");
		}
		
	}

}
