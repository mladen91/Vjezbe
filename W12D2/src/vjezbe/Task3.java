package vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task3 extends JFrame {

	private JButton start = new JButton("Start");
	private static JLabel label = new JLabel();

	// private volatile static Integer count = 0;

	public Task3() {

		setLayout(new BorderLayout());
		add(start, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = new Thread(new MyThread());
				Thread t2 = new Thread(new MyThread());
				Thread t3 = new Thread(new MyThread());
				Thread t4 = new Thread(new MyThread());
				Thread t5 = new Thread(new MyThread());
				Thread t6 = new Thread(new MyThread());

				t.start();
				t2.start();
				t3.start();
				t4.start();
				t5.start();
				t6.start();
				

			}

			

		});

		setLocationRelativeTo(null);
		setSize(500, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static class MyThread implements Runnable {
		Integer count = 0;

		@Override
		public void run() {
			for (int i = 10; i < 1000000; i++) {
				if (isPrime(i)) {
					
					synchronized (count) {
						count++;
					}

				}
			}
			
			System.out.println(count);
			label.setText(count+"");
		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		new Task3();

	}

}
