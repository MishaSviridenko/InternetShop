package BuilderLayer.ProductManager.EdibleProductManager;

import BuilderLayer.BuildEdible.BuildChees.CheesBuilder;
import beans.edible.Chees;

public class CheesProductManager {
    private CheesBuilder cheesBuilder;

    public void setCheesBuilder(CheesBuilder cheesBuilder){
        this.cheesBuilder = cheesBuilder;
    }

    public Chees createChees(){
        cheesBuilder.createChees();
        cheesBuilder.buildProductName();
        cheesBuilder.buildProductCount();
        cheesBuilder.buildProductPrice();
        cheesBuilder.buildExpirationDate();
        cheesBuilder.buildManufacturingDate();
        cheesBuilder.buildCheesKind();
        Chees chees = cheesBuilder.getChees();
        return chees;
    }
}
