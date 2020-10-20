package CommandLayer;

import FactoryLayer.CreateProductFactory;
import beans.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ProductCRUDReciver {

    public ProductCRUDReciver() {
    }

    private static final Logger LOGGER = Logger.getLogger("APP_FILE_CONSOLE");
    public Set<Product> productCollection = new HashSet<>();

    public Product createProduct(String product) {
        return CreateProductFactory.createProduct(product);
    }

    public void getProductByName(String productName) {
        Product product = new Product();
        product.setProductName(productName);
        if (productCollection.isEmpty()) {
            LOGGER.info("The collection is empty!");
        }
        Product equalsProduct = new Product();
        for (Product prod : productCollection){
            if (prod.getProductName().equals(productName)){
                equalsProduct = product;
            }
        }
        System.out.println(equalsProduct);
    }

    public void getAllProducts() {
        if (productCollection.isEmpty()) {
            LOGGER.info("There is no products in collection");
        }
        for (Product product : productCollection) {
            System.out.println(product);
        }
    }

    public void updateProduct(Product updateProduct){
        if (!productCollection.isEmpty()){
            for (Product prod : productCollection){
                if (prod.getProductName().equals(updateProduct.getProductName())){
                    prod = updateProduct;
                } else {
                    LOGGER.info("There is no product to update!");
                }
            }
        }
    }

    public void deleteProduct(Product product) {
        if (product == null || !productCollection.contains(product)){
            LOGGER.info("The collection is not containing such product or you entered wrong parameters!");
        }
        productCollection.remove(product);
    }
}