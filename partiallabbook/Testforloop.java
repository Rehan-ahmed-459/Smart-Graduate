package javalabbook;


public class Testforloop {
public static void main(String[] args) {
	int sumodd=0;
	int sumeve=0;
	int absdiff;
	for(int number=1;number<=100;number++) {
		if(number%2!=0) {
			sumodd+=number;
		}
		else {
			sumeve+=number;
		}
	}
	if(sumodd>sumeve) {
		absdiff=sumodd-sumeve;
		System.out.println("absolute difference(odd)="+absdiff);
	}
	else {
		absdiff=sumeve-sumodd;
		System.out.println("absolute differece(eve)="+absdiff);
	}
}
	}
	


