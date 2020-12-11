package polimorphism;

public class ClockRadio extends Clock implements RadioInterface{
	
	private int volumne;
	private double station;
	
	
	public int getVolumne() {
		return volumne;
	}


	public void setVolumne(int volumne) {
		this.volumne = volumne;
	}


	public double getStation() {
		return station;
	}


	public void setStation(double station) {
		this.station = station;
	}


	@Override
	public String playStation() {
		
		return "This RadioClock plays " + this.getStation() + " at "+ this.getVolumne() + " volume";
	}
	
	

}
