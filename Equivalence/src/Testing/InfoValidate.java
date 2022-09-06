package Testing;

public class InfoValidate {
	
	public boolean usernamelength(String name) {
		if(name.length()>=6 && name.length()<=10)
			return true;
		else return false;
	}
	
	public boolean userAge(int age) {
		if(age>17 && age<60) return true;
		else if(age>65 && age<80) return true;
		else return false;
	}
	
	private boolean isLeap(int year)
	{
	// Return true if year
	// is a multiple of 4 and
	// not multiple of 100.
	// OR year is multiple of 400.
	return (((year % 4 == 0) &&
	         (year % 100 != 0)) ||
	         (year % 400 == 0));
	}

	private boolean generaldateCheck(int d, int m, int y) {
		   if (y > 9999 || y < 1962)
			    return false;
			    if (m < 1 || m > 12)
			    return false;
			    if (d < 1 || d > 31)
			    return false;
			 
			    // Handle February month
			    // with leap year
			    if (m == 2)
			    {
			        if (isLeap(y))
			        return (d <= 29);
			        else
			        return (d <= 28);
			    }
			 
			    // Months of April, June,
			    // Sept and Nov must have
			    // number of days less than
			    // or equal to 30.
			    if (m == 4 || m == 6 ||
			        m == 9 || m == 11)
			        return (d <= 30);
			 
			    return true;
	}
	
	public boolean dateCheck(int m, int d, int y) {
		if(generaldateCheck(d,m,y) == true) {
			if(y==1962 && m>=5 && d <=20)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}
}