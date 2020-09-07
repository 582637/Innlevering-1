package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Karakterskala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
		String poeng = showInputDialog("Fyll inn antall poeng; ");
		       int poengsum = parseInt(poeng);
		       
		       if(poengsum <= 100 && poengsum >= 90) {
		    	   showMessageDialog(null, "Karakter A");
		       } else if (poengsum < 90 && poengsum >= 80) {
		    	   showMessageDialog(null, "Karakter B");
		       } else if (poengsum < 80 && poengsum >= 60) {
		    	   showMessageDialog(null, "Karakter C");
		       } else if (poengsum < 60 && poengsum >= 50) {
		    	   showMessageDialog(null,"Karakter D");
		       } else if (poengsum < 50 && poengsum >= 40) {
		    	   showMessageDialog(null, "Karakter E");
		       } else if (poengsum < 40 && poengsum >= 0) {
		    	   showMessageDialog(null, "Karakter F");
		       
		       } else if (poengsum > 100 || poengsum < 0) {
		    	   showMessageDialog(null, "Ugyldig poeng, prøv på nytt!");
		      
		      
		       }

	}

} }
