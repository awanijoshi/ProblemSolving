package CTCIChapOne;

import java.util.Arrays;
import java.util.HashSet;

public class PermutationStrings {

	public static void main(String[] args) {
		String s1 = "brown";
		String s2 = "rnbw";
		boolean result = isPermutation(s1,s2);
		boolean resultHashSet = isPermutation(s1,s2);
		System.out.println(result);
		System.out.println(resultHashSet);
		
	}
	private static boolean isPermutation(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		char [] s1CharArray = s1.toCharArray();
		char [] s2CharArray = s2.toCharArray();
		Arrays.sort(s1CharArray);
		Arrays.sort(s2CharArray);
		String str1 = new String(s1CharArray);
		String str2 = new String(s2CharArray);				
		if(str1.equals(str2))
			return true;
		return false; 
	}
	private static boolean isPermutationHashSet(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		HashSet<Character> hashSet = new HashSet<Character>();
		for(int num=0;num<s1.length();num++)
		{
			if(!hashSet.contains(s1.charAt(num)))
			 hashSet.add(s1.charAt(num));
		}
		for(int num=0;num<s2.length();num++)
		{
			if(!hashSet.contains(s2.charAt(num)))
				return false;
		}
		
		return true;
		
	}
	
}
