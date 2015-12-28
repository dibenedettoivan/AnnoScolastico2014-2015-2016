
class ClassA {

	public static String getmessage(){
		return "Hello";
		
	}
	public String getName(){
		return "A";
	}

}

class ClassB extends ClassA{
	public static String getmessage(){
		return "Hi";
	}
	public String getName(){
		return "B";
	}
	
}

public class Ese1 {
	public static void main(String[] args) {
		ClassB h = new ClassB();
		System.out.println(h.getmessage() + "  " + h.getName());
	}
}