/**
 * Version 3 of string hasher which hash string into integer.
 * 
 * @author Chun-Wei Chen
 * @version CSE 332 02/19/13
 */
public class StringHasher3 implements Hasher<String> {
	
	/**
	 * Hash the passed in string into integer value.
	 * 
	 * @param s a string
	 * @return key value/hash code of the string passed in
	 */
	public int hash(String s) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++)
			sum += s.charAt(i) * (i + 1);
		return sum;
	}
}
