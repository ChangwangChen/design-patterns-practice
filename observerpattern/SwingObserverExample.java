import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample
{
	JFrame frame;
	
	public static void main(String[] args)
	{
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go()
	{
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setLocation(200, 300);
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
	
	class AngelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("Don't do it, you might regret it!");
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("Come on, do it!You know you wanna to!");
		}
	}
}
