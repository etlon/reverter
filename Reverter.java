
/*
 * @author: etlon
 * @version: 1.0
 * @date (ISO 8601): 2018.10.28
 * 
 */



public class Reverter
{

	public static void main(String[] args)
	{

		StringBuilder sb = new StringBuilder();
		StringBuilder rev = new StringBuilder();
		for(String s : args)
		{
			sb.append(s);
		}
		for(int i = sb.length(); i > 0; i--)
		{
			rev.append(sb.charAt(i - 1));
		}
		System.out.print(rev);
		
		
	}

}
