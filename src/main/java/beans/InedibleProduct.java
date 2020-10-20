package beans;

import java.util.Objects;

public class InedibleProduct extends Product {

    private int guarantee;

    public InedibleProduct() {
    }

    public InedibleProduct(int guarantee) {
        super();
        this.guarantee = guarantee;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InedibleProduct that = (InedibleProduct) object;
        return guarantee == that.guarantee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(guarantee);
    }

    @Override
    public String toString() {
        return "InedibleProduct{" +
                "guarantee=" + guarantee +
                '}';
    }
}
