package BuilderLayer.BuildEdible.BuildMeat;

import beans.edible.Meat;

public class MeatBuilder extends AbstractMeatBuilder {

    @Override
    public void buildProductName() {
        meat.setProductName("Beef");
    }

    @Override
    public void buildProductCount() {
        meat.setProductCount(10);
    }

    @Override
    public void buildProductPrice() {
        meat.setProductPrice(11321);
    }

    @Override
    public void buildExpirationDate() {
        meat.setProductPrice(20);
    }

    @Override
    public void buildManufacturingDate(){
        meat.setManufacturingDate(2020/11/20);
    }

    @Override
    public void buildWeight(){
        meat.setWeight(1.100);
    }

    @Override
    public void buildAnimalKind(){
        meat.setAnimalKind("Cow");
    }

    public Meat getMeat(){
        return meat;
    }
}
