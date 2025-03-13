 import java.util.LinkedHashMap;

public class extractUniqueCharacter {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedHashMap<Character,Boolean> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, true); // Mark the character as seen
            }
        }
		StringBuilder result = new StringBuilder();
		for(char c:map.keySet()){
			result.append(c);
		}
		return result.toString();
	}
}
