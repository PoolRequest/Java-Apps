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


public class Silver {
	
public Silver() {
	ArrayList<JCheckBox> boxes = new ArrayList<JCheckBox>();
	JFrame silverWindow = new JFrame("Silver Plan");
	silverWindow.setLayout(new GridLayout(1,3));
	silverWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JTextArea text = new JTextArea(5,30);
	
	JPanel top = new JPanel();
	top.setLayout(new BoxLayout(top,BoxLayout.Y_AXIS));
	
	JPanel middle = new JPanel();
	middle.setLayout(new GridLayout(4,1));
	
	JPanel bottom = new JPanel();
	bottom.setLayout(new GridLayout(1,1));
	
	JLabel label = new JLabel();
	text.add(label);
	
	Font font = new Font("Helvetica", Font.BOLD, 20);
	
	JLabel bigticket = new JLabel("Big Ticket Stuff");
	bigticket.setFont(font);
	
	JLabel dup = new JLabel("Duplicate Appliances");
	dup.setFont(font);

	JLabel sqFoot = new JLabel("Sq Footage");
	sqFoot.setFont(font);

//Create the billing option buttons	
	JButton pif1 = new JButton("Silver 1 Yr PIF");
	JButton pif3 = new JButton("Silver 3 Yr PIF");
	JButton month1 = new JButton("Silver 1 Yr Monthly");
	JButton month3 = new JButton("Silver 3 Yr Monthly");
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
	JCheckBox fiveToSix = new JCheckBox("> 5,000");
	JCheckBox sixToSeven = new JCheckBox("> 6,000");
	JCheckBox sevenToEight = new JCheckBox("> 7,000");
	JCheckBox vac = new JCheckBox("Add Central Vac");
	JCheckBox washer = new JCheckBox("Add Washer");
	JCheckBox dryer = new JCheckBox("Add Dryer");
	JCheckBox disposal = new JCheckBox("Add Disposal");
	JCheckBox waterheater = new JCheckBox("Add Water Heater");

	
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
	boxes.add(oven);
	boxes.add(dish);
	boxes.add(fiveToSix);
	boxes.add(sixToSeven);
	boxes.add(sevenToEight);
	boxes.add(vac);
	boxes.add(washer);
	boxes.add(dryer);
	boxes.add(disposal);
	boxes.add(waterheater);
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
	top.add(vac);
	top.add(dup); //jlabel
	top.add(fridge);
	top.add(freezer);
	top.add(oven);
	top.add(dish);
	top.add(washer);
	top.add(dryer);
	top.add(disposal);
	top.add(waterheater);
	top.add(sqFoot); //jlabel
	top.add(fiveToSix);
	top.add(sixToSeven);
	top.add(sevenToEight);

//Text Area
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
	oven.addItemListener(setAddonPrice); 
	dish.addItemListener(setAddonPrice);
	fiveToSix.addItemListener(setAddonPrice);
	sixToSeven.addItemListener(setAddonPrice);
	sevenToEight.addItemListener(setAddonPrice);
	vac.addItemListener(setAddonPrice);
	dryer.addItemListener(setAddonPrice);
	washer.addItemListener(setAddonPrice);
	disposal.addItemListener(setAddonPrice);
	waterheater.addItemListener(setAddonPrice);
	
	pif1.addActionListener(setPlanPrice);
	pif3.addActionListener(setPlanPrice);
	month1.addActionListener(setPlanPrice);
	month3.addActionListener(setPlanPrice);
	clear.addActionListener(setPlanPrice);
		
	text.setText(Price.getPrice());
//Add all components to frame
	silverWindow.add(top);
	silverWindow.add(middle);
	silverWindow.add(bottom);

	silverWindow.pack();
	silverWindow.setLocationRelativeTo(null);
	silverWindow.setVisible(true);


	}
}




