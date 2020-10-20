package BuilderLayer.BuildInedible.BuildHouseholdAppliance;

import BuilderLayer.BuildInedible.AbstractInedible;
import beans.inedible.HouseholdAppliance;

public abstract class AbstractHouseholdApplianceBuilder extends AbstractInedible {

    HouseholdAppliance householdAppliance;

    public void createHouseholdAppliance() {
        householdAppliance = new HouseholdAppliance();
    }

    public abstract void buildEnergyClass();

    public abstract void buildColor();

//    public HouseholdAppliance getHouseholdAppliance() {
//        return householdAppliance;
//    }
}
