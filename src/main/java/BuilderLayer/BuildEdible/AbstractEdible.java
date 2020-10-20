package BuilderLayer.BuildEdible;

import BuilderLayer.AbstractProduct;
import beans.EdibleProduct;

public abstract class AbstractEdible extends AbstractProduct {
    EdibleProduct edibleProduct;
    public void createProduct(){
        edibleProduct = new EdibleProduct();
    }

    public abstract void buildExpirationDate();

//    EdibleProduct getEdibleProduct(){
//        return edibleProduct;
//    }
}
