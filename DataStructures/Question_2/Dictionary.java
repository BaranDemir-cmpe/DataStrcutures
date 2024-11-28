package hash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        
        Map<String, String> dictionary = new HashMap<>();

        
        FileReader fr = new FileReader("my_words.txt");
        BufferedReader br = new BufferedReader(fr);

        
        String line;
        while ((line = br.readLine()) != null) {
            
            String[] parts = line.split("\t"); 
            String key = parts[0];
            String value = parts[1];

            
            dictionary.put(key, value);
        }

        
        br.close();
    }
}