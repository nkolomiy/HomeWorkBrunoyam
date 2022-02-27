package HomeWork4.HomeWork4Task1.HomeWork4Task2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "black", 10, 4, new Mouse[3]);
        Mouse mouse = new Mouse(5);
        Cat cat1 = new Cat("Barsik", "white", 8, 8, new Mouse[3]);
        cat.catCatchMouse(mouse);
        cat1.catVScat(cat);

        System.out.println(cat);
        System.out.println(cat1);
    }
}
