import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		int number;
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers: ");
		number = sc.nextInt();
		while(number > 0)
		{
			list.add( (Integer)sc.nextInt());
			number --;
		}
		Collections.sort(list);
		
		boolean repeated = false;
		int cnt = 0;
		for( int i= 0; i < list.size() - 1; i++)
		{
			if(!repeated)
			{
				if(list.get(i).equals(list.get(i + 1)))
				{
					cnt ++;
					System.out.println(cnt + "- " + list.get(i) );
					repeated = true;
				}
			}
			else if( !list.get(i).equals(list.get(i + 1)))
				repeated = false;
		}
		if( cnt == 0)
		{
			System.out.println("None.");

		}
		
		
	}

}
