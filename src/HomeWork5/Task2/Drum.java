package HomeWork5.Task2;

public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Drum(int size) {
        setSize(size);
    }

    @Override
    public String toString() {
        return "Instrument plays: Drum {" +
                "size of the drum='" + size + '\'' +
                '}';
    }
}
