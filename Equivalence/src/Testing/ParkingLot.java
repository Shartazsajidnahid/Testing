package Testing;

public class ParkingLot {
	Car car;
	int baseprice = 1000;
	public ParkingLot(Car car) {
		this.car = car;
	}
	
	public boolean checkvalidity() {
		if(this.car.insurance == false) 
			return false;
		else if(this.car.security == false)
			return false;
		else if(this.car.weight>1000)
			return false;
		else return true;
	}
	
	public int getPrice() {
		if(this.checkvalidity() == true) {
			if(this.car.isVip == true) {
				return this.baseprice + 500;
			}
			else 
				return this.baseprice;
		}
		else 
			return 999999;
	}
	
}
