package HomeWork5.Task2;

public class Trumpet implements Instrument {
    private int diametr;

    @Override
    public void play() {
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public Trumpet(int diametr) {
        setDiametr(diametr);
    }

    @Override
    public String toString() {
        return "Instrument plays: Trumpet {" +
                "diameter of the trumpet='" + diametr + '\'' +
                '}';
    }
}
