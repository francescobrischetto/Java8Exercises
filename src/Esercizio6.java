import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Data una lista di interi prenderli a terne contigue e dire quali sono pitagoriche */



public class Esercizio6 {

	private static int[] terna = {0,0,0};
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(3,3,4,5,6,8,10);
		esercizio1inv(input);
		
	}
	
	public static List<int[]> esercizio1inv(List<Integer> input){
			
			return input.stream()
						.map( x-> creaTerna(x))
						.filter( x -> controllaPitagorica(x))
						.peek( s -> System.out.println(" ("+s[0]+" "+s[1]+" "+s[2]+") "))
						.collect(Collectors.toList());
	}
	
	public static int[] creaTerna(int x){
		terna[0] = terna[1];
		terna[1] = terna[2];
		terna[2] = x;
		return terna.clone();
	}
	
	public static boolean controllaPitagorica(int[] x) {
		
		return  (Math.pow(x[0],2) == Math.pow(x[1],2) + Math.pow(x[2],2) ||
				Math.pow(x[1],2) == Math.pow(x[0],2) + Math.pow(x[2],2) ||
				Math.pow(x[2],2) == Math.pow(x[1],2) + Math.pow(x[0],2) )
				&& x[0]!=0 && x[1]!=0 && x[2]!=0;
	}
}
