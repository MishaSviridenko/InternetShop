package CommandLayer.ConcreteCRUDReciverCommands;

import CommandLayer.Command;
import CommandLayer.ProductCRUDReciver;
import beans.Product;

public class DeleteProductCommand implements Command {

    private ProductCRUDReciver productCRUDReciver;
    private Product product;

    public DeleteProductCommand(ProductCRUDReciver productCRUDReciver, Product product) {
        this.productCRUDReciver = productCRUDReciver;
        this.product = product;
    }

    @Override
    public void execute() {
        productCRUDReciver.deleteProduct(product);
    }
}
