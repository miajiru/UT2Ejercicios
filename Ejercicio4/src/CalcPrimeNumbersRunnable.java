import java.util.ArrayList;

public  class CalcPrimeNumbersRunnable implements Runnable{

	private int id;
	private int from;
	private int to;
	private Thread previous;

	public CalcPrimeNumbersRunnable(int id, int from, int to, Thread previous) {
		this.id = id;
		this.from = from;
		this.to= to;
		this.previous = previous;
    }
	
	@Override
	public void run() {
		// COMPLETAR AQUÃ� EL EJERCICIO
	}

}
