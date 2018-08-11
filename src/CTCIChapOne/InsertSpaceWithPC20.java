package CTCIChapOne;

public class InsertSpaceWithPC20 {

	public static void main(String[] args) {
		String S1 = "Mr John Smith";
		char [] charArray = new char[S1.length() + 3*2-2];
		for(int i = 0;i<S1.length();i++)
		{
			charArray[i]=S1.charAt(i);
		}
		System.out.println(charArray);
		ReplaceSpace(charArray,S1.length());
		
	}
	private static void ReplaceSpace(char [] input, int length)
	{
		int totalCount = input.length;
		for(int i = totalCount-1;i>0 && length>0;i--)
		{
			if(input[length-1]!=' ')
			{
				input[i]=input[length-1];
				length--;
			}
			else 
			{
				input[i]='0';
				input[i-1]='2';
				input[i-2]='%';
				i=i-2;
				length--;
				
			}
		}
		
	System.out.println(input);	
	}
	
}
