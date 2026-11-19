import java.util.*;
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];
            while (domain.contains(".")) {
                map.put(domain, map.getOrDefault(domain, 0) + count);
                int index = domain.indexOf('.');
                domain = domain.substring(index + 1);
            }
            map.put(domain, map.getOrDefault(domain, 0) + count);
        }
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key);
        }
        return result;
    }
}