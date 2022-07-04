package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    // Default constructor
    public MoodAnalyzer() {
    }

    // parametrised constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public static String analyzeMood(String message) {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "Exception Handled";
        }
    }
}
