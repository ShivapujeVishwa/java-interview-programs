package numbers;

public class FibonacciSeries {
	public static void main(String[] args) {

		Thread t = new Thread();

		ForLoop f = new ForLoop();
		f.start();

		whileLoop w = new whileLoop();
		w.start();
	}

}

class ForLoop extends Thread {
	int a = 0, b = 0, c = 1;

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;

			System.out.print(a + " ");
			System.out.println();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class whileLoop extends Thread {

	@Override
	public void run() {
		int a = 0, b = 0, c = 1;

		int i = 1;
		while (i <= 10) {
			a = b;
			b = c;
			c = a + b;

			System.out.print(a + " ");
			i++;

			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
