package problemsolving;

public class Staircase {

	static void staircase(int n) {
		// initialise variables to hold number of hashes, steps & spaces
		int hash=1;
		int space=n-1;
		int steps = 0;	
		// while steps < n
		while(steps<n) {
			// print number of spaces
			for (int i=0; i<space; i++) {
				System.out.print(" ");
			}
			// print number of hashes
			for (int j=0; j < hash; j++) {
				System.out.print("#");
			}
			// increment hash, space & steps. print newline
			hash++; space--; steps++;
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// invoke staircase with test integers
		staircase(6);	
		staircase(50);
	}



}
