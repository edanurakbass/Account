package tr.org.linux.kamp.arrays;


public class CarpimTablosu {

	public static int[][] intialize(int n){
		int[][]matrices = new int[n][n];
		
		
		for (int j=0; j<matrices.length;j++) {
			for(int k =0; k<matrices[j].length;k++) {
				matrices[j][k] = (j+1)*(k+1);
			}
		}
		return matrices;
	}
	public static void arrayToPrint(int[][] matrices) {
		for(int j=0;j<matrices.length;j++) {
			for(int k=0; k<matrices[j].length;k++) {
				System.out.print(matrices[j][k] + "\t");
			}
			System.out.println();
		}}
		public static void main(String[] args) {
			arrayToPrint(intialize(5));
		}
	}

