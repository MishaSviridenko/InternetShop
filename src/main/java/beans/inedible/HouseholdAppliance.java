package beans.inedible;

import beans.InedibleProduct;

import java.util.Objects;

public class HouseholdAppliance extends InedibleProduct {

    private int energyClass;
    private String color;

    public HouseholdAppliance() {
    }

    public HouseholdAppliance(int energyClass, String color) {
        super();
        this.energyClass = energyClass;
        this.color = color;
    }

    public int getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(int energyClass) {
        this.energyClass = energyClass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HouseholdAppliance that = (HouseholdAppliance) object;
        return energyClass == that.energyClass &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyClass, color);
    }

    @Override
    public String toString() {
        return "HouseholdAppliance{" +
                "energyClass=" + energyClass +
                ", color='" + color + '\'' +
                '}';
    }
}
