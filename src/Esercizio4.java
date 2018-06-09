import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio4 {

	private static int[] terna = {0,0,0};
	
	public static void main(String[] args) {
			List<Integer> lista = Arrays.asList(2,2,4,6,3,6,3,3,4,5);
			esercizio4(lista);
	}
	
	public static  List<int[]> esercizio4(List<Integer> input){
		return input.stream()
			 .map(s -> formaterna(s))
			 .filter(s -> triangolo(s))
			 .peek(s -> System.out.println(" ("+s[0]+" "+s[1]+ " "+s[2]+")  "))
			 .collect(Collectors.toList());
	}
	public static boolean triangolo(int[] input) {
		return input[0]<input[1]+input[2] && 
			   input[1]<input[0]+input[2] && 
			   input[2]<input[0]+input[1];
	}
	
	public static int[] formaterna(int elem) {
		terna[0] = terna[1];
		terna[1] = terna[2];
		terna[2] = elem;
		return terna.clone();
	}
}
