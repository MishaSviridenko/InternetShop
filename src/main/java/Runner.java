import CommandLayer.ConcreteCRUDReciverCommands.DeleteProductCommand;
import CommandLayer.ConcreteCRUDReciverCommands.GetAllProductsCommand;
import CommandLayer.ConcreteCRUDReciverCommands.GetProductByNameCommand;
import CommandLayer.Invoker;
import CommandLayer.ProductCRUDReciver;
import FactoryLayer.CreateProductFactory;
import beans.Product;

public class Runner {
    public static void main(String[] args) {

        ProductCRUDReciver productCRUDReciver = new ProductCRUDReciver();

        Product product = productCRUDReciver.createProduct("Chees");
        productCRUDReciver.productCollection.add(product);
        product = CreateProductFactory.createProduct("Meat");
        productCRUDReciver.productCollection.add(product);

        Invoker invoker = new Invoker(
                new DeleteProductCommand(productCRUDReciver, CreateProductFactory.createProduct("Chees"))
                , new GetAllProductsCommand(productCRUDReciver)
                , new GetProductByNameCommand(productCRUDReciver, "Parmisan_Grodno"));

        invoker.getAllProducts();
        invoker.getProductByName();
        invoker.deleteProduct();
    }
}
