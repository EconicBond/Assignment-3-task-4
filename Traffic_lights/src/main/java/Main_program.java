import swiftbot.*;

public class Main_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwiftBotAPI robot = SwiftBotAPI.INSTANCE;
		System.out.println("Welcome \n Please press A to start");
		robot.enableButton(Button.A, () -> {
		    // This code runs when button A is pressed
		    a[0] = true;
		});
	}

}
