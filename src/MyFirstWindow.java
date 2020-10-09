import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFirstWindow extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton northButton = new JButton("North");
	JButton southButton = new JButton("South");
	JButton westButton = new JButton("West");
	JButton eastButton = new JButton("East");
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	public MyFirstWindow() {
		this.add(northButton, BorderLayout.NORTH);
		this.add(southButton, BorderLayout.SOUTH);
		this.add(westButton, BorderLayout.WEST);
		this.add(eastButton, BorderLayout.EAST);
		this.add(sp, BorderLayout.CENTER);
		northButton.addActionListener(this);
		southButton.addActionListener(this);
		westButton.addActionListener(this);
		eastButton.addActionListener(this);
		
	}
	public static void main(String[] args) {
		MyFirstWindow mfw = new MyFirstWindow();
		mfw.setTitle("Here is the title");
		mfw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mfw.setSize(800,680);
		mfw.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("North")) {
			System.out.println("North Button pressed");
			System.exit(0);
		}
		if(e.getActionCommand().equals("South")) {
			System.out.println(ta.getText());
		}
	}
}
