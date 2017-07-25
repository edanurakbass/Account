package tr.org.linux.kamp.analysis;

import java.util.Scanner;

public class PrimeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int number = input.nextInt();
		boolean isPrime = true;
		
		for(int i=2; i < Math.sqrt(number); i++) {
			if(number%i==0){
				System.out.println("Asal degil");
				isPrime = false;
				break;
				
			}
		}
		
		if(isPrime) {
			System.out.println(number + " bir asal sayidir");
		}
		else {
			System.out.println(number + "asal sayi degildir");
		}
		
	}

}
