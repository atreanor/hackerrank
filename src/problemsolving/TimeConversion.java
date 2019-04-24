package problemsolving;

import java.lang.StringBuilder;

/**
 * 
 * @author alan treanor
 * TimeConversion class holds one method to solve hackerrank problem
 */
public class TimeConversion {

	/**
	 * timeConversion method translates 12 hour time to 24 hour time
	 * @param str	in format hh:mm:ssAM or PM
	 * @return		a string with 24 hour format, eg. 09:30:15PM becomes 21:30:15
	 */
	static String timeConversion(String str) {
		
		// initialise String & Integer variables to help with conversions 
		String hold; String timeCon =""; int newHour;
		
		// trim white spaces from String
		str = str.trim();

		// create substring from position[8]-[10], which should be "AM" or "PM"
		hold = str.substring(8, 10);

		// create new StringBuilder object to manipulate string
		StringBuilder sb = new StringBuilder("");
		
		// if "AM" append substring[0] - [8] to timeCon, else if "PM" add 12 to hours & apend to timeCon
		if (hold.equals("AM")) {
			newHour = Integer.parseInt(str.substring(0, 2));
			if (newHour == 12) {
				sb.append("00");
				sb.append(str.substring(2, 8));
			} else {
				sb.append(str.substring(0, 8));
			}
			//sb.append(str.substring(2, 8));
			timeCon = sb.toString();

		} else if (hold.equals("PM")) {
			newHour = Integer.parseInt(str.substring(0, 2));
			if (newHour == 12) {
				sb.append(str.substring(0, 8));		
			} else if (newHour + 12 == 24) { 
				sb.append("00");
				sb.append(str.substring(2, 8));
			} else {
				sb.append(newHour + 12);
				sb.append(str.substring(2, 8));
			}
			//sb.append(str.substring(2, 8));
			timeCon = sb.toString();
		}
		// return & print result to console
		System.out.println(timeCon);
		return timeCon;
	}


	public static void main(String [] args) {
		// entry point to test timeConversion()
		String test1 = "12:05:45PM";
		String test2 = "06:40:22AM";
		String test3 = "12:45:54PM";
		// invoke method passing test strings
		timeConversion(test1);
		timeConversion(test2);
		timeConversion(test3);
	}
}
