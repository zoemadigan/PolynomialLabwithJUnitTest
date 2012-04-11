/**
 * Name:Zoe Madigan
 * Lab Section: C
 * Date: 2-26-2012
 * Email: zoemadigan@wustl.edu
 * RecursionTest.java
 *
 */

public class Recursion {
	
	// Example:
	static int factorial(int k) {
		if (k == 0)
			return 1;
		else
			return k * factorial(k-1);
	}
	
	// Your methods go here.
	
	/**
	 * Recursive method returns the sum of the positive integers of n+(n-2)+(n-4)... (until n-x =< 0)
	 */
	static int sumDownBy2(int n) {
		if  (n<1)
			return 0;
		else
			return n + sumDownBy2(n-2);
	}

	/**
	 * Recursive method returns the harmonic sum of n-1
	 */
	static double harmonicSum(int n) {
		if (n < 2)
			return 1;
		else
			return 1.0/(n) + (harmonicSum(n-1) );
	}

	/**
	 * Recursive method returns the geometric sum
	 */
	static double geometricSum(double k) {
		if (k < 0)
			return 0;
		else
			return 1/ ( Math.pow(2, k) ) + (geometricSum(k-1));
	}
	
	/**
	 * Recursive method returns the multiplacative sum of j*k (uses multhelper and then addresses the negative case)
	 */	
	static int mult(int j, int k) {
		if (k < 0)
			return -multHelper(j,-k);
		else
			return multHelper(j, k);
	}

	/**
	 * Recursive method returns the multiplacative sum of j*k when integers j, k are positive
	 */		
	static int multHelper (int j, int k) {
		if ( j == 0 || k == 0)
			return 0; 
		else 
			return (j + mult(j, k-1));
	}
	
	/**
	 * Recursive method returns the value of n to the k
	 */	
	static int expt(int n, int k) {
		if (k <= 0)
			return 1;
		else
			return n * expt (n, k-1);
	}
	
	/**
	 * Recursive method returns the least common multiple of integers j and k
	 */		
	static int lcm(int j, int k) {
		return (j*k)/(gcd(j, k));
	}	

	/**
	 * Recursive method returns the greatest common denominator of integers a and b
	 */		
	static int gcd(int a, int b) {
		if (b==0)
			return a;
		else
			return gcd(b, a % b);
	}

	/**
	 * Finds months needed to pay off loan p
	 * @param p is principal
	 * @param i is interest
	 * @param mp is monthly payment
	 */	
	static int loanLength(int p, double i, int mp) {
		return loanLengthHelper (p, i/12, mp, 0);	
	}
	
	/**
	 * Recursive method returns the greatest common denominator of integers a and b
	 * @param p is principal
	 * @param i is interest
	 * @param mp is monthly payment
	 * @param months is months paid
	 */	
	static int loanLengthHelper(double p, double i, double mp, int months) {
		if (p <= 0)
			return months;
		else {
			System.out.println("Month"+months+":"+ (int) p); 
			return loanLengthHelper((p-mp)+(p*i), i, mp, months+1);
		}
	}
	
	
	
	
	
	
}
