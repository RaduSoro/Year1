import java.util.HashMap;
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
		
		HashSet<String> hSet = new HashSet<String>();  //creates a new instance of a HashMap type <String>
			for(String index : this.getWordArray()) {
				hSet.add(index);
				
				//System.out.println(hSet[index]);
			}
		
			for(String index : aux.getWordArray()) {
				hSet.add(index);
			}
		return hSet;
	}
	
	
	public HashMap<String, Integer> getWordCounts(){
		HashMap<String, Integer> hMap= new HashMap<String, Integer>(); //creates a new HashMap called hMap with the args string and integer
		//int i=1;
		
			for(String index : this.getWordArray()) {
				if(hMap.containsKey(index))
					hMap.put(index, hMap.get(index)+1);
				else
					hMap.put(index, 1);
			}
		return hMap;
	}
}
