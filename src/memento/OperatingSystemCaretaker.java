package memento;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {
    private List<OperatingSystemMemento> mementos = new ArrayList<>();

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Zapisano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        this.mementos.add(operatingSystemMemento);
    }

    public OperatingSystemMemento getMemento(int index) {
        System.out.println("Wczytano backup nr: " + mementos.get(index - 1).getBackupNumber() + " z datą: " + mementos.get(index - 1).getBackupDate());
        return mementos.get(index - 1);
    }

}
