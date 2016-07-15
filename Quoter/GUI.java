import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI() {
		JFrame mainWindow = new JFrame("Quote Generator");
		mainWindow.setLayout(new GridLayout(3,2));		
				
		JPanel top = new JPanel();
		JPanel middle = new JPanel();
		JPanel bottom = new JPanel();
		top.setLayout(new GridLayout(2,2));
		
//Creating Buttons
		JButton gold = new JButton("Gold");
		JButton silver = new JButton("Silver");
		JButton bronze = new JButton("Bronze");
		JButton systems = new JButton("Systems");
//Adding Buttons		
		middle.add(gold);
		middle.add(silver);
		middle.add(bronze);
		middle.add(systems);
		
//Button event handler
		ActionListener btnClick = new PlanSelectListener();
		gold.addActionListener(btnClick);
		silver.addActionListener(btnClick);
		bronze.addActionListener(btnClick);
		systems.addActionListener(btnClick);
		
		mainWindow.add(top);
		mainWindow.add(middle);
		mainWindow.add(bottom);
		
		mainWindow.pack();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);



	}
}

