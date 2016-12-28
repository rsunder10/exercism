import java.util.HashMap;
import java.util.Map;

public class DNA {
  Map<Character, Integer> dna = new HashMap<>();

  public DNA(String s) {
    dna.put('A', 0);
    dna.put('G', 0);
    dna.put('C', 0);
    dna.put('T', 0);
    for (Character eachDna : s.toCharArray()) {
      int oldCount = dna.get(eachDna);
      dna.put(eachDna, oldCount + 1);
    }
  }

  public Map<Character, Integer> nucleotideCounts() {
    return dna;
  }

  public int count(char a)  {
    if(dna.get(a)==null) {
      throw new IllegalArgumentException();
    }
    return dna.get(a);
  }
}