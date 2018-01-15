import static java.lang.System.out;
import java.util.*;

class Entry{
	
	static ArrayList<Integer> primes = new ArrayList<Integer>();  
	
	static boolean isPrime(int num)
	{		
		ListIterator<Integer> itr = primes.listIterator();  
		
		while (itr.hasNext())
		{
			if (num % itr.next() == 0)
				return false;			
		}
		primes.add(num);
		return true;
	}
	
	static void displaySeries(int count)
	{
		int num = 2;
		while (count > 0)
		{
			if (isPrime(num))
			{
				System.out.print(num + " ");
				--count;
			}
			++num;
		}
	}
	// method
	public static void main(String args[]){
		displaySeries(100);
	}
	
	

}

//D:\training\10012018-JAVA\code\src