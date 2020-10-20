package BuilderLayer.ProductManager.InedibleProductManager;

import BuilderLayer.BuildInedible.BuildConstructionEquipment.ConstructionEquipmentBuilder;
import beans.inedible.ConstructionEquipment;

public class ConstructionEquipmentProductManager {

    private ConstructionEquipmentBuilder constructionEquipmentBuilder;

    public void setConstructionEquipmentBuilder(ConstructionEquipmentBuilder constructionEquipmentBuilder) {
        this.constructionEquipmentBuilder = constructionEquipmentBuilder;
    }

    public ConstructionEquipment createConstructionEquipment() {
        constructionEquipmentBuilder.createConstructionEquipment();
        constructionEquipmentBuilder.buildProductName();
        constructionEquipmentBuilder.buildProductCount();
        constructionEquipmentBuilder.buildProductPrice();
        constructionEquipmentBuilder.buildManufacturingDate();
        constructionEquipmentBuilder.buildPower();
        constructionEquipmentBuilder.buildWeight();
        constructionEquipmentBuilder.buildGuarantee();
        ConstructionEquipment constructionEquipment =
                constructionEquipmentBuilder.getConstructionEquipment();
        return constructionEquipment;
    }
}
