import java.util.ArrayList;

public class CalcPrimeNumbersThread extends Thread {
	private Integer num1;
	private Integer num2;
	
	public CalcPrimeNumbersThread(Integer n1,Integer n2){
		this.num1 = n1;
		this.num2 = n2; 
	}
	
	@Override
	public void run(){
		
		ArrayList<Integer> lista = PrimeNumbers.primesInRange(this.num1, this.num2);
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}
}
