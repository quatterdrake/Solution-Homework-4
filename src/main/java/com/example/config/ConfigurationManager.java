package com.example.config;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> settings;

    private ConfigurationManager() {
        settings = new HashMap<>();
        settings.put("maxPlayers", "100");
        settings.put("defaultLanguage", "en");
        settings.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getConfig(String key) {
        return settings.getOrDefault(key, "Key not found");
    }

    public void printAllConfigs() {
        settings.forEach((key, value) -> System.out.println(key + " → " + value));
    }
}
