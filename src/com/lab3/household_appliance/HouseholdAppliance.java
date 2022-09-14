package com.lab3.household_appliance;

import org.json.simple.JSONObject;

public class HouseholdAppliance {
    private String name;
    private String model;
    private String manufacturer;
    private Float price;
    private Float maxPower;

    private HouseholdAppliance(){}

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Float getPrice() {
        return price;
    }

    public Float getMaxPower() {
        return maxPower;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private void setPrice(Float price) {
        this.price = price;
    }

    private void setMaxPower(Float maxPower) {
        this.maxPower = maxPower;
    }

    public static class HousingApplianceJsonObjectParser {
        private static final String TAG_NAME = "name";
        private static final String TAG_MODEL = "model";
        private static final String TAG_MANUFACTURER = "manufacturer";
        private static final String TAG_PRICE = "price";
        private static final String TAG_MAX_POWER = "max_power";

        public static HouseholdAppliance parse(JSONObject householdAppliance) {
            HouseholdAppliance parsedAppliance = new HouseholdAppliance();

            parsedAppliance.setName((String) householdAppliance.get(TAG_NAME));
            parsedAppliance.setModel((String) householdAppliance.get(TAG_MODEL));
            parsedAppliance.setManufacturer((String) householdAppliance.get(TAG_MANUFACTURER));
            parsedAppliance.setPrice((float)(double) householdAppliance.get(TAG_PRICE));
            parsedAppliance.setMaxPower((float)(double) householdAppliance.get(TAG_MAX_POWER));

            return parsedAppliance;
        }
    }
}
