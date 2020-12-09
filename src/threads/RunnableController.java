package threads;

import java.util.Date;

public class RunnableController {

	public static void main(String[] args) {
		Thread te1 = new Thread(new RunnableExample("t1", new Date()));
		Thread te2 = new Thread(new RunnableExample("t2", new Date()));
		Thread te3 = new Thread(new RunnableExample("t3", new Date()));
		Thread te4 = new Thread(new RunnableExample("t4", new Date()));
		Thread te5 = new Thread(new RunnableExample("t5", new Date()));
		Thread te6 = new Thread(new RunnableExample("t6", new Date()));
		Thread te7 = new Thread(new RunnableExample("t7", new Date()));
		Thread te8 = new Thread(new RunnableExample("t8", new Date()));
		
		te1.start();
		te2.start();
		te3.start();
		te4.start();
		te5.start();
		te6.start();
		te7.start();
		te8.start();

//		te1.run();
//		te2.run();
//		te3.run();
//		te4.run();
//		te5.run();
//		te6.run();
//		te7.run();
//		te8.run();


	}

}
