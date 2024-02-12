package pattern_Pgm.com;

public class Pattern {

	public static void main(String[] args) {
		pattern_1(5);
		pattern_2(5);
		pattern_3(5);
		pattern_4(5);
		pattern_5(5);
		pattern_6(5);
	}
	
	static void pattern_1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}

	static void pattern_2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}
	
	static void pattern_3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}
	
	static void pattern_4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n-row; col++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}
	
	static void pattern_5(int n) {
		for (int row = n; row >= 1; row--) {
			for (int col = row; col <= n-1; col++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("========================");
	}
	
	static void pattern_6(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n-row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}
}
