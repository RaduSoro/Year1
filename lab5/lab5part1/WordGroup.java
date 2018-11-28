
import java.lang.Object;

public class WordGroup {
	String words = new String();
	
	//contrusctor
	public WordGroup(String input) {
		words = input.toLowerCase();
	}
	
	public String[] getWordArray() {
		String[] aux;
		aux = words.split(" ");
		return aux;
	}
	
	
}
