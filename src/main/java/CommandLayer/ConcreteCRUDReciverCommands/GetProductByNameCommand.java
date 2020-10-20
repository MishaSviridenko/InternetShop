package CommandLayer.ConcreteCRUDReciverCommands;

import CommandLayer.Command;
import CommandLayer.ProductCRUDReciver;

public class GetProductByNameCommand implements Command {

    private ProductCRUDReciver productCRUDReciver;
    private String productName;

    public GetProductByNameCommand(ProductCRUDReciver productCRUDReciver, String productName) {
        this.productCRUDReciver = productCRUDReciver;
        this.productName = productName;
    }

    @Override
    public void execute() {
        productCRUDReciver.getProductByName(productName);
    }
}
