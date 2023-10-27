package bo;

import java.util.HashMap;
import java.util.Map;

public class AAAAA {
 public static void main(String[] args) {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("result","1");
	map.put("key", "2");
	System.out.println(map.toString());
	System.out.println(map.get("result"));
  }
}
