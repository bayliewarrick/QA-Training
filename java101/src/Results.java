
public class Results {
	
	int physics;
	int chem;
	int bio;
	int total;
	int percent;
	static int passing = 70;
	
	public static void displayResults(int p, int c, int b) {
		System.out.println("================");
		System.out.println("Physics: " + p);
		System.out.println("Chemistry: " + c);
		System.out.println("Biology: " + b);
		System.out.println("================");
	}
	
	public static double displayAverage(double p, double c, double b) {
		int passingCount = 0;
		if(p >= passing) {
			passingCount += 1;
		}
		if (b >= passing) {
			passingCount += 1;
		}
		if(c >= passing) {
			passingCount += 1;
		}
		if(p < passing || b < passing || c < passing) {
			System.out.println("You are failing at least one course. Please consider reaching out to a professor.");
		}
		System.out.println("You are passing " + passingCount + " out of 3 courses.");
		return (p + c + b) / 3;
	}
	
	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public static double addOrMultiply(int a, int b, boolean c) {
		if(c) {
			return a + b;
		} else {
			return a * b;
		}
	}
	
	public static void flowChart(int a) {
		if(a > 2000) {
			print("a");
			if(a > 6000) {
				print("c");
			} else {
				print("b");
				if (a > 4000) {
					print("d");
				} else {
					print("e");
				}
			}
		} else {
			print("1");
			if(a > 100) {
				print("2");
			} else {
				print("3");
				if(a > 500) {
					print("6");
				} else {
					print("7");
				}
			}
		}
	}
	
	public static int blackJack(int a, int b) {
		if(a > 21 && b > 21) {
			return 0;
		} else {
			if(a == b) {
				print("Tie with: " + a);
			} else {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			}
		}
		return 0;
	}
	
	public static int uniqueSum(int a, int b, int c) {
		int total = 0;
		
		if(a != b || a != c) {
			total += a;
		}
		if(b != c) {
			total += b;
			total += c;
		}
		
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayResults(90, 70, 100);
		//System.out.println(displayAverage(90, 40, 100));
		flowChart(6000);
		print(blackJack(22,23));
		print(uniqueSum(3,3,3));
	}

}
