package NewPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateCheckTest {

	InfoValidate test = new InfoValidate();
	@Test
	void o1() {
		assertEquals(true, test.dateCheck(6, 15, 1962));
	}
	@Test
	void o2() {
		assertEquals(false, test.dateCheck(2, 20, 1962));
	}
	
	
	@Test
	void i1() {
		assertEquals(true, test.dateCheck(6, 15, 1962));
	}
	@Test
	void i2() {
		assertEquals(false, test.dateCheck(0, 15, 1962));
	}
	
	@Test
	void i3() {
		assertEquals(false, test.dateCheck(13, 15, 1962));
	}
	@Test
	void i4() {
		assertEquals(true, test.dateCheck(6, 15, 1962));
	}
	
	@Test
	void i5() {
		assertEquals(false, test.dateCheck(6, -1, 1962));
	}
	@Test
	void i6() {
		assertEquals(false, test.dateCheck(6, 32, 1962));
	}
	
	@Test
	void i7() {
		assertEquals(true, test.dateCheck(6, 15, 1962));
	}
	@Test
	void i8() {
		assertEquals(false, test.dateCheck(6, 15, 10000));
	}
	
	@Test
	void i9() {
		assertEquals(false, test.dateCheck(6, 15, 1890));
	}
}
