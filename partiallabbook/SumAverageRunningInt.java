package javalabbook;

public class SumAverageRunningInt {
public static void main(String[] args) {
	int sum=0;
	double average;
	final int lowerbound=1;
	final int upperbound=100;
	for(int i=lowerbound;i<=upperbound;i++) {
		sum+=i;
	}
	System.out.println("the sum of numbers from 1 to 100 is;"+sum);
	average=sum/100;
	System.out.println("average is "+average);
}
}
