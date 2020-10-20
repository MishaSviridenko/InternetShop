package CommandLayer;

import CommandLayer.ConcreteCRUDReciverCommands.DeleteProductCommand;
import FactoryLayer.CreateProductFactory;

public class Invoker {

    private Command delete;
    private Command getAll;
    private Command getByName;

    public Invoker(Command delete, Command getAll, Command getByName) {
        this.delete = delete;
        this.getAll = getAll;
        this.getByName = getByName;
    }

    public void deleteProduct(){
        this.delete.execute();
    }

    public void getAllProducts(){
        this.getAll.execute();
    }

    public void getProductByName(){
        this.getByName.execute();
    }
}
