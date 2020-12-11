package dany.threads;

import java.util.Date;

public class ThreadController {

	public static void main(String[] args) {
		
		ThreadExample te1 = new ThreadExample("t1", new Date());
		ThreadExample te2 = new ThreadExample("t2", new Date());
		ThreadExample te3 = new ThreadExample("t3", new Date());
		ThreadExample te4 = new ThreadExample("t4", new Date());
		ThreadExample te5 = new ThreadExample("t5", new Date());
		ThreadExample te6 = new ThreadExample("t6", new Date());
		ThreadExample te7 = new ThreadExample("t7", new Date());
		ThreadExample te8 = new ThreadExample("t8", new Date());
		
		
		te1.start();
		te2.start();
		te3.start();
		te4.start();
		te5.start();
		te6.start();
		te7.start();
		te8.start();
		
	}
}
