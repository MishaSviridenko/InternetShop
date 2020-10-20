package BuilderLayer.BuildInedible;

import BuilderLayer.AbstractProduct;
import beans.InedibleProduct;

public abstract class AbstractInedible extends AbstractProduct {
    private InedibleProduct inedibleProduct;

    public void createProduct() {
        inedibleProduct = new InedibleProduct();
    }

    public abstract void buildGuarantee();

//    InedibleProduct getInedibleProduct() {
//        return inedibleProduct;
//    }
}
