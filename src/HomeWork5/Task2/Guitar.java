package HomeWork5.Task2;

public class Guitar implements Instrument {
    private int strings;

    @Override
    public void play() {
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public Guitar(int strings) {
        setStrings(strings);
    }

    @Override
    public String toString() {
        return "Instrument plays: Guitar {" +
                "strings count='" + strings + '\'' +
                '}';
    }
}
