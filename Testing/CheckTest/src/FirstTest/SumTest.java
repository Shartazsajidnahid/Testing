package FirstTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void test() {
		Sum test = new Sum();
		assertEquals(10,test.add(6, 3));
	}

}
