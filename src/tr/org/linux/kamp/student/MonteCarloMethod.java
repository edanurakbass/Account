package tr.org.linux.kamp.student;

import java.util.Random;

public class MonteCarloMethod {
static double x,y;
static Random r = new Random();
static double counter=0 ;

static double icerdekiler=0;
	public static void main(String[] args) {
		while(counter<10000) {
			x = (r.nextDouble()*2)-1;
			y = (r.nextDouble()*2)-1;
			if((x*x)+(y*y)<1) {
				icerdekiler++;
			}
			counter++;
				
		}
	
		double pi = (icerdekiler / counter) *4;
		System.out.println(icerdekiler);
		System.out.println(pi);

}}
