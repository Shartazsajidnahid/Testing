package NewPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoValidateTest {
	
	InfoValidate test = new InfoValidate();
	@Test
	void test1() {
		assertEquals(true, test.usernamelength("nahidd"));
	}
	
	@Test
	void test2() {
		assertEquals(false, test.usernamelength("nah"));
	}
	
	@Test
	void test3() {
		assertEquals(false, test.usernamelength("yooooooooooooooooo"));
	}
	
	
	
	@Test
	void agetest1() {
		assertEquals(true, test.userAge(33));
	}
	
	@Test
	void agetest2() {
		assertEquals(true, test.userAge(70));
	}
	
	@Test
	void agetest3() {
		assertEquals(false, test.userAge(3));
	}
	
	@Test
	void agetest4() {
		assertEquals(false, test.userAge(62));
	}
	
	@Test
	void agetest5() {
		assertEquals(false, test.userAge(90));
	}


}
