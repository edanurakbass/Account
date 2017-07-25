package tr.org.linux.kamp.analysis;
import java.util.Random;


public class HelloRandom {




	public static void main(String[] args) {
		System.out.println("Math random"+ Math.random());
	    HelloRandom rgen = new HelloRandom();
	}

	private Random rgen;
	 
	private String nextInt() {
		String rgen;
		System.out.println("Rgen random next int" +   rgen.nextInt());	
		return rgen;
	}

	// Random rgen2 = new Random(5);
	    //System.out.println("Rgen2 random next int" + rgen2.nextInt());
	    
	    
	    	int result1 =rgen.nextInt(3)+8;
		   System.out.println("rgen random 8-10 " + result1);		

}
	
	

	/*
	
	}System.out.println("Math random"+ Math.random());
	String rgen = new HelloRandom();
	System.out.println("Rgen random next int" + rgen.nextInt());	
	//System.out.println("rgen random next double" + rgen.nextdouble());	

	// Random rgen2 = new Random(5);
	//System.out.println("Rgen2 random next int" + rgen2.nextInt());


		int result =rgen.nextInt(3)+8;
	   System.out.println("rgen random 8-10 + result");		



	}

*/



	

