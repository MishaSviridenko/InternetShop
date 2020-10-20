package beans.inedible;


import beans.InedibleProduct;

import java.util.Objects;

public class ConstructionEquipment extends InedibleProduct {

    private int power;
    private double weight;

    public ConstructionEquipment() {
    }

    public ConstructionEquipment(int power, double weight) {
        super();
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ConstructionEquipment that = (ConstructionEquipment) object;
        return power == that.power &&
                Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, weight);
    }

    @Override
    public String toString() {
        return "ConstructionEquipment{" +
                "power=" + power +
                ", weight=" + weight +
                '}';
    }
}
