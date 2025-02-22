
public class removeXFromString  {
    public static String removeXHelper(String s,int low,int high){
		String xRemovedString="";
		if(low>high){
			return "";
		}else if(low == high){
			if(s.charAt(low) == 'x'){
				return  "";
			}else{
				xRemovedString += s.charAt(low);
				return xRemovedString;
			}
		}else if(s.charAt(low) == 'x'){
				xRemovedString = "";
			}else{
				xRemovedString += s.charAt(low);
			}
		xRemovedString += removeXHelper(s, low+1, high);
		return xRemovedString;
	}
	// Return the changed string
	public static String removeX(String s){
		// Write your code here
		return removeXHelper(s, 0, s.length()-1);
	}
}
