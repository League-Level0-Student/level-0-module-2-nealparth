package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
	String numbers="";
		Random randomSet = new Random();
		

	
    
	
	 
	 for(int i=0; i<5;i++) {
	 
	 	int d = randomSet. nextInt ( 5 );
	 	   
	 	 	numbers+=  d ;
			  
	 }		
	 JOptionPane.showMessageDialog(null,  numbers);
	}
	 
	
	 
	}
	

