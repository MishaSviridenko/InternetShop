package BuilderLayer.BuildEdible.BuildChees;

import beans.edible.Chees;

public class CheesBuilder extends AbstractCheesBuilder {

    @Override
    public void buildProductName() {
        chees.setProductName("Parmisan_Grodno");
    }

    @Override
    public void buildProductCount() {
        chees.setProductCount(20);
    }

    @Override
    public void buildProductPrice() {
        chees.setProductPrice(12005);
    }

    @Override
    public void buildExpirationDate() {
        chees.setExpirationDate(30);
    }

    @Override
    public void buildManufacturingDate() {
        chees.setManufacturingDate(2020/10/10);
    }

    @Override
    public void buildCheesKind() {
        chees.setCheesKind("Parmisan");
    }

    public Chees getChees(){
        return chees;
    }
}
