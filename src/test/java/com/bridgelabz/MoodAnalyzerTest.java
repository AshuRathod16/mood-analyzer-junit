package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    // Test case to check sad mood
    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        // create object of MoodAnalyzer class
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        String message = "I am in Sad Mood";
        String actualOutput = moodanalyzer.analyzeMood(message);
        Assert.assertEquals("SAD", actualOutput);
    }
}