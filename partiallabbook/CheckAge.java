package javasecondlabbook;

public class CheckAge {
	static void checkAge(int age) {
		if(age<18) {
			System.out.println("you are not eligible ");
		}
		else {
			System.out.println("you are eligible");
		}
	}
	public static void main(String[] args) {
		checkAge(19);
	}

}
