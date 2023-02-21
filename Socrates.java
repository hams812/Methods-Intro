public class Socrates {
	public static void main(String[] args) {
		//Task 5 + Task 6
		int n = 4;
		int triangularNumber = triangularNumber(n);
		int tetrahedral = tetrahedralNumber(n);
		System.out.println("n = " + n + ": triangular = " + triangularNumber + ", tetrahedral: " + tetrahedral);
		
		//Task 7: Sum of odd consecutive integers
		int m = -5;
		n = 9;
		System.out.println("The sum of consecutive integers from " + m + " to " + n + " is " + sumConsecutiveOdd(m, n));
	}
	
	//Task 5
	public static int triangularNumber(int n) {
		if(n < 0) {
			return -1;
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	//Task 6
	public static int tetrahedralNumber(int n) {
		if(n < 0) {
			return -1;
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += triangularNumber(i);
		}
		return sum;
	}
	
	//Task 7
	public static int sumConsecutiveOdd(int m, int n) {
		//If m > n, swap them
		if(m > n) {
			int temp = n;
			n = m;
			m = temp;
		}
		//If m is even, change it to the next odd number
		if(m % 2 == 0) {
			m++;
		}
		int sum = 0;
		for(int i = m; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}
	
}
