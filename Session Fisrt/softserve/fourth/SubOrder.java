package softserve.fourth;

public class SubOrder extends OrderInit{
	int a = 555; // ініціалізація змінної a з допомогою методу
	
	SubOrder(){
		System.out.println("SubOrder constructor");
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		
		SubOrder subOrder = new SubOrder();
		
		
		System.out.println(subOrder.a);
	}
	
	
}
