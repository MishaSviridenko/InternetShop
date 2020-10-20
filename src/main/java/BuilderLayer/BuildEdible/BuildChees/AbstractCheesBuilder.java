package BuilderLayer.BuildEdible.BuildChees;

import BuilderLayer.BuildEdible.AbstractEdible;
import beans.edible.Chees;

public abstract class AbstractCheesBuilder extends AbstractEdible {

    Chees chees;
    public void createChees(){
        chees = new Chees();
    }
    public abstract void buildManufacturingDate();

    public abstract void buildCheesKind();

//    Chees getChees(){
//        return chees;
//    }
}
