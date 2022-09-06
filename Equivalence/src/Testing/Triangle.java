package Testing;


public class Triangle {
	
	public static final int INVALID = -1;
	public static final int SCALENE = 0;
	public static final int ISOSELES = 1;
	public static final int EQUILATERAL = 2;
	
	public boolean isAtriangle(int a, int b, int c) {
		boolean isATriangle;

		// Is A Triangle?
		if((a < b + c) && (b < a + c) && (c < a + b))
			isATriangle = true;
		else
			isATriangle = false;
		return isATriangle;
	}
	
	public int checkTriangle(int a, int b, int c) {

		
		// Determine Triangle Type
		int triangleType = INVALID;
		if(isAtriangle(a,b,c)) {
 			if((a == b) && (b == c))
				triangleType = EQUILATERAL;
 			else if((a != b) && (a != c) && (b != c))
				triangleType = SCALENE;
			else
				triangleType = ISOSELES;
		} 
		else
			triangleType = INVALID;
		
		return triangleType;
	}
}