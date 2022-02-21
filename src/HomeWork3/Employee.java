package HomeWork3;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int age;
    double salary;

    public void info() {
        System.out.println("ФИО: " + name + " Должность: " + position + " Возраст: " + age + " Почта: " + email + " Телефон: " + phoneNumber + " Зарплата: " + salary);
    }
}
