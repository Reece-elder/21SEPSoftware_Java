package differentgreetings;

import interfaces.Greeting;

public class CasualGreeting implements Greeting{

	@Override
	public String greet() {
		return "Yo, whats good";
	}

}
