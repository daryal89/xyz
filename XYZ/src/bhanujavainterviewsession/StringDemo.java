package bhanujavainterviewsession;

public class StringDemo {

	public static void main(String[] args) {
		
		char[] ch = {'h','e','l','l','o'};
		String str = new String(ch);
		System.out.println(str);
		
		String s = "java";
		s.concat("Test");
		System.out.println(s);

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(s).append("Hello").append("shyam"));
	}

}
