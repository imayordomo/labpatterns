package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			Observable	pacient=new	Covid19Pacient("ane",	40);
			Observable	pacient2=new	Covid19Pacient("mikel",	20);
			Observable	pacient3=new	Covid19Pacient("aitor",	35);
			new	PacientObserverGUI	(pacient);
			new	PacientSymptomGUI	((Covid19Pacient) pacient);
			new	PacientThermometerGUI	((Covid19Pacient) pacient);
			new	SemaphorGUI	((Covid19Pacient) pacient);
			
			new	PacientObserverGUI	(pacient2);
			new	PacientSymptomGUI	((Covid19Pacient) pacient2);
			new	PacientThermometerGUI	((Covid19Pacient) pacient2);
			new	SemaphorGUI	((Covid19Pacient) pacient2);
			
			new	PacientObserverGUI	(pacient3);
			new	PacientSymptomGUI	((Covid19Pacient) pacient3);
			new	PacientThermometerGUI	((Covid19Pacient) pacient3);
			new	SemaphorGUI	((Covid19Pacient) pacient3);
	}
}


