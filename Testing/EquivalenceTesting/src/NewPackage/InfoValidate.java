package NewPackage;

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
}
