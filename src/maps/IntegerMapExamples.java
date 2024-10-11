package maps;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class IntegerMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(5, "john");
		map.put(6, "Jane");
		map.put(7, "Mike");
		map.put(8, "Lily");
		map.put(9, "Pete");
		
		map.put(9, "Robert"); // replace the existing key with the new one
		
		map.put(10, "Mike"); // Duplicate values are allowed 
		map.put(1, "Carlos");
		map.put(2, "Hrithik");

		
		System.out.println(map);
		System.out.println();
		System.out.println(map.size());
		
		System.out.println(map.get(8)); // returns lily
		System.out.println(map.get(28)); // returns null if key doesn't exist
		
		map.remove(9);
		System.out.println(map);
		map.clear();
		
		
		System.out.println("Cleared map =" + map);
		

		for (Integer key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			
		}
		
//		for (Map.Entry<Integer, String>) entry: map. entrySet() {{
//			System.out.println("Running..");
//		}
		
		Iterator<Integer> ite = map.keySet().iterator();
		
		while (ite.hasNext()) {
			Integer key = ite.next();
			System.out.println(key + " ");
		}
	}

}
