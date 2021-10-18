package td5.exercice2;

import lombok.Getter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public abstract class Observable {

    @Getter
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    abstract void addListener(PropertyChangeListener listener);

    abstract void removeListener(PropertyChangeListener listener);

    abstract void updateListener(PropertyChangeListener listener);
}
