package NewPackage;

public class DigitCounter {
	
	public boolean getNumberOfDigits(int num) {

	    int count = 0;
//	    num = 0003452;

	    while (num != 0) {
	    	
	      num /= 10;
	      ++count;
	    }
	    if(count>1 && count<4) {
	    	return true;
	    }
	    else return false;
	 }
	    
}
