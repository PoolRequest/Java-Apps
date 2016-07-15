import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AddonItemListener implements ItemListener {

	JTextArea area;
	JLabel label;
	int septic = 50;
	int wellpump = 50;
	int sump = 50;
	int ice = 25;
	int micro = 75;
	int freezer = 25;
	int tankless = 75;
	int stop = 100;
	int ac = 50;
	int heat = 50;
	int pool = 150;
	int fridge = 25;
	int oven = 25;
	int dish = 25;
	int fiveToSix = 100;
	int sixToSeven = 150;
	int sevenToEight = 200;
	int vac = 25;
	int wash = 25;
	int dry = 25;
	int disp = 25;
	int wheat = 50;
	
	public AddonItemListener(JTextArea text) {
		this.area = text;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox c = (JCheckBox)e.getSource();		
		String name = c.getText();
		switch(name) {
		case "Add Septic":
			if(c.isSelected())
				Price.setAddon(septic);
			else if(!c.isSelected())
				Price.remAddon(septic);
			area.setText(Price.getPrice());
			break;
		case "Add Well Pump":
			if(c.isSelected())
				Price.setAddon(wellpump);
			else if(!c.isSelected())
				Price.remAddon(wellpump);
			area.setText(Price.getPrice());
			break;
		case "Add Sump Pump":
			if(c.isSelected())
				Price.setAddon(sump);
			else if(!c.isSelected())
				Price.remAddon(sump);
			area.setText(Price.getPrice());
			break;
		case "Add Ice Maker":
			if(c.isSelected())
				Price.setAddon(ice);
			else if(!c.isSelected())
				Price.remAddon(ice);
			area.setText(Price.getPrice());
			break;
		case "Add Built-in Microwave":
			if(c.isSelected())
				Price.setAddon(micro);
			else if(!c.isSelected())
				Price.remAddon(micro);
			area.setText(Price.getPrice());
			break;
		case "Add Freezer":
			if(c.isSelected())
				Price.setAddon(freezer);
			else if(!c.isSelected())
				Price.remAddon(freezer);
			area.setText(Price.getPrice());
			break;
		case "Add Tankless":
			if(c.isSelected())
				Price.setAddon(tankless);
			else if(!c.isSelected())
				Price.remAddon(tankless);
			area.setText(Price.getPrice());
			break;
		case "Add Stoppages":
			if(c.isSelected())
				Price.setAddon(stop);
			else if(!c.isSelected())
				Price.remAddon(stop);
			area.setText(Price.getPrice());
			break;
		case "Add A/C Unit":
			if(c.isSelected())
				Price.setAddon(ac);
			else if(!c.isSelected())
				Price.remAddon(ac);
			area.setText(Price.getPrice());
			break;
		case "Add Heating Unit":
			if(c.isSelected())
				Price.setAddon(heat);
			else if(!c.isSelected())
				Price.remAddon(heat);
			area.setText(Price.getPrice());
			break;
		case "Add Pool/Spa":
			if(c.isSelected())
				Price.setAddon(pool);
			else if(!c.isSelected())
				Price.remAddon(pool);
			area.setText(Price.getPrice());
			break;
		case "Add a Fridge":
			if(c.isSelected())
				Price.setAddon(fridge);
			else if(!c.isSelected())
				Price.remAddon(fridge);
			area.setText(Price.getPrice());
			break;
		case "Add Oven":
			if(c.isSelected())
				Price.setAddon(oven);
			else if(!c.isSelected())
				Price.remAddon(oven);
			area.setText(Price.getPrice());
			break;
		case "Add Dishwasher":
			if(c.isSelected())
				Price.setAddon(dish);
			else if(!c.isSelected())
				Price.remAddon(dish);
			area.setText(Price.getPrice());
			break;
		case "> 5,000":
			if(c.isSelected())
				Price.setAddon(fiveToSix);
			else if(!c.isSelected())
				Price.remAddon(fiveToSix);
			area.setText(Price.getPrice());
			break;
		case "> 6,000":
			if(c.isSelected())
				Price.setAddon(sixToSeven);
			else if(!c.isSelected())
				Price.remAddon(sixToSeven);
			area.setText(Price.getPrice());
			break;
		case "> 7,000":
			if(c.isSelected())
				Price.setAddon(sevenToEight);
			else if(!c.isSelected())
				Price.remAddon(sevenToEight);
			area.setText(Price.getPrice());
			break;
		case "Add Central Vac":
			if(c.isSelected())
				Price.setAddon(vac);
			else if(!c.isSelected())
				Price.remAddon(vac);
			area.setText(Price.getPrice());
			break;
		case "Add Washer":
			if(c.isSelected())
				Price.setAddon(wash);
			else if(!c.isSelected())
				Price.remAddon(wash);
			area.setText(Price.getPrice());
			break;
		case "Add Dryer":
			if(c.isSelected())
				Price.setAddon(dry);
			else if(!c.isSelected())
				Price.remAddon(dry);
			area.setText(Price.getPrice());
			break;
		case "Add Disposal":
			if(c.isSelected())
				Price.setAddon(disp);
			else if(!c.isSelected())
				Price.remAddon(disp);
			area.setText(Price.getPrice());
			break;
		case "Add Water Heater":
			if(c.isSelected())
				Price.setAddon(wheat);
			else if(!c.isSelected())
				Price.remAddon(wheat);
			area.setText(Price.getPrice());
			break;
		}			
	}

}
