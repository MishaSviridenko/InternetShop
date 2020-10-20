package beans.edible;

import beans.EdibleProduct;

import java.util.Objects;

public class Chees extends EdibleProduct {

    private int manufacturingDate;
    private String cheesKind;

    public Chees() {
    }

    public Chees(int manufacturingDate, String cheesKind) {
        this.manufacturingDate = manufacturingDate;
        this.cheesKind = cheesKind;
    }

    public int getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getCheesKind() {
        return cheesKind;
    }

    public void setCheesKind(String cheesKind) {
        this.cheesKind = cheesKind;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Chees chees = (Chees) object;
        return Objects.equals(manufacturingDate, chees.manufacturingDate) &&
                Objects.equals(cheesKind, chees.cheesKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturingDate, cheesKind);
    }

    @Override
    public String toString() {
        return "Chees{" +
                "manufacturingDate=" + manufacturingDate +
                ", cheesKind='" + cheesKind + '\'' +
                '}';
    }
}
