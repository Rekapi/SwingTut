import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// Simple JFrame 

		// 4. Thread 
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new JFrame("Hello World !");
				// 1. set size 
				frame.setSize(500, 400);
				// 2. set close operation
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 3. make it visible 
				frame.setVisible(true);
			}
		});
	}
}
