/*
 * Calculator Revisited
Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.
 */
public class Calculator {
	
	public static int add(int num, int num2) {
		return num + num2;
	}
	
	public static int sub(int num, int num2) {
		return num - num2;
	}
	
	public static String div(double num, double num2) {
		if(num < num2) {
			return "" + num / num2;
		} else {
			return "You can't divide those numbers";
		}
	}

	public static int mul(int num, int num2) {
		return num * num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(2,1));
	}

}
