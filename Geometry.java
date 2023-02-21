import java.util.Scanner;
public class Geometry{

	public static void main(String[] args){
        	Scanner keys= new Scanner(System.in);
        	System.out.println("Enter side 1 of the triangle");
        	double a = keys.nextDouble();
        	System.out.println("Enter side 2 of the triangle");
        	double b = keys.nextDouble();
        	System.out.println("Enter side 3 of the triangle");
        	double c = keys.nextDouble();
		//double c = solveHypotenuse(6, 8); //calling our method
		//System.out.println(c); //prints 5.0
		if(isRightTriangle(a,b,c))
		System.out.println("The triangle with sides "+a+" ,"+b+" and "+c+" is a right triangle");
		else
		System.out.println("The triangle with sides "+a+" ,"+b+" and "+c+" is not a right triangle");
	}

        public static double solveHypotenuse(double a, double b) {
		double a2 = a * a;
		double b2 = b * b;
		return Math.sqrt(a2 + b2);
        }
        
        public static boolean isRightTriangle(double a, double b, double c) {
            if ((a >= b) && (a >= c)&&(a == solveHypotenuse(b, c))) {
                System.out.println("The hypotenuse is "+a);
                return true;
            } 
            else if ((b >= a) && (b >= c)&& (b == solveHypotenuse(a, c))) {
            System.out.println("The hypotenuse is "+b);
            return true;
            } 
            else if((c >= a) && (c >= b)&& (c == solveHypotenuse(a, c))) {
            System.out.println("The hypotenuse is "+c);
            return true;
            }
            return false;
        }


}
