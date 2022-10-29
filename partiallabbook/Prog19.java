package javasecondlabbook;

public class Prog19 {
	public static void main(String[] args) {
		int upperbound=100;
		int i=0;
		int sum=0;
		while(i<=upperbound) {
			if(i%2==0) {
				sum+=i;
				++i;
			}
		}
		System.out.println(+sum);
	}

}
