package interviewPreparationKit;
import java.util.HashMap;
import java.util.Map;
public class SockMerchantDict {
	
	public static int sockMerchantDict(int n, int[] arr) {
		int pairs = 0;
		Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
		for (int i : arr) {
			Entry<object, object> m = getEntry(i);
			if (m == null) {
				dict.put(i, 1);
			}
			else {
				int holder = i + 1;
				dict.put(i, holder);
			}
		}
		return pairs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
