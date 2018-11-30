package bhanujavainterviewsession;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Test1");
		queue.add("Test2");
		queue.add("Test3");
		queue.add("Test4");
		queue.add("Test5");
		queue.add("Test6");
		
		System.out.println("head: "+queue.element());
		
		System.out.println("head: "+queue.peek());
		
		System.out.println("Iterating the queue elements: ");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println(queue);
		
		

	}

}
