package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg4Trinnskatt {

	public static void main(String[] args) {
		
        String brukerinput = showInputDialog("Tast inn din bruttoinntekt: ");
                int inntekt = Integer.parseInt(brukerinput);
                int trinnskatt = 0;
        		
      //Trinn 0  
      if (inntekt <= 164100) {
    	  showMessageDialog(null, "Din inntekt er " + inntekt + ",- og din trinnskatt er " + trinnskatt + ",-");
      
      //Trinn 1
      } else if (inntekt > 164101 && inntekt < 230950) {
    	  trinnskatt = (int) (00.0093 * inntekt);
    	  showMessageDialog(null, "Din inntekt er " + inntekt + ",- og din trinnskatt er " + trinnskatt + ",-");
    	
      //Trinn 2  
      } else if (inntekt > 230951 && inntekt < 580650) {
    	  trinnskatt = (int) (0.0241 * inntekt);
    	  showMessageDialog(null, "Din inntekt er " + inntekt + ",- og din trinnskatt er " + trinnskatt + ",-");
      //Trinn 3  
      } else if (inntekt > 639750 && inntekt < 999550) {
    	  trinnskatt = (int) (0.1152 * inntekt);
    	  showMessageDialog(null, "Din inntekt er " + inntekt + ",- og din trinnskatt er " + trinnskatt + ",-");
    	  
      //Trinn 4  
      } else if (inntekt > 999550) {
    	  trinnskatt =  (int) (0.145 * inntekt);
    	  showMessageDialog(null, "Din inntekt er " + inntekt + ",- og din trinnskatt er " + trinnskatt + ",-");
    	  
    	  
      }
	}

}

