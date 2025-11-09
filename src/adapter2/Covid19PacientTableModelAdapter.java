package adapter2;

import javax.swing.table.AbstractTableModel;
import java.util.*;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    protected Covid19Pacient pacient;
    protected String[] columnNames = {"Symptom", "Weight"};
    protected List<Symptom> symptomList;

    public Covid19PacientTableModelAdapter(Covid19Pacient p) {
        this.pacient = p;
        // Guardamos los síntomas en una lista para acceder por fila
        this.symptomList = new ArrayList<>(p.getSymptoms());
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; // 2 columnas: Symptom y Weight
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        return symptomList.size(); // una fila por síntoma
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        Symptom s = symptomList.get(row);
        switch (col) {
            case 0: // columna 1: nombre del síntoma
                return s.getName();
            case 1: // columna 2: peso del síntoma
                return pacient.getWeight(s);
            default:
                return null;
        }
    }
}
