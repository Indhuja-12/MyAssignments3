package week4.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords
{

	public static void main(String[] args) 
	{
		String text="We learn java basics as part of java sessions in java week1";
		Set<Character>Set=new TreeSet<Character>();
		
		/*for (int i = 0; i <text.length(); i++) 
		{
		Set.add(text.charAt(i));
		}*/
		for(Character c:Set)
		{
			System.out.print(c.toString());
		}
		
		System.out.println(Set.remove(java));
	}

}
