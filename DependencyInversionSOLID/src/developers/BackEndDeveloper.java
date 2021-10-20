package developers;

import interfaces.Developer;

public class BackEndDeveloper implements Developer{

	public void develop() {
		writeJava();
	}
	
	public void writeJava() {
		System.out.println("Java is fun but sometimes hard :(");
	}
}
