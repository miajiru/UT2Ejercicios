import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PrimeNumbersInRange {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Introduce 2 números separados por espacio");
		String limite = teclado.readLine();
		StringTokenizer tkn = new StringTokenizer(limite," ");
		Integer num1 = Integer.parseInt(tkn.nextToken());
		Integer num2 = Integer.parseInt(tkn.nextToken());
		
		Thread thr = new CalcPrimeNumbersThread(num1,num2);
		thr.start();
		try{
			thr.join();
		}catch(InterruptedException e){
			System.out.println("Thread interrumpido...");
		}
		

	}

}
