/* Hai in input una lista di interi positivi, scorrila prendendo tre numeri alla volta a distanza 1. Dire quante di
 * queste terne hanno un elemento pari alla somma degli altri due
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio9 {
	
	private static int[] supp = {0,0,0,0,0};
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		esercizio4inv(l);
	}
	
	public static List<int[]> esercizio4inv(List<Integer> input){
		return input.stream()
				    .map(x -> creaTerna(x))
				    //.peek( x -> System.out.println("Pre-Filtro: ("+x[0]+" "+x[1]+" "+x[2]+") "))
				    .filter(x -> filtro(x))
				    .peek( x -> System.out.println("Post-Filtro: ("+x[0]+" "+x[1]+" "+x[2]+") "))
				    .collect(Collectors.toList());
					
	}
	
	public static int[] creaTerna(int x) {
		supp[0] = supp[1];
		supp[1] = supp[2];
		supp[2] = supp[3];
		supp[3] = supp[4];
		supp[4] = x;
		return new int[] {supp[0],supp[2],supp[4]};
	}
	
	public static boolean filtro(int x[]) {
		return x[0] == x[1]+x[2] ||
			   x[1] == x[0]+x[2] ||
			   x[2] == x[1]+x[0] ;
	}
}
