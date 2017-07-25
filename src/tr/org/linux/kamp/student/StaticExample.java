package tr.org.linux.kamp.student;

public class StaticExample {
	public static String myStaticString = " bur bir static string";
	
	public static String myStaticAtringMethod() {
		return " bu bur static method";
		
	}
	
	static {
		System.out.println("bu bir static blok");
	}
	static {
		System.out.println("bu da 2.static method");
	}
	static {
		int x = 5;
		System.out.println(x);
		System.out.println("bu da 3.static blok");
//System.out.println(StaticExample.myStaticString);

}
}
