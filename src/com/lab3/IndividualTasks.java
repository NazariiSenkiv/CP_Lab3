package com.lab3;

import com.lab3.household_appliance.HouseholdAppliance;

import java.util.*;

public class IndividualTasks {
    public static void task1(Scanner scanner, Map<String, List<String>> appliancesMap) {
        System.out.println("Task 1");

        System.out.println("Enter appliance models to print limit: ");
        int n = scanner.nextInt();

        for (var entry : appliancesMap.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            System.out.print(key + " : ");
            System.out.println(Arrays.toString(value.subList(0, Math.min(n, value.size())).toArray()));
        }
    }

    public static void task2(Map<String, Integer> namesCountMap) {
        int allNamesCount = namesCountMap.values().stream().mapToInt(v -> v).sum();

        System.out.println("Task 2");

        for (var entry : namesCountMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value + '/' + allNamesCount);
        }
    }
}
