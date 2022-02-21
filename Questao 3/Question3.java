import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question3  {

    static String string = "ifailuhkqq";

    public static void main(String[] args) {

        int result = Question3.getNumberAnagrams(string);
        System.out.println("A quantidade de anagramas da string " + string + " é "+ result );
    }

    //pega a quantidade de anagramas calculados
    static int getNumberAnagrams(String str) {

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char[] c = str.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);

                if (hashMap.containsKey(k)) {
                    hashMap.put(k, hashMap.get(k) + 1);
                } else {
                    hashMap.put(k, 1);
                }
            }
        }

        int anagramPairs = 0;
        for (String k : hashMap.keySet()) {
            int v = hashMap.get(k);
            anagramPairs += (v * (v - 1)) / 2;
        }

        return anagramPairs;
    }
}