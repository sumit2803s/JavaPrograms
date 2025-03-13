package HashMap;

import java.util.*;

public class StringMapping {
        public static void main(String[] args) {

            List<String> inputList = Arrays.asList("apple", "apricot", "ban", "bat", "ball", "ba", "appetizer");


            Map<String, List<String>> groupedStrings = new HashMap<>();


            for (String str : inputList) {
                String key;

                 if (str.length() >= 3) {
                    key = str.substring(0, 3);
                } else {

                    key = getMatchingKey(groupedStrings, str);
                }


                if (!groupedStrings.containsKey(key)) {
                    groupedStrings.put(key, new ArrayList<>());
                }
                groupedStrings.get(key).add(str);
            }


            System.out.println(groupedStrings);
        }


        private static String getMatchingKey(Map<String, List<String>> groupedStrings, String str) {
            for (String key : groupedStrings.keySet()) {

                if (key.startsWith(str)) {
                    return key;
                }
            }
            return str;
        }
    }

