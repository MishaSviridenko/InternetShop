package BuilderLayer.ProductManager.EdibleProductManager;

import BuilderLayer.BuildEdible.BuildMeat.MeatBuilder;
import beans.edible.Meat;

public class MeatProductManager {

    private MeatBuilder meatBuilder;

    public void setMeatBuilder(MeatBuilder meatBuilder) {
        this.meatBuilder = meatBuilder;
    }

    public Meat createMeat() {
        meatBuilder.createMeat();
        meatBuilder.buildProductName();
        meatBuilder.buildProductCount();
        meatBuilder.buildProductPrice();
        meatBuilder.buildExpirationDate();
        meatBuilder.buildManufacturingDate();
        meatBuilder.buildWeight();
        meatBuilder.buildAnimalKind();
        Meat meat = meatBuilder.getMeat();
        return meat;
    }
}
