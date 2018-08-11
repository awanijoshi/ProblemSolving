package CTCIChapOne;

import java.util.HashMap;

public class CompressedString {

	public static void main(String[] args) {
		String s = "aaabbccaaaddb";
		isCompressed(s);
	}
	private static boolean isCompressed(String input)
	{
		char [] inputArray = input.toCharArray();
		int j=0,count=1;
		String result = "";
		for(int i=0;i<inputArray.length;i++)
		{
			char temp = inputArray[i];
			j=i+1;
			result=result + temp;
			while(j<inputArray.length && temp==inputArray[j] )
			{
				j++;
				count++;
			}
			result=result + count;
			i=j-1;
			count=1;
		}
		System.out.println(result);
		
		return false;
	}

}
