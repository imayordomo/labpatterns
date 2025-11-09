package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		Covid19Pacient pacient2 = new Covid19Pacient("Jon", 40);
		pacient2.addSymptomByName("tos seca", 3);
		pacient2.addSymptomByName("fiebre", 2);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		
		ShowPacientTableGUI gui2 = new ShowPacientTableGUI(pacient2);
		gui2.pack();
		gui2.setLocation(400, 100); // posición diferente
		gui2.setVisible(true);
		
		gui.setPreferredSize(
			      new java.awt.Dimension(400, 200));
		gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        gui.pack();             
        gui.setLocationRelativeTo(null);
		gui.setVisible(true);


	}

}
