import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class PrimeNumbersInRange {

	private static ArrayList<Thread> threads = new ArrayList<Thread>(); 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el rango de numeros a comprobar:");
		String rangoNum = bfr.readLine();
		StringTokenizer tkn = new StringTokenizer(rangoNum," ");
		//Recogemos el rango de números a recorrer
		int num1 = Integer.parseInt(tkn.nextToken());
		int num2 = Integer.parseInt(tkn.nextToken());
		
		System.out.println("Introduzca el número de threads");
		int thrs = Integer.parseInt(bfr.readLine());//Num de threads a lanzar
		int rangoThreads = (int)Math.floor(num2 / thrs);//Números que recorrera cada thread
		num2 = rangoThreads;//Limite del primer rango de numeros
		
		Thread t = null;
		for(int id = 1; id <= thrs; id++){ //Instanciamos cada thread
			Runnable r = new CalcPrimeNumbersRunnable(id,num1,num2,t);
			t = new Thread(r);
			threads.add(t);
			num1 = num2 + 1; //Elemento inferior del sig rango
			num2 += rangoThreads;//Elemento sup del sig rango
		}
		
		for(int j = 0; j < threads.size(); j++){//Lanzamos los threads
			threads.get(j).start();
			try{
				threads.get(j).join();
			}catch(InterruptedException e){
				System.out.println("Thread interrumpido...");
			}
			
		}
		
	}

}
