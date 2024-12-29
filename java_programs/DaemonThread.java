package java_programs;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Current thread is diamon thread.");
		} else {
			System.out.println("current thread is not daemon thread.");
		}
	}

	public static void main(String args[]) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
    /* Output
       current thread is not daemon thread.
       current thread is not daemon thread.
       Current thread is diamon thread.*/
