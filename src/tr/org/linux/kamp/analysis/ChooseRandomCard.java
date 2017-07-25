package tr.org.linux.kamp.analysis;

public class ChooseRandomCard {
	private static HelloRandom rgen = new HelloRandom();


	public static void main(String[] args) {
		System.out.println(chooseRandomCard());
	}
		
	
	private static String chooseRandomCard() {
		return chooseRandomCard() + " " + chooseRandomRank();
		
		
          
	
}
	 /*as,2,3,4,5,6,7,8,9,Vale,Kiz,Papaz*/	
	private static String chooseRandomRank() {
		int randomNumber = rgen.nextInt(13)+1;
		if(randomNumber > 1 && randomNumber <= 10)
			return " " + randomNumber;
			else {
	    switch(randomNumber) {
	    case 1:
	    	return"As";
	    
	    case 10:
	    	return "" +randomNumber;
	    case 11:
	    	return"Vale";
	    case 12:
	    	return"kiz";
	    case 13:
	    	return "papaz";
	    default:
	    	return "hata";
	    }
	    
	    }
	}
	
	/*karo,maca,sinek,kupa*/
	private static String chooseRandomSuit() {
			int randomNumber= rgen.nextInt(4);
			switch(randomNumber) {
				case 0:
					return "maca";
				case 1:
					return"kupa";
				case 2:
					return"karo";
				case 3:
					return"sinek";
		        default:
					return"hata";
			}
	}
}
			


