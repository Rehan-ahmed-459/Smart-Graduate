package javalabbook;

public class Sumintdowhile {
public static void main(String[] args) {
	int sum=0;
	final int upperbound=100;
	int i=1;
	do {
		sum+=i;
		i++;
	}while(i<=upperbound);
	System.out.println("sum of 1 to 100 is :"+sum);
}

}
