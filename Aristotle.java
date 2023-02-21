public class Aristotle {

	public static void main(String[] args) {
		//Task 1: Convert F to C
		double degreesF = 212;
		double degreesC = convertFtoC(degreesF);
		System.out.println(degreesF + " deg F = " + degreesC + " degC");
		degreesF = 32;
		degreesC = convertFtoC(degreesF);
		System.out.println(degreesF + " deg F = " + degreesC + " degC");
		
		//Task 2: Reverse a string
		String strToTest = "Foo";
		System.out.println(strToTest + " reversed is " + reverseString(strToTest));
		strToTest = "Bar";
		System.out.println(strToTest + " reversed is " + reverseString(strToTest));
		strToTest = "Racecar";
		System.out.println(strToTest + " reversed is " + reverseString(strToTest));
		
		//Task 3: 
		System.out.println("The random integer from 1 roll of a six-sided die is " + makeRandomOneToSix());
		
		//Task 4: Sum of Rolling dice 3 times
		int numRolls = 3;
		System.out.println("The sum of " + numRolls + " rolls of six-sided die is " + sumOfDiceRolls(numRolls));		
	}
	
	//Task 1
	public static double convertFtoC(double degreesF) {
		return ((degreesF - 32) * 5.0 )/ 9.0;
	}
	
	//Task 2
	public static String reverseString(String strToReverse) {
		String reversed = "";
		for (int i = strToReverse.length() - 1; i >= 0; i--) {
			reversed = reversed + strToReverse.charAt(i);
		}
		return reversed;
	}
	
	//Task 3
	public static int makeRandomOneToSix() {
		return (int)(Math.random() * 6 + 1);
	}
	
	//Task 4
	public static int sumOfDiceRolls(int numRolls) {
		if(numRolls < 0) {
			return -1;
		}
		int sum = 0;
		for(int i = 1; i <= numRolls; i++) {
			sum += makeRandomOneToSix();
		}
		return sum;
	}
}