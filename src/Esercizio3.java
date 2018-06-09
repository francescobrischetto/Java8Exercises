import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio3 {

	public static void main(String[] args) {
		List<int []> terne = Arrays.asList(new int[] {2,2,3} ,
				new int[] {3,2,3} , new int[] {3,3,3} , new int[] {3,4,5} , new int[] {5,2,3} );
		esercizio3(terne);
	}
	
	public static List<Integer> esercizio3(List<int[]> input){
		return input.stream()
			 .filter(s -> triangolo(s))
			 .map(s -> s[0]+s[1]+s[2])
			 .peek(s -> System.out.print(" "+s))
			 .collect(Collectors.toList());
	}
	
	public static boolean triangolo(int[] input) {
		return input[0]<input[1]+input[2] && 
			   input[1]<input[0]+input[2] && 
			   input[2]<input[0]+input[1];
	}
}
