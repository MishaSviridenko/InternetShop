package BuilderLayer.ProductManager.InedibleProductManager;

import BuilderLayer.BuildInedible.BuildHouseholdAppliance.HouseholdApplianceBuilder;
import beans.inedible.HouseholdAppliance;

public class HouseholdApplianceProductManager {
    private HouseholdApplianceBuilder householdApplianceBuilder;

    public void setHouseholdApplianceBuilder(HouseholdApplianceBuilder householdApplianceBuilder) {
        this.householdApplianceBuilder = householdApplianceBuilder;
    }

    public HouseholdAppliance createHouseholdAppliance() {
        householdApplianceBuilder.createHouseholdAppliance();
        householdApplianceBuilder.buildProductName();
        householdApplianceBuilder.buildProductCount();
        householdApplianceBuilder.buildProductPrice();
        householdApplianceBuilder.buildColor();
        householdApplianceBuilder.buildEnergyClass();
        householdApplianceBuilder.buildGuarantee();
        HouseholdAppliance householdAppliance =
                householdApplianceBuilder.getHouseholdAppliance();
        return householdAppliance;
    }
}
