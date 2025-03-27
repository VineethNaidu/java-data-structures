public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello Vineeth, Welcome to the Programming World!"+ args[0]);
		Message1.message1();
		Message2.message2();
	}
}

class Message1 {
	static void message1() {
		System.out.println("Printed Message1 !");
	}
}

class Message2 {
	static void message2() {
		System.out.println("Printed Message 2 !");
	}
}
