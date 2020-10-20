package CommandLayer.ConcreteCRUDReciverCommands;

import CommandLayer.Command;
import CommandLayer.ProductCRUDReciver;

public class CreateProductCommand implements Command {

    private ProductCRUDReciver productCRUDReciver;
    private String product;

    public CreateProductCommand(ProductCRUDReciver productCRUDReciver) {
        this.productCRUDReciver = productCRUDReciver;
    }

    @Override
    public void execute() {
        productCRUDReciver.createProduct(product);
    }
}
