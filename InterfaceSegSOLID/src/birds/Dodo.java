package birds;

import interfaces.EggLayingCreature;
import interfaces.ExtinctCreature;

public class Dodo implements ExtinctCreature, EggLayingCreature{

	private String currentLocation;
	private int numberOfEggs;
	
	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}
	
	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 2);
	}

	@Override
	public void goExtinct() {
		this.setCurrentLocation("In a museum");
	}
	
	
	
	
	public String getCurrentLocation() {
		return currentLocation;
	}
	
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	public int getNumberOfEggs() {
		return numberOfEggs;
	}
	
	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}
	
	
}
