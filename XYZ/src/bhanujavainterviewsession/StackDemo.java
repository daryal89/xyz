package bhanujavainterviewsession;

import java.util.Stack;

import javax.sound.midi.Soundbank;

public class StackDemo {

	//stack methods are push, pop, peek, empty, search
	public static void main(String[] args) {
		Stack <Integer>stack = new Stack<>();
		System.out.println("Empty stack: "+stack);
		System.out.println("Empty stack is:"+stack.isEmpty());
		
		stack.push(1001);
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);
		stack.push(1000);
		stack.push(1005); 
		
		System.out.println("Non-empty stack: "+stack);
		System.out.println("Non-empty stack: Pop Operation "+stack.pop());
		System.out.println("Non-empty stack: After Pop operation: "+stack);
		System.out.println("Non-empty stack: search() Operation: "+stack.search(1003));
		System.out.println("Non-empty stack: "+stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.empty());

	}

}
