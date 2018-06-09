import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio1 {
	
	public static void main(String[] args) {
		List<String> esempio = Arrays.asList("author","auto","autocorrect","begin","big","bigger","biggish");		
		esempio = esercizio1(esempio,"au");
	}
	
	public static List<String> esercizio1(List<String> input,String prefix){
		
		return input.stream()
			 .filter(s -> s.substring(0,prefix.length()).equals(prefix))
			 .peek(s -> System.out.print(" "+s))
			 .collect(Collectors.toList());
		
	}
}
