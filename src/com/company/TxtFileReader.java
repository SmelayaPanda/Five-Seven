package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtFileReader {
    public static Map readFile(String fileName, Map<String, Integer> map) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            int s;
            while (((s = in.read()) != -1)) {
                if (Character.isLetterOrDigit(s)) {
                    sb.append((char) s);
                } else {
                    String slovo = String.valueOf(sb).toLowerCase();
                    sb.delete(0, sb.length());

                    if (map.get(slovo) == null && !slovo.equals("") && slovo.length() != 1) {
                        map.put(slovo, 1);

                    } else if (map.get(slovo) != null) {
                        int newKey = map.get(slovo) + 1;
                        map.remove(slovo);
                        map.put(slovo, newKey);
                    }
                }
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String fileName = "C:\\Users\\Smela\\IdeaProjects\\Five-Seven\\src\\com\\company\\number.txt";
        TxtFileReader.readFile(fileName, map);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
