import swiftbot.*;

public class Main_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final boolean[] a = {false};
		final boolean[] b = {false};
		final boolean[] x = {false};
		final boolean[] y = {false};
		
		SwiftBotAPI robot = SwiftBotAPI.INSTANCE;
		System.out.println("Welcome \n Please press A to start");
		robot.enableButton(Button.A, () -> {
		    // This code runs when button A is pressed
		    a[0] = true;
		});
		if (a[0] == true)
		{
<<<<<<< HEAD
=======
			APressedStart = System.currentTimeMillis();
>>>>>>> parent of a18e3ae (Setting underlights to yellow)
			
		}
	}

}
