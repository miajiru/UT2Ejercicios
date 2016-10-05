import java.util.ArrayList;

public class CalcPrimeNumbersRunnable implements Runnable {
	private int from;
	private int to;

	public CalcPrimeNumbersRunnable(int from, int to) {
		this.from = from;
		this.to= to;
    }
	@Override
	public void run() {
		ArrayList<Integer> lista = (ArrayList<Integer>) PrimeNumbers.primesInRange(from, to);
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}

}
