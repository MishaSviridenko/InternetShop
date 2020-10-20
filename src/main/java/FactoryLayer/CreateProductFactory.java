package FactoryLayer;

import BuilderLayer.BuildEdible.BuildChees.CheesBuilder;
import BuilderLayer.BuildEdible.BuildMeat.MeatBuilder;
import BuilderLayer.BuildInedible.BuildConstructionEquipment.ConstructionEquipmentBuilder;
import BuilderLayer.BuildInedible.BuildHouseholdAppliance.HouseholdApplianceBuilder;
import BuilderLayer.ProductManager.EdibleProductManager.CheesProductManager;
import BuilderLayer.ProductManager.EdibleProductManager.MeatProductManager;
import BuilderLayer.ProductManager.InedibleProductManager.ConstructionEquipmentProductManager;
import BuilderLayer.ProductManager.InedibleProductManager.HouseholdApplianceProductManager;
import beans.Product;

import java.util.logging.Logger;

public class CreateProductFactory {

    private static final Logger LOGGER = Logger.getLogger("APP_FILE_CONSOLE");

    public static Product createProduct (String commandName){
        Product product = new Product();
        if (commandName.equals("Chees")){
            CheesProductManager cheesProductManager = new CheesProductManager();
            cheesProductManager.setCheesBuilder(new CheesBuilder());
            product = cheesProductManager.createChees();
        } else if (commandName.equals("Meat")){
            MeatProductManager meatProductManager = new MeatProductManager();
            meatProductManager.setMeatBuilder(new MeatBuilder());
            product = meatProductManager.createMeat();
        } else if (commandName.equals("ConstructionEquipment")){
            ConstructionEquipmentProductManager constructionEquipmentProductManager = new ConstructionEquipmentProductManager();
            constructionEquipmentProductManager.setConstructionEquipmentBuilder(new ConstructionEquipmentBuilder());
            product = constructionEquipmentProductManager.createConstructionEquipment();
        } else if (commandName.equals("HouseholdAppliance")){
            HouseholdApplianceProductManager householdApplianceProductManager = new HouseholdApplianceProductManager();
            householdApplianceProductManager.setHouseholdApplianceBuilder(new HouseholdApplianceBuilder());
            product = householdApplianceProductManager.createHouseholdAppliance();
        } else {
            LOGGER.info("You can not create such product!");
        }
        return product;
    }
}
