import java.util.HashMap;
import java.util.Map;

public class WordCount {

  public Map<String, Integer> wordCount = new HashMap<>();

  public Map<String, Integer> phrase(String word) {
    word = word.replaceAll("[^A-Za-z0-9]", " ").replaceAll("\\s+"," ");
    for(String eachWord : word.split("\\s")){
      wordCount.putIfAbsent(eachWord.toLowerCase(), 0);
      int incrementOldCount = wordCount.get(eachWord.toLowerCase())+1;
      wordCount.put(eachWord.toLowerCase(),incrementOldCount);
    }
    return wordCount;
  }
}
