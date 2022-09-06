package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkingLotTest {

	@Test
	void test1() {
		Car car = new Car(500, true, true, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(true, ptl.checkvalidity());
		assertEquals(1500, ptl.getPrice());
	}
	
	@Test
	void test2() {
		Car car = new Car(500, false, true, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	@Test
	void test3() {
		Car car = new Car(500, true, false, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test4() {
		Car car = new Car(500, false, false, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test5() {
		Car car = new Car(500, true, true, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(true, ptl.checkvalidity());
		assertEquals(1000, ptl.getPrice());
	}
	
	@Test
	void test6() {
		Car car = new Car(500, true, false, false);
		ParkingLot ptl = new ParkingLot(car);
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test7() {
		Car car = new Car(500, false, true, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	@Test
	void test8() {
		Car car = new Car(500, false, false, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
//	....................
	
	@Test
	void test9() {
		Car car = new Car(1200, true, true, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test10() {
		Car car = new Car(1200, false, true, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	@Test
	void test11() {
		Car car = new Car(1200, true, false, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test12() {
		Car car = new Car(1200, false, false, true);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test13() {
		Car car = new Car(1200, true, true, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test14() {
		Car car = new Car(1200, true, false, false);
		ParkingLot ptl = new ParkingLot(car);
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	@Test
	void test15() {
		Car car = new Car(1200, false, true, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	@Test
	void test16() {
		Car car = new Car(1200, false, false, false);
		ParkingLot ptl = new ParkingLot(car);
		
		assertEquals(false, ptl.checkvalidity());
		assertEquals(999999, ptl.getPrice());
	}
	
	

}
