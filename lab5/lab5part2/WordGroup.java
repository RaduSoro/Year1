import java.util.HashSet;

public class WordGroup {
	String words = new String();
	
	
	//contrusctor
	public WordGroup(String input) {
		words = input.toLowerCase();
	}
	
	//transtalets the current string instantation to an string array
	public String[] getWordArray() {
		String[] aux;
		aux = words.split(" ");
		return aux;
	}
	
	public HashSet<String> getWordSet(WordGroup aux) {
		
		HashSet<String> map = new HashSet<String>();  //creates a new instance of a HashMap type <String>
		for(String index : this.getWordArray()) {
			map.add(index);
		}
		
		for(String index : aux.getWordArray()) {
			map.add(index);
		}
			
		return map;
	}
}
