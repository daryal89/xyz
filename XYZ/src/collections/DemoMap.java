package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
		// Hashmap: can contain one null key and multiple null values
		// Cannot contain duplicate key value but can have duplicate values
		//It doesn't maintains the insertion order
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Ramesh");
		hm.put(1, "Mahesh");
		hm.put(4, "Rupak");
		hm.put(6, "rohan");
		hm.replace(1, "Hari");
		hm.put(3, "Rupak");
		hm.put(7, null);
		hm.put(null, null);
		hm.put(9, null);
		hm.put(null, "rupak");
		hm.put(10, "karan");
		System.out.println(hm.toString());
		System.out.println("size of Hashmap: " + hm.size());
		hm.remove(0);
		System.out.println(hm.isEmpty());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsValue("Karan"));

		System.out.println("------LinkedHashMap-----------");
		//2. linkedHashMap: maintains the insertion order
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(0, "Ramesh");
		m.put(1, "Mahesh");
		m.put(4, "Rupak");
		m.put(6, "rohan");
		m.replace(1, "Hari");
		m.put(3, "Rupak");
		m.put(7, null);
		m.put(null, null);
		m.put(9, null);
		m.put(null, "rupak");
		m.put(10, "karan");
		System.out.println(m.toString());
		System.out.println("size of Hashmap: " + m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.containsKey(10));
		System.out.println(m.containsValue("Karan"));
		
		System.out.println("------------TreeMapDemo-----------------");
		//3. TreeMap: it maintains the key in natural order
		Map<Integer, Integer>tm = new TreeMap<Integer, Integer>();
		tm.put(0,10);
		tm.put(3,20);
		tm.put(5,30);
		tm.put(7,40);
		tm.put(9,50);
		tm.put(2,60);
		tm.put(1,70);
		tm.put(4,80);
		tm.put(6,90);
		tm.put(8,100);
		tm.put(8,102);
		tm.put(7,103);  
		
		System.out.println("The size of the treeMap is: "+tm.size());
		System.out.println("The Treemap is Empty: "+tm.isEmpty());
		System.out.println(tm.toString());
		System.out.println("Keyset: "+tm.keySet());
		System.out.println("values: "+tm.values());
		
		System.out.println("-------------Hashtable Example---------------");
		//4. Hashtable demo example
		//It can't have any null key or value.
		//It is thread safe
		
		Map <Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "mohan");
		ht.put(8, "shilpa");
		ht.put(6,"mahima");
		ht.put(4, "kirpa");
		ht.put(2,"prabal");
		ht.put(0,"manish");
		ht.put(1,"pragya");
		ht.put(3,"sonal");
		//ht.put(null,"gita");
		//ht.put(5, null);
		//ht.put(7, null);
		//ht.put(null,"pralash");
		System.out.println(ht.containsKey(1));
		System.out.println(ht.containsValue("shilpa"));
		System.out.println(ht.size());
		System.out.println(ht.isEmpty());
		System.out.println(ht.values());
		System.out.println(ht.keySet());
		System.out.println(ht);
		
		
	}

}
