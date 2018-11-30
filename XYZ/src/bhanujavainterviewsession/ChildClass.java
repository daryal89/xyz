package bhanujavainterviewsession;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		//parent class reference and child class object
		ParentClass obj = new ChildClass();
		obj.test();
		obj.test1();
		obj.test2();
		
		//child class reference and child class object
		ChildClass obj1 = new ChildClass();
		obj1.test();
		obj1.test1();
		obj1.test2();
		
		//parent class reference and parent class object
		ParentClass obj2 = new ParentClass();
		obj2.test();
		obj2.test1();
		obj2.test2();
	}

}
