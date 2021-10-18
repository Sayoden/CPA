package td5.exercice2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AbonnePapier implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        if (evt.getPropertyName().equals("numero")) {
            System.out.println("numéro changé " + evt.getNewValue());
        }
    }

}
