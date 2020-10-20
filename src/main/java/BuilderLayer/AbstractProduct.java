package BuilderLayer;

import beans.Product;

public abstract class AbstractProduct {

    private Product product;

    public void createProduct() {
        product = new Product();
    }

    public abstract void buildProductName();

    public abstract void buildProductCount();

    public abstract void buildProductPrice();

//    Product getProduct() {
//        return product;
//    }

}
