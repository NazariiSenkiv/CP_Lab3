package com.lab3.parser;

import com.lab3.household_appliance.HouseholdAppliance;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HouseholdApplianceJsonFileParser {
    private String filePath;

    public HouseholdApplianceJsonFileParser(String filePath) {
        this.filePath = filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<HouseholdAppliance> parseFile() {
        // used ArrayList, because we read objects from file once.
        // Not supposed to add or remove objects from list.
        List<HouseholdAppliance> appliances = new ArrayList<>();

        var parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {

            JSONArray appliancesJson = (JSONArray) parser.parse(reader);

            for(Object appliance : appliancesJson) {
                JSONObject applianceJsonObject = (JSONObject) appliance;

                appliances.add(HouseholdAppliance.HousingApplianceJsonObjectParser.parse(applianceJsonObject));
            }
        } catch (Exception e) {
            System.out.println("File parse error in class HouseholdApplianceJsonParser, " + e);
        }

        return appliances;
    }
}
