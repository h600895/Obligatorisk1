package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave1 { 
	
	

	public static void main(String[] args) {
		
		String inntektStr = showInputDialog("Skriv inn bruttoinntekten i kr: ");
		int inntektInt = Integer.parseInt(inntektStr);
		double prosent;
		
		if (inntektInt <= 164100) {
			prosent = 0;
		}else if (inntektInt <= 230950) {
			prosent = 0.0093;
		}else if (inntektInt <= 580650) {
			prosent = 0.0241;
		}else if (inntektInt <= 934050) {
			prosent = 0.1152;
		}else {
			prosent = 0.1452;
		}
		
		double trinnSkatt = Math.round(inntektInt * prosent * 100) /100.00;

		
		System.out.println("Av en bruttolønn på " + inntektInt + "kr skal det betales " + trinnSkatt + "kr i skatt");
		
		
		
		
	}
}
