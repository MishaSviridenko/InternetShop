package BuilderLayer.BuildInedible.BuildConstructionEquipment;

import BuilderLayer.BuildInedible.AbstractInedible;
import beans.inedible.ConstructionEquipment;

public abstract class AbstractConstructionEquipmentBuilder extends AbstractInedible {
    ConstructionEquipment constructionEquipment;

    public void createConstructionEquipment() {
        constructionEquipment = new ConstructionEquipment();
    }

    public abstract void buildManufacturingDate();

    public abstract void buildPower();

    public abstract void buildWeight();

//    public ConstructionEquipment getConstructionEquipment() {
//        return constructionEquipment;
//    }
}
