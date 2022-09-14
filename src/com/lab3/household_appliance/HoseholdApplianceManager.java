package com.lab3.household_appliance;

import java.util.*;

public class HoseholdApplianceManager {
    public Map<String, List<String>> getManufacturersMap(List<HouseholdAppliance> appliances) {
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

    public Map<String, Integer> getNamesMap(List<HouseholdAppliance> appliances) {
        Map<String, Integer> names = new HashMap<String, Integer>();

        for (var appliance : appliances) {
            String applianceName = appliance.getName();
            names.put(applianceName, names.getOrDefault(applianceName, 0) + 1);
        }

        return names;
    }
}
