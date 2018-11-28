

import java.util.HashMap;
import java.util.HashSet;
//import java.util.Set;

public class Main{
	public static void main(String args[]){
		WordGroup word1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup word2 = new WordGroup("When you play play hard when you work dont play at all");
		HashSet<String> aux1;
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		String a[] = null , b[]=null;
		a = word1.getWordArray();
		b = word2.getWordArray();
		
		for(String index : a)
			System.out.println(index);


		for(String index : b)
			System.out.println(index);
		
		
		aux1 = word1.getWordSet(word2);
		
		for(String index : aux1) {
			System.out.println(index);
		}
	
		
			
		
		//word counts from word1
		for(String index : word1.getWordCounts().keySet()) {
			int k = word1.getWordCounts().get(index);
			System.out.println(index +":" +  " "+ k);
		}
		
		//gets the wordcounts from word2
		for(String index : word2.getWordCounts().keySet()) {
			int k = word2.getWordCounts().get(index);
			System.out.println(index +":" +  " "+ k);
		}
		
		//makes a map3 with the words in map1 and adds the index to any existing words from map2
		map3.putAll(word1.getWordCounts());
		for(String index : word2.getWordCounts().keySet()) {
			int k = word2.getWordCounts().get(index);  //numbers of apparitions of a word
				if(map3.containsKey(index)) {
					map3.put(index, (map3.get(index)+k));
					}
				else
					map3.put(index, 1);
					
		}
	
		//prints the map 3 with the updated keywords
		for(String index : map3.keySet()) {
			int k = map3.get(index);
			System.out.println(index +":" +  " "+ k);
		}
	
	
		
	}
}

