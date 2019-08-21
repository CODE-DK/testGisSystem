package three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("[^a-zA-Zа-яА-Я\\d\\s]", "");
            String[] words = line.split("\\s");
            for (String word : words) {
                if (result.containsKey(word)) {
                    Integer count = result.get(word);
                    count += 1;
                    result.put(word, count);
                } else {
                    result.put(word, 1);
                }
            }
        }
        reader.close();
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
