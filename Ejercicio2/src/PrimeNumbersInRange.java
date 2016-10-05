import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumbersInRange {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Introduce 2 números separados por espaciosss");
		String limite = teclado.readLine();
		StringTokenizer tkn = new StringTokenizer(limite," ");
		int num1 = Integer.parseInt(tkn.nextToken());
		int num2 = Integer.parseInt(tkn.nextToken());
		
		Runnable r = new CalcPrimeNumbersRunnable(num1,num2);
		Thread t = new Thread(r);
		t.start();
		
		try{
			t.join();
		}catch(InterruptedException e){
			System.out.println("Thread interrumpido...");
		}

	}

}
