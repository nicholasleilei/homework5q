package ¿œ ¶0726;

import java.util.Timer;
import java.util.TimerTask;

public class Timer¿‡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TimerTask tt = new TimerTask() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello");
		}
	};
	
	Timer t = new Timer();
	t.schedule(tt, 3000);
	}

}
