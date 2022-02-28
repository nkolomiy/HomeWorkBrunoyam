package HomeWork5.Task1;

import java.util.Objects;

public class IPhone {
    private String model;
    private double weight;
    private int simCards;
    private double width;
    private double height;
    private String material;

    public IPhone(String model, double weight, int simCards, double width, double height, String material) {
        setModel(model);
        setWeight(weight);
        setSimCards(simCards);
        setWidth(width);
        setHeight(height);
        setMaterial(material);
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            throw new IllegalArgumentException("Введите модель");
        } else {
            this.model = model;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSimCards(int simCards) {
        if (simCards > 2) {
            throw new IllegalArgumentException("В телефоне не может быть больше 2 сим-карт");
        } else {
            this.simCards = simCards;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        if (material.trim() == "металл" || material.trim() == "стекло") {
            this.material = material;
        } else {
            throw new IllegalArgumentException("Разрешены только металл либо стекло");
        }

    }

    @Override
    public String toString() {
        return "Телефон Iphone," +
                " модель='" + model + '\"' +
                ", кол-во сим-карт=" + simCards +
                ", ширина=" + width +
                ", высота=" + height +
                ", материал='" + material.trim() + '\"' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone iphone = (IPhone) o;
        return model == iphone.model && width == iphone.width && height == iphone.height && Objects.equals(material.trim(), iphone.material.trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, width, height, material);
    }
}
