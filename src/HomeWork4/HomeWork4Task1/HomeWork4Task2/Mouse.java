package HomeWork4.HomeWork4Task1.HomeWork4Task2;

public class Mouse {
    private int speed;

    public Mouse(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 1) {
            throw new IllegalArgumentException("Speed for a mouse can not be less than 1");
        } else {
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
