package com.lab3;

import java.util.*;

public class IndividualTasks {
    public static void task1(Scanner scanner, Map<String, List<String>> appliancesMap) {
        System.out.println("Enter appliance models to print limit: ");
        int n = scanner.nextInt();

        for (var entry : appliancesMap.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            System.out.print(key + " : ");
            System.out.println(Arrays.toString(value.subList(0, Math.min(n, value.size())).toArray()));
        }
    }
}
