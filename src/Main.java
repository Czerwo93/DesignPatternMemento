import memento.OperatingSystem;
import memento.OperatingSystemCaretaker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(1000);
        operatingSystem.createBackup();
        Thread.sleep(1000);
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(1000);
        operatingSystem.createBackup();
        Thread.sleep(1000);
        operatingSystem.load(operatingSystemCaretaker.getMemento(1));
    }
}
