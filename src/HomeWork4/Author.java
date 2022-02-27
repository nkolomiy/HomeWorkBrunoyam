package HomeWork4;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() < 3) {
            throw new IllegalArgumentException("Please enter an author name");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Please enter an author surname");
        }
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Author {" +
                "nameAuthor='" + name + '\'' +
                ", surnameAuthor='" + surname + '\'' +
                '}';
    }
}
