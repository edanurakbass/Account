package tr.org.linux.kamp.student;

import java.util.Random;
import java.util.Scanner;

public class Zar {
	private static Random rgen = new Random();
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("oyuncu 1 in ismini giriniz :");
		String user1 = input.next();
		
		System.out.println("oyuncu 2 in ismini giriniz :");
		String user2 = input.next();
		
		int dice1 = roll();
		int dice2 = roll();
		
		System.out.println("oyuncu 1 in zari :" + dice1);
		System.out.println("oyuncu 2 in zari :" + dice2);
		String winner = "";
		
		if(dice1 > dice2) {
			winner += dice1;
			System.out.println("kazanan" + "=" + user1);

		}
		else if(dice1==dice2) {
			winner += "berabere";
			System.out.println("kazanan" + "=" + "dostluk");

		}
		else {
			winner += dice2;
			System.out.println("kazanan" + "=" + user2);


		}
	}
		
		public static int roll() {
			//zarin degerini dondurecek
			
			return rgen.nextInt(6)+1;
			
	}
		
}

