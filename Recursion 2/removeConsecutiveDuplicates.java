
// asked in Cognizant,Paytm,CIS-Cyber Infrastructure,Tech Mahindra,
// SAP Labs,Adobe,Hexaware,Ernst & Young,GoComet,Tavant Tech,
// PureSoftware,Global Logic,HashedIn,Capegemini Consulting india,
// Cvent,AntStack,Unthinkable Solution.
public class removeConsecutiveDuplicates {
    public static String removeConsecutiveDuplicatesHelper(String s, int low ,int high){
		String duplicateRemovedString = "";
		if(low>high){
			//this will check string is empty or not if empty then return empty
			return duplicateRemovedString;
		}else if(low == high){
			//this will check if string has only one char then return this char
			duplicateRemovedString +=s.charAt(low);
			return duplicateRemovedString;
		}else if(s.charAt(low)==s.charAt(low+1)){
			//this the actual checking of the consecutive duplicates
			duplicateRemovedString = "";
		}else{
			duplicateRemovedString +=s.charAt(low);
		}
		duplicateRemovedString += removeConsecutiveDuplicatesHelper(s,low+1,high);
		return duplicateRemovedString;
	}
	public static String removeConsecutiveDuplicate(String s) {
		// Write your code here
       return removeConsecutiveDuplicatesHelper(s,0,s.length()-1);
	}

}