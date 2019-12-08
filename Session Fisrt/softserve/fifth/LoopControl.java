package softserve.fifth;

public class LoopControl {

	public static void main(String[] args) {

		whilee();
		dowhile();

	}

	void forr() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				// return;
			}
			System.out.print(i + " ");
		}

		System.out.println("Final row...");

	}

	static void whilee() {
		int i = 0;
		while (i < 5) {
			i++;
			if (i == 3) {
				// return;
			}
			System.out.print(i + " ");

		}
		System.out.println("Final row...");
	}

	static void dowhile() {
		int i = 0;
		do {
			i++;
			if (i == 3) {
				//break; // 1 2 Final print...
			}
			System.out.print(i + " ");
		} while (i < 5);
		System.out.println("Final print...");
	}

}