package javasecondlabbook;

public class Prog20 {
	public static void main(String[] args) {
		int sumodd=0;
		int sumeve=0;
		int absdiff;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sumeve+=i;
			}
			else {
				sumodd+=i;
			}
			}
			if(sumodd>sumeve) {
				absdiff=sumodd-sumeve;
			}
			else {
				absdiff=sumeve-sumodd;
			}
		System.out.println("The difference is :"+absdiff);
	}

}
