package differentgreetings;

import interfaces.Greeting;

public class FormalGreeting implements Greeting{

	@Override
	public String greet() {
		return "Hello good sir";
	}

}
