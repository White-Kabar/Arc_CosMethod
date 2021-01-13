import java.io.*;
public class Arc_CosMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		double xa, xb, ya, yb, theta;
		xa = readDouble("xa is =");
		ya = readDouble("ya is =");
		xb = readDouble("xb is =");
		yb = readDouble("yb is =");
		theta = calculateAngle (xa, ya, xb, yb);
		System.out.print("Angle between ("+xa+","+ya+") and"); 
		System.out.print(" ("+xb+","+yb+") is ");
		System.out.println(setDecimalPoints(theta,2)+" degrees.");

	}
	public static double readDouble (String s) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print(s);
		return Double.parseDouble(input.readLine());
	}
	public static double calculateAngle (double x1, double y1, double x2, double y2) {
		double len1, len2, thetaInRad;
		len1 = length(x1, y1);
		len2 = length(x2, y2);
		thetaInRad = Math.acos(x1*x2+y1*y2/(len1*len2));
		return Math.toDegrees(thetaInRad);
	}
	public static double length(double a, double b) {
	return Math.sqrt(a*a+b*b);
	}
	public static String setDecimalPoints(double d,int n) 
	{ 
	double nPowerOf10 = Math.pow(10,n); 
	String nDecimalPoints = 
	"."+(int)(Math.round(d*nPowerOf10)%nPowerOf10); 
	String integerDigit = (int)d+""; 
	return integerDigit+nDecimalPoints; 
	}
}
