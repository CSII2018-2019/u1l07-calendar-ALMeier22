import javax.swing.JOptionPane;

public class calendermath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weekDay[] = new String[] {"Monday",  "Tuesday", "Wednesday",
										 "Thursday","Friday",  "Saterday", 
										 "Sunday"};
		
		int daysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		String answer = JOptionPane.showInputDialog ("how many days (1...365)?");
		int days = Integer.parseInt(answer);
		
		int newWeekDay = days % 7;
		
		int month = 1;
		while (days > daysInMonth[month]) {
			days = days - daysInMonth[month];
			month++;
		}
		
		String newDate = weekDay[newWeekDay] + " " + month + "/" + days + "/18" ;
		
		JOptionPane.showMessageDialog(null, newDate);
	}

}
