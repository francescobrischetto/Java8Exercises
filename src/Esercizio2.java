import java.util.Arrays;
import java.util.List;

public class Esercizio2 {

	
	public static void main (String[] args) {
		List<String> esempio = Arrays.asList("to","speek","the","truth","and","pay","your","debts");
		System.out.println(" "+esercizio2(esempio));
	}
	
	public static String esercizio2(List<String> input) {
		return input.stream()
			 .map(s -> s.charAt(0))
			 .map(c -> Character.toString(c))
			 .reduce("" , ( a, b) -> a + b);
	}
}
