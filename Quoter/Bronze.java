import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Bronze {
	d
public Bronze() {
	ArrayList<JCheckBox> boxes = new ArrayList<JCheckBox>();
	JFrame bronzeWindow = new JFrame("Bronze Plan");
	bronzeWindow.setLayout(new GridLayout(0,2,5,5));
	bronzeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JTextArea text = new JTextArea(10,30);
	
	JPanel top = new JPanel();
	top.setLayout(new BoxLayout(top,BoxLayout.Y_AXIS));
	
	JPanel middle = new JPanel();
	middle.setLayout(new GridLayout(4,1));
	
	JPanel bottom = new JPanel();
	bottom.setLayout(new GridLayout(1,1));
	
	JLabel label = new JLabel();
	text.add(label);
	
	JLabel bigticket = new JLabel("Big Ticket Stuff");
	bigticket.setFont(new Font("Helvetica", Font.BOLD, 20));

	JLabel dup = new JLabel("Duplicate Appliances");
	dup.setFont(new Font("Helvetica", Font.BOLD, 20));

//Create the billing option buttons	
	JButton pif1 = new JButton("Bronze 1 Yr PIF");
	JButton pif3 = new JButton("Bronze 3 Yr PIF");
	JButton month1 = new JButton("Bronze 1 Yr Monthly");
	JButton month3 = new JButton("Bronze 3 Yr Monthly");
	JButton clear = new JButton("Clear");

//Add the billing options	
	middle.add(pif1);
	middle.add(pif3);
	middle.add(month1);
	middle.add(month3);
	middle.add(clear);
//Create the add on list		
	JCheckBox ac = new JCheckBox("Add A/C Unit");
	JCheckBox heat = new JCheckBox("Add Heating Unit");
	JCheckBox septic = new JCheckBox("Add Septic");	    
	JCheckBox wellpump = new JCheckBox("Add Well Pump");
	JCheckBox sump = new JCheckBox("Add Sump Pump");
	JCheckBox icemaker = new JCheckBox("Add Ice Maker");
	JCheckBox micro = new JCheckBox("Add Built-in Microwave");
	JCheckBox freezer = new JCheckBox("Add Freezer");
	JCheckBox tankless = new JCheckBox("Add Tankless");
	JCheckBox stoppages = new JCheckBox("Add Stoppages");
	JCheckBox pool = new JCheckBox("Add Pool/Spa");
	JCheckBox fridge = new JCheckBox("Add a Fridge");
	JCheckBox oven = new JCheckBox("Add Oven");
	JCheckBox dish = new JCheckBox("Add Dishwasher");
	
	boxes.add(ac);
	boxes.add(heat);
	boxes.add(septic);
	boxes.add(wellpump);
	boxes.add(sump);
	boxes.add(icemaker);
	boxes.add(micro);
	boxes.add(freezer);
	boxes.add(tankless);
	boxes.add(stoppages);
	boxes.add(pool);
	boxes.add(fridge);
//Add the addons
	top.add(bigticket);
	top.add(pool);
	top.add(ac);
	top.add(heat);
	top.add(septic);
	top.add(wellpump);
	top.add(sump);
	top.add(tankless);
	top.add(stoppages);
	top.add(icemaker);
	top.add(micro);
	top.add(dup); //jlabel
	top.add(fridge);
	top.add(freezer);
	top.add(oven);
	top.add(dish);
//Text Area
	Font font = new Font("Helvetica", Font.BOLD, 18);
	text.setFont(font);
	bottom.add(text);
//Create Listeners
	ActionListener setPlanPrice = new PlanPriceListener(text, boxes);
	ItemListener setAddonPrice = new AddonItemListener(text);
//Event Handlers
	septic.addItemListener(setAddonPrice);
	wellpump.addItemListener(setAddonPrice);
	sump.addItemListener(setAddonPrice);
	icemaker.addItemListener(setAddonPrice);
	micro.addItemListener(setAddonPrice);
	freezer.addItemListener(setAddonPrice);
	tankless.addItemListener(setAddonPrice);
	stoppages.addItemListener(setAddonPrice);
	ac.addItemListener(setAddonPrice);
	heat.addItemListener(setAddonPrice);
	pool.addItemListener(setAddonPrice);
	fridge.addItemListener(setAddonPrice);
	
	pif1.addActionListener(setPlanPrice);
	pif3.addActionListener(setPlanPrice);
	month1.addActionListener(setPlanPrice);
	month3.addActionListener(setPlanPrice);
	clear.addActionListener(setPlanPrice);
		
	text.setText(Price.getPrice());
//Add all components to frame
	bronzeWindow.add(middle);
	bronzeWindow.add(bottom);

	bronzeWindow.pack();
	bronzeWindow.setLocationRelativeTo(null);
	bronzeWindow.setVisible(true);


	}
}




