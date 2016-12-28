import java.util.*;

public class Etl {
  private Map<String,Integer> newStorage = new HashMap<>();

  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    for (Map.Entry<Integer, List<String>> entry : old.entrySet())
    {
      Integer key = entry.getKey();
      List<String> value = entry.getValue();
      for(String each : value){
        newStorage.put(each.toLowerCase(),key);
      }
    }

    return newStorage;
  }
}
