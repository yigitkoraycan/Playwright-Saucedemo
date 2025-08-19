package utils;

import java.util.HashMap;
import java.util.Map;

public class GlobalVariables {
    private static GlobalVariables instance;
    private Map<String, String> globalStringMap = new HashMap<>();

    private GlobalVariables() {} // private constructor

    public static GlobalVariables getInstance() {
        if (instance == null) {
            instance = new GlobalVariables();
        }
        return instance;
    }

    public void addString(String key, String value) {
        globalStringMap.put(key, value);
    }

    public String getString(String key) {
        return globalStringMap.get(key);
    }
}
