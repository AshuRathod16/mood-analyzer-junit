package com.bridgelabz;

public class MoodAnalyzer {
    public static String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        return null;
    }

    public static void main(String[] args) {
        String mood = MoodAnalyzer.analyzeMood("User is Happy");
        System.out.println(mood);
        mood = MoodAnalyzer.analyzeMood("User is Sad");
        System.out.println(mood);
    }
}
