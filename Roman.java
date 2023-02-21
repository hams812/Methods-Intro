public class Roman {
	public static void main(String[] args) {
		//Task 8: Conjugate Spanish -ar verb
		conjugateArVerb("hablar");
		conjugateArVerb("tenir");
		
		//Task 9: Value of Roman strings
		String romanString = "IIVXIIVV";
		System.out.println("\nThe value of " + romanString + " is " + valueOfRomanString(romanString));
		romanString = "IVXXVI";
		System.out.println("\nThe value of " + romanString + " is " + valueOfRomanString(romanString));
		romanString = "XXXVVVIII";
		System.out.println("\nThe value of " + romanString + " is " + valueOfRomanString(romanString));
	}
	
	//Task 8
	public static void conjugateArVerb(String verbToConjugate) {
		//Validate the passed-in string ends in AR
		if(verbToConjugate.toUpperCase().matches(".*AR")) {
			String root = verbToConjugate.substring(0, verbToConjugate.length() - 2);
			System.out.println("\nConjugates of the verb " + verbToConjugate);
			System.out.println("I:\t\t" + root + "o");
			System.out.println("You (informal):\t" + root + "as");
			System.out.println("You (formal):\t" + root + "a");
			System.out.println("We:\t\t" + root + "amos");
			System.out.println("They:\t\t" + root + "an");
		} else {
			System.out.println("Error: " + verbToConjugate + " is not a Spanish -ar verb.");
		}
	}
	
	//Task 9
	public static int valueOfRomanString(String roman) {
		//Validate the passed-in string is "Roman" by checking a regex of any number of Xs, Vs, and Is
		if(!roman.matches("[XVI]*")) {
			return -1;
		}
		int sum = 0;
		int value = 0;
		for(int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			if(c == 'X') {
				value = 10;
			} else if(c == 'V') {
				value = 5;
			} else {
				value = 1;
			}
			sum += value;
		}
		return sum;
	}
}