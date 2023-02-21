public class Shuffle{
    
    public static String cutTop(String s) {
        int length = s.length();
        
        return s.substring(0, length / 2);
    }

    public static String cutBottom(String s) {
        int length = s.length();

        return s.substring(length / 2, length);
    }

    public static String riffle(String a, String b) {
        String shuffled = "";
        for (int i = 0; i <= a.length() - 1; i++) {
            shuffled = shuffled + b.charAt(i);
            shuffled = shuffled + a.charAt(i);
        }
        
        if (shuffled.length() == (a.length() + b.length())) {
            return shuffled;
        } else {
            return shuffled + b.charAt(b.length() - 1);
        }
    }

    public static String shuffle(String s) {
        return riffle(cutTop(s), cutBottom(s));
    }

    public static int countShufflesUntilNormal(String s) {
        String shuffled = shuffle(s);
        int count = 1;
        while (!s.equals(shuffled)) {
            System.out.println(shuffled);
            shuffled = shuffle(shuffled);
            count++;
        }
        System.out.println(shuffled); 
        return count;
    }
}
