import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class PlanPriceListener implements ActionListener {
JTextArea area;
static int goldOnePif = 550;
int goldOnePifLowest = 495;
static int goldThreePif = 1250;
int goldThreePifLowest = 1195;
static int goldOneMonth = 595;
int goldOneMonthLowest = 550;
static int goldThreeMonth = 1295;
int goldThreeMonthLowest = 1250;

int silverOnePif = 400;
int silverThreePif = 1100;
int silverOneMonth = 475;
int silverThreeMonth = 1150;

int systemsOnePif = 425;
int systemsThreePif = 1100;
int systemsOneMonth = 485;
int systemsThreeMonth = 1150;

int bronzeOnePif = 300;
int bronzeThreePif = 895;
int bronzeOneMonth = 375;
int bronzeThreeMonth = 950;
ArrayList<JCheckBox> checkBox;
	public PlanPriceListener(JTextArea text, ArrayList<JCheckBox> boxes) {
		this.area = text;
		this.checkBox = boxes;
	}

	public static void setGoldOnePif(int x) {
		goldOnePif = x;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		final String newline = "\n";
		switch(name) {
		
		case "Gold 1 Yr PIF":
			Price.setPrice(goldOnePif);
			area.setText("$" + Price.getPrice() + newline);
			Price.setPrice(goldOnePifLowest);
			area.append("Lowest you can go: $" + Price.getPrice());
			break;
		case "Gold 3 Yr PIF":
			Price.setPrice(goldThreePif);
			Price.setThreeYearAddons();
			area.setText("$" + Price.getPrice() + newline + newline);
			Price.setPrice(goldThreePifLowest);
			area.append("Lowest you can go: $" + Price.getPrice());
			break;
		case "Gold 1 Yr Monthly":
			Price.setPrice(goldOneMonth);
			area.setText(Price.getPrice() + newline);
			area.append("With $100 down 9 payments of " + Price.get1Monthly(100) + newline + newline);
			Price.setPrice(goldOneMonthLowest);
			area.append("Lowest you can go: $" + Price.getPrice() + newline);
			area.append("With $100 down 9 payments of " + Price.get1Monthly(100));
			break;
		case "Gold 3 Yr Monthly":
			Price.setPrice(goldThreeMonth);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice() + newline);
			area.append("With $150 down 18 payments of " + Price.get3Monthly(150) + newline);
			area.append("With $250 down 18 payments of " + Price.get3Monthly(250) + newline);
			area.append("With $350 down 18 payments of " + Price.get3Monthly(350) + newline + newline);
			Price.setPrice(goldThreeMonthLowest);
			area.append("Lowest you can go: $" + Price.getPrice() + newline);
			area.append("With $150 down 18 payments of " + Price.get3Monthly(150) + newline);
			area.append("With $250 down 18 payments of " + Price.get3Monthly(250) + newline);
			area.append("With $350 down 18 payments of " + Price.get3Monthly(350) + newline);
			break;
		case "Clear":
			for(JCheckBox checkbox : checkBox) {
				checkbox.setSelected(false);
			}
			Price.clearAddon();
			Price.setPrice(0);
			area.setText(Price.getPrice());
			break;
		case "Silver 1 Yr PIF":
			Price.setPrice(silverOnePif);
			area.setText(Price.getPrice());
			break;
		case "Silver 3 Yr PIF":
			Price.setPrice(silverThreePif);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice());
			break;
		case "Silver 1 Yr Monthly":
			Price.setPrice(silverOneMonth);
			area.setText(Price.getPrice() + newline);
			area.append("With $100 down 9 payments of " + Price.get1Monthly(100));
			break;
		case "Silver 3 Yr Monthly":
			Price.setPrice(silverThreeMonth);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice() + newline);
			area.append("With $150 down 18 payments of " + Price.get3Monthly(150) + newline);
			area.append("With $250 down 18 payments of " + Price.get3Monthly(250) + newline);
			area.append("With $350 down 18 payments of " + Price.get3Monthly(350));
			break;
		case "Bronze 1 Yr PIF":
			Price.setPrice(bronzeOnePif);
			area.setText(Price.getPrice());
			break;
		case "Bronze 3 Yr PIF":
			Price.setPrice(bronzeThreePif);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice());
			break;
		case "Bronze 1 Yr Monthly":
			Price.setPrice(bronzeOneMonth);
			area.setText(Price.getPrice() + newline);
			area.append("With $100 down 9 payments of " + Price.get1Monthly(100));
			break;
		case "Bronze 3 Yr Monthly":
			Price.setPrice(bronzeThreeMonth);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice() + newline);
			area.append("With $150 down 18 payments of " + Price.get3Monthly(150) + newline);
			area.append("With $250 down 18 payments of " + Price.get3Monthly(250) + newline);
			area.append("With $350 down 18 payments of " + Price.get3Monthly(350));
			break;
		case "Systems 1 Yr PIF":
			Price.setPrice(systemsOnePif);
			area.setText(Price.getPrice());
			break;
		case "Systems 3 Yr PIF":
			Price.setPrice(systemsThreePif);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice());
			break;
		case "Systems 1 Yr Monthly":
			Price.setPrice(systemsOneMonth);
			area.setText(Price.getPrice() + newline);
			area.append("With $100 down 9 payments of " + Price.get1Monthly(100));
			break;
		case "Systems 3 Yr Monthly":
			Price.setPrice(systemsThreeMonth);
			Price.setThreeYearAddons();
			area.setText(Price.getPrice() + newline);
			area.append("With $150 down 18 payments of " + Price.get3Monthly(150) + newline);
			area.append("With $250 down 18 payments of " + Price.get3Monthly(250) + newline);
			area.append("With $350 down 18 payments of " + Price.get3Monthly(350));
			break;
		}

	}

}
