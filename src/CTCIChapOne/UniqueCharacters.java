package CTCIChapOne;
import java.util.Arrays;

public class UniqueCharacters {

	public static void main(String[] args) {

		String s1 = "abcdeff";
		boolean result = isUnique(s1);
		System.out.println(result);
	}
	
	private static boolean isUnique(String input)
	{
		boolean result = false;
		char [] inputChar = input.toCharArray();
		Arrays.sort(inputChar);
		for(int num = 0;num<inputChar.length-1;num++)
		{
			if(inputChar[num]==inputChar[num+1])
			{
				result=true;
				return result;
			}	
		}		
		return result;
	}

}
