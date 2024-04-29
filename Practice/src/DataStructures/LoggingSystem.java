package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggingSystem {
    private Map<String, List<String>> userActivities;
    private List<String> systemEvents;

    public LoggingSystem() {
        userActivities = new HashMap<>();
        systemEvents = new ArrayList<>();
    }

    public void logUserActivity(String userId, String activity) {
        userActivities.computeIfAbsent(userId, k -> new ArrayList<>()).add(activity);
    }

    public void logSystemEvent(String eventDescription) {
        systemEvents.add(eventDescription);
    }

    public List<String> getUserActivities(String userId) {
        return userActivities.getOrDefault(userId, new ArrayList<>());
    }

    public List<String> getSystemEvents() {
        return new ArrayList<>(systemEvents);
    }

    public static void main(String[] args) {
        LoggingSystem loggingSystem = new LoggingSystem();

        // Log user activities
        loggingSystem.logUserActivity("User123", "Viewed product X");
        loggingSystem.logUserActivity("User123", "Purchased product X");

        // Log system events
        loggingSystem.logSystemEvent("Server maintenance scheduled");
        loggingSystem.logSystemEvent("New version released");

        // Retrieve and print logged data
        System.out.println("User123 Activities: " + loggingSystem.getUserActivities("User123"));
        System.out.println("System Events: " + loggingSystem.getSystemEvents());
    }
}