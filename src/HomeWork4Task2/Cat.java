package HomeWork4Task2;

import java.util.Arrays;

public class Cat {
    private String name;
    private String color;
    private int speed;
    private double weight;
    private Mouse[] mice;

    public Cat(String name, String color, int speed, double weight, Mouse[] mice) {
        setName(name);
        setColor(color);
        setSpeed(speed);
        setWeight(weight);
        setMice(mice);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() <= 1) {
            throw new IllegalArgumentException("There is no such name for cat!");
        } else {
            this.name = name;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.length() <= 3) {
            throw new IllegalArgumentException("There is no such color!");
        } else {
            this.color = color;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 1) {
            throw new IllegalArgumentException("Speed for cat can not be less than 1");
        } else {
            this.speed = speed;
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can not be so small");
        } else {
            this.weight = weight;
        }
    }

    public Mouse[] getMice() {
        return mice;
    }

    public void setMice(Mouse[] mice) {
        this.mice = mice;
    }

    public void catCatchMouse(Mouse mouse) {
        if (getSpeed() > mouse.getSpeed()) {
            for (int i = 0; i < mice.length; i++) {
                if (mice[i] == null) {
                    mice[i] = mouse;
                    return;
                }
            }
        } else {
            System.out.println("Mouse is faster than cat");
        }
    }

    public void catVScat(Cat cat) {
        if (getWeight() > cat.weight) {
            Mouse[] mice = cat.getMice();
            for (int i = 0; i < mice.length; i++) {
                if (mice[i] != null) {
                    catCatchMouse(mice[i]);
                    cat.mice[i] = null;
                }
            }
        } else {
            System.out.println("Mouse is faster than a cat");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", mice=" + Arrays.toString(mice) +
                '}';
    }
}
