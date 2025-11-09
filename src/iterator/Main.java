package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 7, 7), 1);
			p.addSymptom(new Symptom("s2", 100, 100), 2);
			p.addSymptom(new Symptom("s3", 1, 1), 3);
			p.addSymptom(new Symptom("s4", 10, 10), 4);
			p.addSymptom(new Symptom("s5", 9, 9), 5);
			
			Covid19PacientInvertedIteratorAdapter adapter = new Covid19PacientInvertedIteratorAdapter(p);
			// Comparator 1: name
			Iterator<Symptom> it1 = Sorting.sortedIterator(adapter, new SymptomName());
			System.out.println("Ordenado por nombre:");
			while (it1.hasNext()) {
				System.out.println(it1.next());
			}
			// Comparator 2: severity
			Iterator<Symptom> it2 = Sorting.sortedIterator(adapter, new SeverityIndex());
			System.out.println("\nOrdenado por severidad:");
			while (it2.hasNext()) {
				System.out.println(it2.next());
			}
		}
	}