package javalabbook;

public class Sumaverageusigwhiledo {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		final int lowerbound=1;
		final int upperbound=100;
		while(i<=upperbound) {
			sum+=i;
			i++;
		}
		System.out.println("sum of 1 to hundred is :"+sum);
		
	}

}
