/* Dato un array di Stringhe di lunghezza 8, controllare se i caratteri nelle posizioni pari (partendo da 0) sono ordinati globalmente.
 * In caso affermativo restituire la stringa costituita dalla concatenazione di tutti questi caratteri.
 */
import java.util.Arrays;
import java.util.List;

public class Esercizio8 {
	
	private static String precedente="";
	private static boolean t=true;
	public static void main(String[] args) {
		/*List<String> l = Arrays.asList("abcdefgh","Francesc","Tramonta","Barbaner","Miliciii","Scapella");
		System.out.println("Stringa di output: "+esercizio3inv(l));*/
		List<String> l1 = Arrays.asList("aaaaaaaa","bbbbbbbb","cccccccc","dddddddd","eeeeeeee","gggggggg");
		System.out.println("Stringa di output: "+esercizio3inv(l1));
	}
	
	public static String esercizio3inv(List<String> input) {
		String out = input.stream()
			 .map( x -> indicipari(x))
			 .map( x -> ordinati(x))
			 .reduce("",(x,y) -> x+y);
		if(t)	return out;
		return "";
	}
	
	public static String indicipari(String x) {
		String out="";
		for(int i=0;i<x.length();i++)
			if(i%2==0) out+=x.charAt(i);
		return out;
	}
	
	public static String ordinati(String x) {
			if(x.compareTo( precedente)<0) {
				t=false;
			}
			precedente=x;
			return x;
	}
}
