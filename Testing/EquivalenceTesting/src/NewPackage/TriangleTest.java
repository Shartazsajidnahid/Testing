package NewPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
	public static final int INVALID = -1;
	public static final int SCALENE = 0;
	public static final int ISOSELES = 1;
	public static final int EQUILATERAL = 2;
	
	Triangle triangle = new Triangle();
	@Test
	void o1() {
		assertEquals(INVALID, triangle.checkTriangle(10, 5, 5));
	}
	
	@Test
	void o2() {
		assertEquals(EQUILATERAL, triangle.checkTriangle(5, 5, 5));
	}
	
	@Test
	void o3() {
		assertEquals(ISOSELES, triangle.checkTriangle(1, 5, 5));
	}
	
	@Test
	void o4() {
		assertEquals(SCALENE, triangle.checkTriangle(10, 9, 5));
	}
	
	@Test
	void I1() {
		assertEquals(EQUILATERAL, triangle.checkTriangle(5, 5, 5));
	}
	@Test
	void I2() {
		assertEquals(INVALID, triangle.checkTriangle(0, 5, 5));
	}
	@Test
	void I3() {
		assertEquals(INVALID, triangle.checkTriangle(11, 5, 5));
	}
	@Test
	void I4() {
		assertEquals(EQUILATERAL, triangle.checkTriangle(5, 5, 5));
	}
	@Test
	void I5() {
		assertEquals(INVALID, triangle.checkTriangle(5, 0, 5));
	}
	
	@Test
	void I6() {
		assertEquals(INVALID, triangle.checkTriangle(5, 11, 5));
	}
	
	@Test
	void I7() {
		assertEquals(EQUILATERAL, triangle.checkTriangle(5, 5, 5));
	}
	@Test
	void I8() {
		assertEquals(INVALID, triangle.checkTriangle(5, 5, 0));
	}
	
	@Test
	void I9() {
		assertEquals(INVALID, triangle.checkTriangle(5, 5, 11));
	}
	
	@Test
	void I10() {
		assertEquals(EQUILATERAL, triangle.checkTriangle(5, 5, 5));
	}
	
	@Test
	void I11() {
		assertEquals(ISOSELES, triangle.checkTriangle(5, 5, 1));
	}
	@Test
	void I12() {
		assertEquals(ISOSELES, triangle.checkTriangle(1, 5, 5));
	}
	@Test
	void I13() {
		assertEquals(ISOSELES, triangle.checkTriangle(5, 1, 5));
	}
	@Test
	void I14() {
		assertEquals(SCALENE, triangle.checkTriangle(9, 5, 10));
	}
	@Test
	void I15() {
		assertEquals(INVALID, triangle.checkTriangle(5, 5, 10));
	}
	
	@Test
	void I16() {
		assertEquals(INVALID, triangle.checkTriangle(1, 5, 10));
	}
	
	@Test
	void I17() {
		assertEquals(INVALID, triangle.checkTriangle(10, 5, 5));
	}
	@Test
	void I18() {
		assertEquals(INVALID, triangle.checkTriangle(10, 5, 1));
	}
	
	@Test
	void I19() {
		assertEquals(INVALID, triangle.checkTriangle(5, 10, 5));
	}
	
	@Test
	void I20() {
		assertEquals(INVALID, triangle.checkTriangle(5, 10, 1));
	}
	

}
