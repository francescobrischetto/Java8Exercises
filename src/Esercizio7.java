/* Data una lista di strighe, utilizzando gli stream, ottenere una lista derivata
 * tale che l'i-esima stringa è una stringa di lunghezza pari alla media fra la lunghezza della stringa
 * considerata e la sua precedente (se esiste), ed i caratteri all'interno sono dati concatenando in maniera
 * alternata i caratteri della stringa e della precedente, fino a riempirla per la lunghezza calcolata, solo
 * se la differenza fra le lunghezze delle stringhe è minore di 5. Gestire i casi limite
 * riportando le stringhe affette senza modifiche.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio7 {

	private static String precedente ="";
	
	public static void main(String[] args) {
		List<String> l = Arrays.asList("You","Just","Get","Tramontato");
		esercizio2inv(l);
		
	}
	
	public static List<String> esercizio2inv(List<String> input){
		
		return input.stream()
					.map( x-> effettuaControlli(x))
					.peek(s -> System.out.println(" "+s))
					.collect(Collectors.toList());
	}
	
	public static String effettuaControlli(String x) {
			int diff = x.length() - precedente.length();
			if(precedente.equals("")){
				precedente = x;
				return x;
			}else if(Math.abs(diff)<5) {
				int media = (x.length() +  precedente.length() )/2;
				String res="";
				for(int i=0;i<media;i++) {
					if(i%2==0)	{
						if(i<x.length())
							res+=x.charAt(i);
						else
							res+=precedente.charAt(i);
					}
					else {
						if(i<precedente.length())
							res+=precedente.charAt(i);
						else
							res+=x.charAt(i);
					}
				}
				precedente = x;
				return res;
			}else {
				precedente = x;
				return x;
			}
	}
}
