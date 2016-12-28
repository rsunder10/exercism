import java.util.HashMap;
import java.util.Map;

public class DNA {
  Map<Character, Integer> dna = new HashMap<>();

  public DNA(String s) {
    dna.put('A', 0);
    dna.put('G', 0);
    dna.put('C', 0);
    dna.put('T', 0);
    for (Character eachdna : s.toCharArray()) {
      int prevcount = dna.get(eachdna);
      dna.put(eachdna, prevcount + 1);
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