import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	// 5. creating constructor with title parameter 
	
	public MainFrame(String title) {
		super(title);
		
		// a. set Layout manager 
		setLayout(new BorderLayout());
		
		// b. create swing component 
		JButton btn = new JButton("Click me");
		JTextArea txtArea = new JTextArea();
		
		// c. adding swing components to content pane
		Container c = getContentPane();
		c.add(btn, BorderLayout.SOUTH);
		c.add(txtArea, BorderLayout.CENTER);
	// 6. Add behaviour 
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtArea.append("Hello\n");
			}
			
		});
		
	}

}
