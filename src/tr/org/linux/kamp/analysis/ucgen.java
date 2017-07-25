package tr.org.linux.kamp.analysis;

import java.util.Scanner;

public class ucgen {


	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int satir = input.nextInt();

		for(int i=satir; i>=1;i--) {
			for(int j=i;j>=1;j--)
				System.out.print(j+ " ");
			}
		for(int k =2;k<=i;k++) {
			System.out.println(k + " ");
		}
		System.out.println(" ");

		input.close();

	}
}