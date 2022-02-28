package HomeWork5.Task1;

public class Test {
    public static void main(String[] args) {
        IPhone ten = new IPhone("10",100,1,50,100, "металл");
        IPhone latest = new IPhone("13",150,2,60,110, "стекло");
        System.out.println(ten.equals(latest));
        System.out.println(latest.equals(latest));
    }
}
