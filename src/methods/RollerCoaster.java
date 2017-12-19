package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String height= JOptionPane.showInputDialog("What is your height?");
	int x = Integer.parseInt(height);
	 if(x>48) {
		 JOptionPane.showMessageDialog(null,"Congrats you can go on the rollar coaster");
	 }else if(x<48) {
		 JOptionPane.showMessageDialog(null,"be taller");
	 }	
}
}
