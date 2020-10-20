package BuilderLayer.BuildEdible.BuildMeat;

import BuilderLayer.BuildEdible.AbstractEdible;
import beans.edible.Meat;

public abstract class AbstractMeatBuilder extends AbstractEdible {
    Meat meat;
    public void createMeat(){
        meat = new Meat();
    }
    public abstract void buildManufacturingDate();

    public abstract void buildWeight();

    public abstract void buildAnimalKind();

//    Meat getMeat(){
//        return meat;
//    }
}
