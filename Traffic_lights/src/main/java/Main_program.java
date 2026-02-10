import swiftbot.*;

public class Main_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ProgramStart = System.currentTimeMillis();
		final boolean[] a = {false};
		final boolean[] b = {false};
		final boolean[] x = {false};
		final boolean[] y = {false};
		
		int[] red = {255 , 0, 0};
		int[] green = { 0, 255, 0};
		int[] blue = { 0, 0, 255 };
		int[] yellow = { 255, 255, 0 };
		
		double APressedStart = 0.0;
		SwiftBotAPI robot = SwiftBotAPI.INSTANCE;
		System.out.println("Welcome \n Please press A to start");
		robot.enableButton(Button.A, () -> {
		    // This code runs when button A is pressed
		    a[0] = true;
		});
		while (a[0] = false)
		{
		if (a[0] == true)
		{
			APressedStart = System.currentTimeMillis();
			robot.fillUnderlights(yellow);
			
		}
	}
	}

}
