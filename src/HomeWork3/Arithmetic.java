package HomeWork3;

public class Arithmetic {
    int X;
    int Y;

    public void setX(int x) {
        if (x <= 0) {
            throw new RuntimeException("Введите значение X больше нуля");
        } else {
            X = x;
            System.out.println("Вы ввели X=" + x);
        }
    }

    public void setY(int y) {
        if (y <= 0) {
            throw new RuntimeException("Введите значение Y больше нуля");
        } else {
            Y = y;
            System.out.println("Вы ввели Y=" + y);
        }
    }
}
