package birds;

import interfaces.EggLayingCreature;
import interfaces.FlyingCreature;

public class Falcon implements FlyingCreature, EggLayingCreature{
	
	private String currentLocation;
	private int numberOfEggs;
	
	
	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}
	
	
	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);		
	}

	@Override
	public void fly() {
		this.setCurrentLocation("In the sky");
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
