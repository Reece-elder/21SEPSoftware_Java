package developers;

import interfaces.Developer;

public class FrontEndDeveloper implements Developer{

	public void develop() {
		writeHTML();
	}
	
	public void writeHTML() {
		System.out.println("HTML is soooo cool");
	}
}
