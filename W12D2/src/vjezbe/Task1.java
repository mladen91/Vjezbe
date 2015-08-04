package vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Task1 extends JFrame {

	private JButton add = new JButton("Add");
	private JButton stop = new JButton("Stop");
	private MyThread t1 = null;
	private ArrayList<MyThread> list=new ArrayList<>();

	public Task1() {

		setLayout(new BorderLayout());
		add(add, BorderLayout.SOUTH);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				t1 = new MyThread();
				list.add(t1);
				t1.start();
				
			}
		});
		add(stop, BorderLayout.NORTH);
		stop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				
					for (int i = 0; i < list.size(); i++) {
						list.get(i).pauseThread();
						System.out.println(!list.get(i).isAlive());
					}
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		setLocationRelativeTo(null);
		setSize(500, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public class MyThread extends Thread {

		private boolean running = true;

		@Override
		public void run() {
			
			for (int i = 0; i < 100; i++) {

				while (!running) {
					yield();
				}

				System.out.println(i);

				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		public void pauseThread() throws InterruptedException {

			running = false;
		}

	}

	public static void main(String[] args) {

		new Task1();

	}

}
