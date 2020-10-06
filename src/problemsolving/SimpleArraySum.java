package problemsolving;

public class SimpleArraySum {
	
	public int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int i =1; i < ar.length; i++) {
			sum+= ar[i];
		}
		return sum;
		
	}


}
