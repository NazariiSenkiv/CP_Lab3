package com.lab3.household_appliance;

import java.util.*;

public class HoseholdApplianceManager {
    public Map<String, List<String>> getMap(List<HouseholdAppliance> appliances) {
        Map<String, List<String>> resultMap = new HashMap<>();

        for (var appliance : appliances) {
            String applianceManufacturer = appliance.getManufacturer();
            String applianceModel = appliance.getModel();

            if (resultMap.containsKey(applianceManufacturer)) {
                resultMap.get(applianceManufacturer).add(applianceModel);
            } else {
                var modelsList = new ArrayList<String>();
                modelsList.add(applianceModel);

                resultMap.put(applianceManufacturer, modelsList);
            }
        }

        return resultMap;
    }
}
