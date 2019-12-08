package softserve.fourth;

//у класі демонструється порядок ініціалізації
public class OrderInit {
	int a = 12345; // ініціалізація змінної a з допомогою методу

	// ініціалізація змінних конструктором
	OrderInit() {
		System.out.println("Constructor OrderInit().");
		printA();
		a=b=c=0;
	}

	int c = InitMethod("c = "); // ініціалізація змінної c

	// метод, що ініціалізує змінні
	int InitMethod(String s) {
		System.out.println(s + "InitMethod().");
		return 100;
	}

	int b = InitMethod("b = "); // ініціалізація змінної b

	void printA() {
		System.out.println("print a: " + a);
		System.out.println("print b: " + b);
		System.out.println("print c: " + c);
	}
	
	public static void main(String[] args) {
		OrderInit orderInitClass = new OrderInit();
		
		System.out.println(orderInitClass.a);
		System.out.println(orderInitClass.b);
		System.out.println(orderInitClass.c);
	}
}