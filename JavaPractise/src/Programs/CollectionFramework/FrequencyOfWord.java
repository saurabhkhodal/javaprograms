package Programs.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {

	public static void main(String[] args) {
		
		String sentence = "Java is easy and Java is fun";
		Map <String, Integer> map = new HashMap<>();
		
		String[]words =sentence.split(" ");
		for(int i=0; i<words.length; i++) {
			if(words[i].contains(sentence));
			map.put(words[i], i);
		}
		System.out.println(map.keySet());
		
		
	
	}

}
