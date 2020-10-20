package CommandLayer.ConcreteCRUDReciverCommands;

import CommandLayer.Command;
import CommandLayer.ProductCRUDReciver;

public class GetAllProductsCommand implements Command {

    private ProductCRUDReciver productCRUDReciver;

    public GetAllProductsCommand(ProductCRUDReciver productCRUDReciver) {
        this.productCRUDReciver = productCRUDReciver;
    }

    @Override
    public void execute() {
        productCRUDReciver.getAllProducts();
    }

}
