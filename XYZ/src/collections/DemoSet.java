package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {

		// 1. HashSet, doesn't maintain insertion order
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		set.add(10);
		set.add(2);
		set.add(12);
		System.out.println("Size of the set is "+set.size());
		System.out.println(set.contains(6));
		System.out.println(set.isEmpty());
		//set.clear();
		System.out.println("Size of the set is: "+set.size());
		set.add(12);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();

		System.out.println("-----------------TreeSet---------------");
		
		//2.TreeSet: maintains natural ordering
		Set <String>names = new TreeSet<String>();
		names.add("hi");
		names.add("k");
		names.add("chha");
		names.add("khaber");
		names.add("ram");
		names.add("shyam");
		names.add("mohan");
		Iterator<String> it1 = names.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		System.out.println(names.remove("k"));
		System.out.println(names.contains("ram"));
		
		System.out.println("-----------LinkedHashSet--------------");
		//3. LinkedHashSet: maintains insertion order
		Set <Integer> s = new LinkedHashSet<Integer>();
		s.add(10);
		s.add(9);
		s.add(7);
		s.add(4);
		s.add(2);
		s.add(12);
		s.add(14);
		s.add(12);
		s.add(4);
		s.add(2);
		
		System.out.println("Size of set is: "+s.size());
		System.out.println(s.toString());
		Iterator<Integer> it2 = s.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		
		System.out.println("------------Treeset Integer type------------");
		//3. Integer TreeSet 
		Set <Integer> s1 = new TreeSet<Integer>();
		s1.add(10);
		s1.add(9);
		s1.add(7);
		s1.add(4);
		s1.add(2);
		s1.add(12);
		s1.add(14);
		s1.add(12);
		s1.add(4);
		s1.add(2);
		s1.add(16);
		s1.add(20);
	
		System.out.println("Size of set is: "+s1.size());
		System.out.println(s1.toString());
		Iterator<Integer> it3 = s.iterator();
		while(it3.hasNext()) {
			System.out.print(it3.next()+" ");
		}
		System.out.println();
	}
	

}
