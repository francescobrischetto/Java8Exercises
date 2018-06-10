/* Dato uno stream delle prime k potenze di due, ritornare la somma delle sue componenti la quale ultima cifra è 8.
 * Il programma deve funzionare per ogni intero k.
 */
import java.util.stream.Stream;

public class Esercizio10 {

	
	public static void main(String[] args) {
		int k=16;
		int cifra=8;
		int out = esercizio5inv(k,cifra);
		System.out.println("La somma delle prime "+k+" potenze di due la cui ultima cifra è "+cifra+" è: "+out);
	}
	
	public static int esercizio5inv(int k, int cifra) {
		if(cifra>9 || cifra <0) return -1;
		
		return Stream.iterate(1, x -> x*2)
			  .limit(k)
			  .filter(x -> (x%10) == cifra)
			  .mapToInt(x->x)
			  .sum();
			  
	}
}
