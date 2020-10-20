package beans;

import java.util.Objects;

public class EdibleProduct extends Product{

    private int expirationDate;

    public EdibleProduct() {
    }

    public EdibleProduct(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        EdibleProduct that = (EdibleProduct) object;
        return expirationDate == that.expirationDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expirationDate);
    }

    @Override
    public String toString() {
        return "EdibleProduct{" +
                "expirationDate=" + expirationDate +
                '}';
    }
}
