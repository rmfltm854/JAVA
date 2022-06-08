package JAVA;
import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		/*Map*/
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	//HashMap<String, int> map = new HashMap<String, int>();//Error
	map.put("one", 1);
	map.put("two", 2);
	System.out.println(map.get("one"));
	System.out.println(map.get("three"));//null
	//System.out.println(map.containsKey("three"));
	//System.out.println(map.remove("one"));
	//System.out.println(map.get("one"));
	//System.out.println(map.size());
	}

}
