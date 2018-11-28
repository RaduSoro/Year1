import java.util.HashSet;

public class Main{
	public static void main(String args[]){
		WordGroup word1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup word2 = new WordGroup("When you play play hard when you work dont play at all");
		HashSet<String> aux1;
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
			
	}
		
}

