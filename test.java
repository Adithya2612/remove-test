package JUNIT.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharTest {
	
	/*1.ABCD - BCD
	 * 2.AACD - CD
	 * 3.BACD - BCD
	 * 4.BBAA - BBAA
	 * 5.AABAA - BAA
	 * 6.B - B
	 * 7.A - ""
	 * 8.AA - ""
	 * 9."" - ""
	 */
	
	Removal re;
	@BeforeEach
	void setup() {
		 re = new Removal();
	}
	
	@Test
	
	void testnChars() {
		assertEquals("BCD",re.remove("ABCD"));
		assertEquals("CD",re.remove("AACD"));
		assertEquals("BCD",re.remove("BACD"));
		assertEquals("BBAA",re.remove("BBAA"));
		assertEquals("BAA",re.remove("AABAA"));
	}
	
	void test1Char() {
		assertEquals("",re.remove("A"));
		assertEquals("B",re.remove("B"));
		
	}
	
	void testnoChar() {
		assertEquals("",re.remove(""));
	}
	
	
}
