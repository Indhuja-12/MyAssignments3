package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumberSet {

	public static void main(String[] args) 
	{
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(4);
		System.out.println(set);
		int i=1;
		for (Integer number : set) 
		{
			if(number!=i)
			{
				
				break;
			}
			i++;
		}
		System.out.println();
		}



	}

}
