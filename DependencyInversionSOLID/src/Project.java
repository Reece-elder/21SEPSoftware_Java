import java.util.ArrayList;
import java.util.List;

import interfaces.Developer;

public class Project {

//	private Developer dev;
//	
//	public Project(Developer dev) {
//		this.dev = dev;
//	}
//	
//	public void implement() {
//		this.dev.develop();
//	}
	
	private List<Developer> developers;
	
	//Same as above, except we are not instantiating the new list yet
	//private List<Developer> developers = new ArrayList<>();
	
	public Project(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void implement() {
		developers.forEach(dev -> dev.develop());
	}
}




//Enhanced for loop :

//for(Developer dev : developers) {
//	System.out.println(dev);
//}
