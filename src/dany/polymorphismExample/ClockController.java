package dany.polymorphismExample;

public class ClockController {

	public static void main( String [] ars) {
		
		Clock c = new Clock();
		c.setHours(10);
		c.setMinutes(30);
		c.setSeconds(12);
		
		System.out.println(c.displayTime());
		
		Radio r = new Radio();
		r.setStation(93.1);
		r.setVolume(4);
		System.out.println(r.playStation());
		
		ClockRadio cr = new ClockRadio();
		cr.setStation(93.1);
		cr.setVolumne(4);
		cr.setHours(10);
		cr.setMinutes(30);
		cr.setSeconds(12);
		System.out.println(cr.playStation());
	}
}
