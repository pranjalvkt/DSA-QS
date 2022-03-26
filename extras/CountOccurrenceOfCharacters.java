package extras;

public class CountOccurrenceOfCharacters {
	public static void main(String[] args) {
		String str = "I am a developer";
		str = str.toLowerCase();
		int[] charOccArr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i) - 'a';
			/* we're only looking for alphabets (0 - 26), 
			so, anything other than that will not be counted. */
			if(temp >= 0 && temp <= 26) charOccArr[temp]++; 	
		}
		
		for(int i = 0; i < charOccArr.length; i++) {
			char temp = (char) (i + 'a');
			if(charOccArr[i] > 0) System.out.println(temp + " --> " + charOccArr[i]);
		}
	}
}










