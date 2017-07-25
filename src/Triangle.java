import java.util.Scanner;

public class Triangle {
	double a;
    double b;

	
	public static double getHypo(double a, double b) {
		return Math.hypot(a, b);
		
	}
	public static double getArea(double a,double b) {
		return (a*b)/2;
	}
	public static double getPerimeter(double a,double b) {
		return a + b + getHypo(a, b);
	}
	public static void main(String[] args) {
	   Scanner 	input = new Scanner(System.in);
		
		System.out.println("birinci kenar uzunlugunu giriniz:");
		double x = input.nextDouble();
		
		System.out.println("ikinci kenar uzunlugunu giriniz:");
		double y = input.nextDouble();
		
		System.out.println("ucgenin alani" + getArea(x,y));
		System.out.println("ucgenin cevresi" + getPerimeter(x,y));
		

	}

	

}
