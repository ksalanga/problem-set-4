/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		System.out.println(ps.surroundMe("<<>>", "joy"));
		System.out.println(ps.endsMeet("joy", 1));
		System.out.println(ps.middleMan("Candy"));
		System.out.println(ps.doubleVision("asdaa"));
		System.out.println(ps.centered("candy", "and"));
		System.out.println(ps.upOrDown(12, 'c'));
		System.out.println(ps.countMe("and some more sample words", '+'));
		System.out.println(ps.isNotEqual("is not is not is"));
		System.out.println(ps.triplets("abbbccccd"));
		System.out.println(ps.addMe("a123b456c789", true));
	}
	
	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	public String surroundMe(String out, String in) {
		if (out != null && in != null) {
			if (out.length() == 4 && in.length() == 3) {
				return out.substring(0, 2) + in + out.substring(2);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no==================== greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	public String endsMeet(String str, int n) {
		if (str != null) {
			if ((str.length() >= 1 && str.length() <= 10) && (n > 0 && n <= str.length())) {
				return str.substring(0, n) + str.substring(str.length() - n);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	public String middleMan(String str) {
		if (str != null) {
			if (str.length() % 2 != 0) {
				return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	public String doubleVision(String str) {
		if (str != null) {
			String vision = new String();
			
			for (int i = 0; i < str.length(); i++) {
				vision += (str.substring(i, i + 1) + str.substring(i, i + 1));
				}
			
			if (str.length() >= 1) {
				return vision;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */
	
	public Boolean centered(String str, String target) {
		if (target == null || str == null || target.length() != 3) {
			return false;
		}
		
		double middle = str.length() / 2.0;
		
		if (middle == (int) middle) {
			return str.substring((int) middle - 2, (int) middle + 1).equals(target) || str.substring( (int) middle - 1, (int) middle + 2).equals(target);
		}
		else {
			return str.substring((int) middle - 1, (int) middle + 2).equals(target);
		}
	}
	
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	public Integer upOrDown(double n, char c) {
		int number;
		
		switch (c) {
		case 'r':
			number = (int)Math.round(n);
			break;
		case 'f':
			number = (int)Math.floor(n);
			break;
		case 'c':
			number = (int)Math.ceil(n);
			break;
		default:
			number = -1;
			break;
		}
		
		return number;
	}
	
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	public Integer countMe(String text, char end) {
		if (text != null && Character.isLetter(end)) {
			int count = 0;
			String endCheck;
			
			for (int i = 0; i < text.length() - 1; i++) {
				if (!Character.isAlphabetic(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
					return -1;
				}

				endCheck = text.substring(i, i+2);
				
				if (Character.isWhitespace(endCheck.charAt(1)) && endCheck.charAt(0) == end) {
					count++;
				}
			}

			if (!Character.isAlphabetic(text.charAt(text.length() - 1)) && !Character.isWhitespace(text.charAt(text.length() - 1))) {
				return -1;
			}
			else if (text.charAt(text.length() - 1) == end) {
				count++;
			}
			
			return count;
		}
		else {
			return -1;
		}
		
	}
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	public Boolean isNotEqual(String str) {
		int isCheck = 0;
		int notCheck = 0; 
		
		if (str == null) {
			return false;
		}
		
		if (str.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				isCheck++;
			}
			else if (i < str.length() - 2) {
				if (str.substring(i, i + 3).equals("not")) {
					notCheck++;
				}
			}
		}
		
		if (isCheck == notCheck) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	
	public int triplets(String str) {
		if (str == null) {
			return -1;
		}
		
		int count = 0;
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifcations are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	public int addMe(String str, boolean digits) {
		int sum = 0;
		
		if (str == null) {
			return -1;
		}
		
		if (digits) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					sum += Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else { 
			int check = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					check *= 10;
					check += Character.getNumericValue(str.charAt(i));;
				}
				else if (!Character.isAlphabetic(str.charAt(i))) {
					return -1;
				}
				else {
					sum += check;
					check = 0;
				}
			}
			
			sum += check;
		}
		
		return sum;
	}
}