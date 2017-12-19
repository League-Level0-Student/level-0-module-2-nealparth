package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog("What's your age");
		 int x= Integer.parseInt(age);
		 if(x>18) {
	JOptionPane.showMessageDialog(null,"Who do you think is the next presidebt");
		 }
		 else if(x<18) {
			 JOptionPane.showMessageDialog(null,"nobody cares what you think");
		 }
		 }

}

