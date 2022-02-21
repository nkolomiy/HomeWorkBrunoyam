package HomeWork3;

public class Main {
    public static void main(String[] args) {
        // first Task
//        Arithmetic arifm = new Arithmetic();
//        arifm.setX(6);
//        arifm.setY(89);

        // second task
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Nikita";
        employee1.position = "Engineer";
        employee1.email = "bla@bla.ru";
        employee1.age = 30;
        employee1.phoneNumber = "89111234567";
        employee1.salary = 50000;

        employee2.name = "Oleg";
        employee2.position = "Reception";
        employee2.email = "rec@bla.ru";
        employee2.phoneNumber = "89217654321";
        employee2.salary = 20000;
        employee2.age = 50;

        employee3.name = "Ivan";
        employee3.position = "Director";
        employee3.email = "seo@bla.ru";
        employee3.phoneNumber = "89045321267";
        employee3.salary = 120000;
        employee3.age = 60;

        Employee[] emplArray = new Employee[3];
        emplArray[0] = employee1;
        emplArray[1] = employee2;
        emplArray[2] = employee3;

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age < 40) {
                emplArray[i].info();
            }
        }
    }
}
