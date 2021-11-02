package part1.calculatingWithNumbers;

public class Division {

	public static void main(String[] args) {
		
		//int result = 3 / 2;
		//System.out.println(result); // print 1
		
		//int first = 3;
		//int second = 2;
		//double result = first / second;
		//System.out.println(result); // print 1.0
		
		
		double whenDividendIsFloat = 3.0 / 2;
		System.out.println(whenDividendIsFloat); // prints 1.5

		double whenDivisorIsFloat = 3 / 2.0;
		System.out.println(whenDivisorIsFloat); // prints 1.5
		
		
		int first = 3;
		int second = 2;

		double result1 = (double) first / second;
		System.out.println(result1); // prints 1.5

		double result2 = first / (double) second;
		System.out.println(result2); // prints 1.5

		double result3 = (double) (first / second);
		System.out.println(result3); // prints 1.0
		
		
		
		int dividend = 3;
		int divisor = 2;

		double result = 1.0 * dividend / divisor;
		System.out.println(result); // prints 1.5
		
		double result4 = dividend / divisor * 1.0;
		System.out.println(result4); // prints 1.0
		
		

	}

}
