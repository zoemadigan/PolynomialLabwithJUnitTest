import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Name:Zoe Madigan
 * Lab Section: C
 * Date: 2-26-2012
 * Email: zoemadigan@wustl.edu
 * RecursionTest.java
 */

public class RecursionTest {
		
		/**
		 * Test to determine whether the sumDownBy2 recursive method returns the sum of the positive integers of n+(n-2)+(n-4)... (until n-x =< 0)
		 */
		@Test
		public void testSumDownBy2() {
			assertEquals(0, Recursion.sumDownBy2(0));
			assertEquals(2, Recursion.sumDownBy2(2));
			assertEquals(6, Recursion.sumDownBy2(4));
		}
		
		/**
		 * Test to determine whether the harmonicSum recursive method returns the sum of the positive integers of 1 + 1/2 + 1/(n-1) .... + 1/n
		 */
		@Test
		public void testHarmonicSum() {
			assertEquals(1, Recursion.harmonicSum(1), 0.001);
			assertEquals(1.5, Recursion.harmonicSum(2), 0.001);
			assertEquals(1.833, Recursion.harmonicSum(3), 0.001);
			assertEquals(2.083, Recursion.harmonicSum(4), 0.001);
		}
		
		/**
		 * Test to determine whether the geometricSum recursive method returns the sum of the positive integers of 1 + 1/2 + 1/(n-1) .... + 1/n
		 */
		@Test
		public void testGeometricSum() {
			assertEquals(1, Recursion.geometricSum(0), 0.001);
			assertEquals(1.5, Recursion.geometricSum(1), 0.001);
		}
		
		/**
		 * Test to determine whether the mult recursive method returns j*k
		 */
		@Test
		public void testMult() {
			assertEquals(6, Recursion.mult(2,3), 0.001);
			assertEquals(-10, Recursion.mult(-2,5), 0.001);
		}
		
		/**
		 * Test to determine whether the recursive method returns the value of n to k
		 */
		@Test
		public void testExpt() {
			assertEquals(8, Recursion.expt(2,3), 0.001);
			assertEquals(3, Recursion.expt(3,1), 0.001);
		}
		
		/**
		 * Test to determine whether the recursive method returns the least common multiple of j and k
		 */
		@Test
		public void testLCM() {
			assertEquals(15, Recursion.lcm(5,3), 0.001);
			assertEquals(24, Recursion.lcm(6,8), 0.001);
		}
		
		/**
		 * Test to determine whether loan length calc works
		 */
		@Test
		public void testLoanLength() {
			assertEquals(0, Recursion.loanLength(0,0,0));
			assertEquals(5, Recursion.loanLength(1000,.1,250));
		}
		
}
