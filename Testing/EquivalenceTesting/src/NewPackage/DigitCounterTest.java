package NewPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitCounterTest {

	@Test
	void test1() {
		DigitCounter test = new DigitCounter();
		assertEquals(false, test.getNumberOfDigits(3));
	}
	
	@Test
	void test2() {
		DigitCounter test = new DigitCounter();
		assertEquals(true, test.getNumberOfDigits(12));
	}
	
	@Test
	void test3() {
		DigitCounter test = new DigitCounter();
		assertEquals(true, test.getNumberOfDigits(310));
	}
	
	@Test
	void test4() {
		DigitCounter test = new DigitCounter();
		assertEquals(false, test.getNumberOfDigits(7102));
	}

}
