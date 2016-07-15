import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanSelectListener implements ActionListener {
		
	public PlanSelectListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		switch(name) {
		case "Gold":
			new Gold();
			break;
		case "Silver":
			new Silver();
			break;
		case "Bronze":
			new Bronze();
			break;
		case "Systems":
			new Systems();
			break;
		case "Set Gold Prices":
			new CustomPricing();
		}
	}
}
