public class AlternateNumber {
	static int i=0;
	public void zeros() {
		synchronized (this) {
			while (i < 30) {

				while (i % 2 != 0) {
					try {
						wait();
					} catch (Exception e) {
						System.out.println(e);
					}
				}

				System.out.println(i + " " + Thread.currentThread().getName());
				i++;
				notify();
			}
		}

	}

	public void ones() {
		synchronized (this) {
			//int i = 0;//error : we can't make a shared variable as a local one
			while (i < 30) {
				
					while (i % 2 != 1) {
						try {
						wait();
					}catch (Exception e) {
						System.out.println(e);
					}
				} 
				System.out.println(i + " " + Thread.currentThread().getName());
				i++;
				notify();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		AlternateNumber obj = new AlternateNumber();

		Thread th1 = new Thread(new Runnable() {
			public void run() {
				obj.zeros();
			}
		});
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				obj.ones();
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
	}

}
