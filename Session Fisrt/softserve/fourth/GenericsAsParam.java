package softserve.fourth;

import java.util.ArrayList;

class Machine {
	@Override
	public String toString() {
		return "Machine";
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "Camera";
	}
}

public class GenericsAsParam {
	public static void main(String[] arg) {
		ArrayList<Machine> list = new ArrayList<>();
		list.add(new Machine());
		list.add(new Camera());
		showList(list);
	}

	public static void showList(ArrayList<Machine> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
}
