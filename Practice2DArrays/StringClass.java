// package Practice2DArrays;
import java.util.*;
class StringClass
{
	public static void main(String args[]) // To calculate no of words and characters in a given sentence
	{
		int count=0; // int count; count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence.....!");
		String s=sc.nextLine();
		s=s.trim();
        int chrs = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '){
				count++; // count = count +1;
            }
			// if (s.hasNextLine()==0) { // ?? ==>> to be searched
				
			// }
            if (s.charAt(i)!=' ') {
                chrs++;
            }
		}
		System.out.println("Number of words ="+(count+1));
        System.out.println("Number of characters ="+ chrs); // the code include whitespace ==>> s.length()
		sc.close();
	}
}
