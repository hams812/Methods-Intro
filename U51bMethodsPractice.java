public class U51bMethodsPractice{

    //Warm Up
    //1.
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9.0 / 5.0);
    }
    
    //2.
    public static String reverseString(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }
    
    //3.
    public static int randInt(int n) {
        return 1 + (int)(Math.random() * n);
    }
    
    //4.
    public static int rollDice(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += randInt(6);
        }
        return total;
    }
    
    //1.
    public static int getTriangular(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    //2.
    public static int getTetrahedral(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + getTriangular(i);
        }
        return sum;
    }
    
    //3.
    public static int sumOddNumbersInRange(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
    
    //4.
    public static void conjugateRegularARVerb(String infinitive) {
        int length = infinitive.length();
        String stem = infinitive.substring(0, length - 2);
        System.out.println(stem + "o");
        System.out.println(stem + "as");
        System.out.println(stem + "a");
        System.out.println(stem + "amos");
        System.out.println(stem + "an");
    }
    
    //5.
    public static int getDigitValue(char d) {
        if (d == 'I') {
            return 1;
        } else if (d == 'V') {
            return 5;
        } else if (d == 'X') {
            return 10;
        } else {
            return 0;
        }
    }

    public static int getRDSValue(String rds) {
        int total = 0;
        for (int i = 0; i <= rds.length() - 1; i++) {
            total += getDigitValue(rds.charAt(i));
        }
        return total;
    }
    
    //6.
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i <= (s.length() - 1); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String s) {
        s = s.trim();
        int words = 1;
        for (int i = 0; i <= (s.length() - 1); i++) {
            if (s.charAt(i) == ' ') {
                words++;
            }
        }
        return words;
    }

    public static boolean isSumptuous(String quotation) {
        double length = quotation.length(); //cast to double for division
        double vowels = countVowels(quotation);
        System.out.println(vowels);
        System.out.println(length);
        System.out.println(vowels / length);
        if (countWords(quotation) <= 1) {
            return false;
        } else {
            return ((vowels / length) >= 0.4);
        }
    }
    
    //7.
    public static boolean hasOnlyVowels(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!isVowel(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasOnlyConsonants(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (isVowel(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAlternatingVC(String s) {
        String oddChars = "";
        String evenChars = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i % 2 == 1) {
                oddChars = oddChars + s.charAt(i);
            } else {
                evenChars = evenChars + s.charAt(i);
            }
        }

        if (hasOnlyConsonants(oddChars) && hasOnlyVowels(evenChars)) {
            return true;
        } else if (hasOnlyConsonants(evenChars) && hasOnlyVowels(oddChars)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAwesome(String s) {
        boolean hasStartingVowel = isVowel(s.charAt(0));
        boolean hasEndingVowel = isVowel(s.charAt(s.length() - 1));
        boolean hasConsonant = !hasOnlyVowels(s);
        return (hasStartingVowel && hasEndingVowel && hasConsonant && 
            hasAlternatingVC(s));
    }

    public static boolean isSuper(String s) {
        boolean hasStartingCons = !isVowel(s.charAt(0));
        boolean hasEndingCons = !isVowel(s.charAt(s.length() - 1));
        boolean hasVowel = !hasOnlyConsonants(s);
        return (hasStartingCons && hasEndingCons && hasVowel && 
            hasAlternatingVC(s));
    }

    public static String classifyWord(String s) {
        if (isAwesome(s)) {
            return "awesome";
        } else if (isSuper(s)) {
            return "super";
        } else {
            return "mundane";
        }
    }
    
    //8.
    public static String toRDS(int n) {
        String rds = "";
        while (n >= 10) {
            n -= 10;
            rds = rds + "X";
        }

        if (n >= 5) {
            n -= 5;
            rds = rds + "V";
        }

        for (int i = n; i > 0; i--) {
            rds = rds + "I";
        }
        return rds;
    }

    public static String convertToProperRDS(String rds) {
        return toRDS(getRDSValue(rds));
    }
    
    //9.
    public static boolean isTriangular(int n) {
        int i = 1;
        while (n > 0) {
            n -= i;
            i++;
        }
        return (n == 0);
    }
    
    public static void print10TriangularRDS() {
        int count = 0;
        int n = 1;
        while (count < 10) {
            int tri = getTriangular(n);
            String rds = toRDS(tri);
            
            if (isTriangular(rds.length())) {
                count++;
                System.out.println(count + ": " + rds);
            }
            
            n++;
        }
    }












    
}
