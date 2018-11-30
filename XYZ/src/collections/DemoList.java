package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class DemoList {
	public static void main(String[] args) {

		// creating and using LinkedList
		List<String> list = new LinkedList<String>();
		list.add(0, "hello");
		list.add("hi");
		list.add("hey");
		list.add("good");
		list.add("morning");
		list.add("see you");
		list.add("ram");
		list.add("bhuvan");

		System.out.println("size of the linkedList: " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.remove(1));
		System.out.println(list.remove(3));
		System.out.println(list.indexOf("ram"));
		System.out.println(list.isEmpty());
		System.out.println(list.contains("bhuvan"));
		System.out.println(list.toString());

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();

		// -----------------------------------------------------------

		// creating and using arrayList

		List<Integer> array = new ArrayList<Integer>();
		array.add(0, 2);
		array.add(1, 4);
		array.add(2, 10);
		array.add(3, 12);
		array.add(4, 15);
		array.add(5, 16);
		array.add(18);
		array.add(20);

		System.out.println("size is:" + array.size());
		System.out.println(array.indexOf(16));
		System.out.println(array.indexOf(20));
		System.out.println(array.get(4));
		System.out.println(array.contains(10));
		System.out.println(array.contains(7));
		System.out.println(array.isEmpty());
		System.out.println(array.remove(0));

		Iterator<Integer> it1 = array.iterator();
		while (it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println("---------------------");

		ListIterator<Integer> it2 = array.listIterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + "  ");
		}
		System.out.println();
		while (it2.hasPrevious()) {
			System.out.print(it2.previous() + " ");
		}
		System.out.println("------------------------"); 
		// -------------------------------------
		// creating vector
		List<String> vec = new Vector<String>();
		vec.add("ab");
		vec.add("cd");
		vec.add("ef");
		vec.add("gh");
		vec.add("ij");
		vec.add("kl");
		vec.add("xy");
		vec.add("pq");
		vec.add("rs");
		System.out.println("The size of vector is " + vec.size());
		System.out.println(vec.get(0));
		System.out.println(vec.isEmpty());
		System.out.println(vec.remove(1));
		System.out.println(vec.contains("ab"));
		System.out.println(vec.subList(2, 6));
		System.out.println(vec.set(0,"abcde"));

		Iterator<String> it3 = vec.iterator();
		while(it3.hasNext()) {
			System.out.print(it3.next()+" ");
		}
		System.out.println("----------------------");
		
		
	}

}
