package com.company;

import java.util.HashMap;
import java.util.Map;

public class Config {
    private static Config instance = null;
    private final Map<String, String> options;

    public Config() {
        options = new HashMap<>();
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public void setOptions(String key, String value) {
        options.put(key, value);
    }

    public String getOptions(String key) {
        return options.get(key);
    }
}
