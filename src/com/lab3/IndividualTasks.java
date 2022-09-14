package com.lab3;

import com.lab3.household_appliance.HoseholdApplianceManager;
import com.lab3.household_appliance.HouseholdAppliance;

import java.util.*;

public class IndividualTasks {
    public static void createMapAndLimitedPrint(Scanner scanner, List<HouseholdAppliance> appliances) {

        var applianceManager = new HoseholdApplianceManager();
        var manufacturersMap = applianceManager.getManufacturersMap(appliances);

        System.out.println("Task 1");

        System.out.println("Enter appliance models to print limit: ");
        int n = scanner.nextInt();

        for (var entry : manufacturersMap.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            System.out.print(key + " : ");
            System.out.println(Arrays.toString(value.subList(0, Math.min(n, value.size())).toArray()));
        }
    }

    public static void calculateAndPrintNameFrequencyCharacteristics(List<HouseholdAppliance> appliances) {
        var applianceManager = new HoseholdApplianceManager();
        var namesCountMap = applianceManager.getNamesMap(appliances);

        int allNamesCount = namesCountMap.values().stream().mapToInt(v -> v).sum();
        System.out.println("Task 2");

        for (var entry : namesCountMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value + '/' + allNamesCount);
        }
    }

    public  static void printJoinedAndSortedAppliances(List<HouseholdAppliance> appliances1,
                                                       List<HouseholdAppliance> appliances2) {
        var applianceManager = new HoseholdApplianceManager();
        List<HouseholdAppliance> joinedAndSorted =
                Collections.unmodifiableList(applianceManager.joinAndSortByPriceDescending(appliances1, appliances2));

        System.out.println("Task 3");
        System.out.println("First list: " + Arrays.toString(appliances1.toArray()));
        System.out.println("Second list: " + Arrays.toString(appliances2.toArray()));

        System.out.println("Joined and sorted by price descending list: "
                + Arrays.toString(joinedAndSorted.toArray()));
    }

    public static void printPricesSum(List<HouseholdAppliance> appliances1) {
        float priceSum = 0.0f;

        for (var appliance : appliances1) {
            priceSum += appliance.getPrice();
        }

        System.out.println("Task 4");
        System.out.println("All appliances price sum = " + priceSum);
    }
}
