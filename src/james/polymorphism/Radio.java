package james.polymorphism;

public class Radio {
	private int volume;
	private double station;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getStation() {
		return station;
	}
	public void setStation(double station) {
		this.station = station;
	}
	
	public String playStation() {
		return "This radio is playing " + this.getStation() + " at "+this.getVolume()+ " volume";
	}
	

}
