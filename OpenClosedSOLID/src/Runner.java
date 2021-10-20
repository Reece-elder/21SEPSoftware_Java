import differentgreetings.CasualGreeting;
import differentgreetings.FormalGreeting;
import domain.Greeter;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		FormalGreeting testGreet = new FormalGreeting();
		
		//Setting the greeting to a FormalGreeting
		greeter.setGreeting(testGreet);
		System.out.println(greeter.greet());
		
//		FormalGreeting fgreet = new FormalGreeting();
//		System.out.println(fgreet.greet());
//		
//		CasualGreeting cgreet = new CasualGreeting();
//		System.out.println(cgreet.greet());
	}

}
