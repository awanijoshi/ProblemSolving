package CTCIChapOne;
import java.util.*;
public class LongestNonRepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestNonRepeatingSubstring m1 = new LongestNonRepeatingSubstring();
		int len = m1.lengthOfLongestSubstring("dvdf");
		System.out.println("Length is... "+ len);
		

	}
	public int lengthOfLongestSubstring(String s) {
        HashSet hs = new HashSet();
        String temp="";
        String result="";
        for(int i = 0; i< s.length(); i++){
            
            if(!hs.contains(s.charAt(i)))
            {
                hs.add(s.charAt(i));
                result = result + (Character.toString(s.charAt(i)));
            }
            else
            {   
                hs.clear();
                hs.add(s.charAt(i));
                if(result.length()>=temp.length()){
                    temp=result;
                    result="";
                    result = result + (Character.toString(s.charAt(i)));
                }
                else{
                    result="";
                }                                               
            }
        }
        if(temp.length()<result.length())
        	temp=result;
        System.out.println(temp);
        return (temp.length());        
         
    }
}

