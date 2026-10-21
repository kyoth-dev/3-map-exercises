package part01;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {

    public Map<String, String> createMap() {
        Map<String, String> uusiMappi = new HashMap<>();
        return uusiMappi;
    }

    public void addEntry(Map<String, String> map, String key, String value) {
        map.put(key, value);
    }

    public Map<String, Integer> getPopulations() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("Denmark", 5894687);
        populations.put("Finland", 5587442);
        populations.put("Iceland", 354234);
        populations.put("Norway", 5509591);
        populations.put("Sweden", 10261767);

        return populations;
    }

    public String getValue(Map<String, String> map, String key) {
        return map.get(key);
    }

    public boolean hasKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    public boolean hasValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    public void addIfNotPresent(Map<String, String> map, String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    public void removeEntry(Map<String, String> map, String key) {
        map.remove(key);
    }

    public int countEntries(Map<String, String> map) {
        return map.size();
    }

    public boolean isEmpty(Map<String, String> map) {
        return map.isEmpty();
    }

    public Integer largestValue(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null;
        }

        Integer largest = null;

        for (Integer value : map.values()) {
            if (largest == null || value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    public int sumOfValues(Map<String, Integer> map) {
        int sum = 0;

        for (Integer value : map.values()) {
            sum += value;
        }

        return sum;
    }

    public Map<String, String> combineMaps(
            Map<String, String> map1,
            Map<String, String> map2) {

        Map<String, String> combined = new HashMap<>(map2);
        combined.putAll(map1);

        return combined;
    }

    public void incrementValues(Map<String, Integer> map, int amount) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() + amount);
        }
    }
}
