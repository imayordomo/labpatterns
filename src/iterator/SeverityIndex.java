package iterator;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndex implements Comparator {

	public int compare(Object  s1, Object s2) {
    	int sn1 = ((Symptom) s1).getSeverityIndex(); 
    	int sn2 = ((Symptom) s2).getSeverityIndex();
        return Integer.compare(sn1, sn2);
    }
 
}
