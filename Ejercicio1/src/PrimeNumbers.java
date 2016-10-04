import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers {
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static ArrayList<Integer> primesInRange(Integer from, Integer to) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (Integer num=from; num<to; num++) {
			if (isPrime(num)) {
				primes.add(new Integer(num));
			}
		}
		
		return primes;
	}
}
