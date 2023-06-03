public class EvenOddAnonymous {
	int i = 0;
	int j=0;
	int max = 50;
	 int min = 0;
	 int range = 50 - 0 + 1;// max-min+1
	int[] a = new int[21];

	public void EvenNo() {
		synchronized (this) {
			while (j < a.length-1) {
				while (a[j] % 2 != 0) {
					try {
						wait();
					} catch (Exception e) {
						System.out.println(e);
					}
				}

				System.out.println(a[j] + " is Even -> " + Thread.currentThread().getName());
				j++;
				notify();
			}
		}
	}

	public void OddNO() {
		synchronized (this) {
			while (j < a.length) {//a.length-1
				while (a[j] % 2 == 0) {
					try {
						wait();
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				System.out.println(a[j] + " is Odd -> " + Thread.currentThread().getName());
				j++;
				notify();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		EvenOddAnonymous m = new EvenOddAnonymous(); // meaningful names

		for (int i = 0; i < 21; i++) {
			m.a[i] = (int) (Math.random() * m.range) + m.min;
		}
		for (int i = 0; i < 21; i++) {
			System.out.println(m.a[i]);
		}
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				m.EvenNo();
			}
		});
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				m.OddNO();
			}
		});
		th1.start();
		th2.start();

		th1.join();
		th2.join();
		System.out.println("end");
	}
}
