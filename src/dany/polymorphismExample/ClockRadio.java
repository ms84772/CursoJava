package dany.polymorphismExample;

public class ClockRadio  extends Clock implements RadioInterface{

	public int volumne;
	public double station;
	
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
		// TODO Auto-generated method stub
		return "This ClockRadio is playing: "+this.getStation()+"  "+this.getVolumne() +"  "+this.displayTime();
	}
}
