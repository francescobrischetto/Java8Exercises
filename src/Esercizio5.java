import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Esercizio5 {

	private static int old;
	public static void main (String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,8,5,6,7,8,9);
		old=l.get(0);
		boolean res = esercizio5(l);
		if(res)
			System.out.println("L'array è ordinato");
		else
			System.out.println("L'array non è ordinato");
	}
	
	public static boolean esercizio5(List<Integer> input) {
		Optional<Boolean> res = input.stream()
									  .map( x -> ordinato(x) )
									  .filter(x -> !x)
									  .findFirst();
		if(res.isPresent()) return false;
		return true;
	}
	
	public static boolean ordinato(int x) {
		if( x >= old) {
			old=x;
			return true;
		}
		return false;
	}
}
