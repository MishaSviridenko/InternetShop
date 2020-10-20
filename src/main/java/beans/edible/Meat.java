package beans.edible;

import beans.EdibleProduct;
import java.util.Objects;

public class Meat extends EdibleProduct {

    private int manufacturingDate;
    private double weight;
    private String animalKind;

    public Meat() {
    }

    public Meat(int manufacturingDate, double weight, String animalKind) {
        this.manufacturingDate = manufacturingDate;
        this.weight = weight;
        this.animalKind = animalKind;
    }

    public void setManufacturingDate(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Meat meat = (Meat) object;
        return Double.compare(meat.weight, weight) == 0 &&
                Objects.equals(manufacturingDate, meat.manufacturingDate) &&
                Objects.equals(animalKind, meat.animalKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturingDate, weight, animalKind);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "manufacturingDate=" + manufacturingDate +
                ", weight=" + weight +
                ", animalKind='" + animalKind + '\'' +
                '}';
    }
}
