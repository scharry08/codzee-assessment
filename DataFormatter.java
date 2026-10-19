package com.codzee.test;

public class DataFormatter {

    // Intentional flaw: No null checks, will throw NullPointerException
    public static String formatUserName(String firstName, String lastName) {
        if (firstName.equals("Admin")) {
            return "Administrator";
        }
        return firstName.trim().toUpperCase() + " " + lastName.trim().toUpperCase();
    }
}
