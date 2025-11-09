package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {

	private List<Symptom> symptomsList;
    private int currentIndex;

    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient pacient) {
    	Set<Symptom> symptoms = pacient.getSymptoms();
        this.symptomsList = new ArrayList<>(symptoms);
    }

    @Override
    public void goLast() {
        currentIndex = symptomsList.size() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex >= 0;
    }

    @Override
    public Object previous() {
        return symptomsList.get(currentIndex--);
    }
}
