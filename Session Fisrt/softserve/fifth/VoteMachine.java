package softserve.fifth;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class VoteMachine {
	public void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			System.out.println("You can't vote !");
			throw new InvalidAgeException("**** Age of user is invalid ****");
		} else {
			System.out.println("You can vote !");
		}
	}

	public static void main(String[] args) {
		VoteMachine machine = new VoteMachine();
		try {
			machine.validate(11);
		} catch (InvalidAgeException ex) {
			System.out.println("I cought exceptin: " + ex.getMessage());
		}

	}
}
