package com.lab3;

import com.lab3.household_appliance.HoseholdApplianceManager;
import com.lab3.household_appliance.HouseholdAppliance;
import com.lab3.parser.HouseholdApplianceJsonFileParser;

import java.util.*;

public class Main {
    static final String filePath1 = "household_appliances1.json";
    static final String filePath2 = "household_appliances2.json";
    public static void main(String[] args) {
        var applianceParser = new HouseholdApplianceJsonFileParser(filePath1);
        List<HouseholdAppliance> appliances1 = applianceParser.parseFile();

        applianceParser.setFilePath(filePath2);
        List<HouseholdAppliance> appliances2 = applianceParser.parseFile();

        HoseholdApplianceManager applianceManager = new HoseholdApplianceManager();

        try (Scanner scanner = new Scanner(System.in)) {
            IndividualTasks.createMapAndLimitedPrint(scanner, appliances1);
            IndividualTasks.calculateAndPrintNameFrequencyCharacteristics(appliances1);
            IndividualTasks.printJoinedAndSortedAppliances(appliances1, appliances2);
            IndividualTasks.printPricesSum(appliances1);

        } catch (Exception e) {
            System.out.println("In Main class exception, " + e);
        }
    }
}
