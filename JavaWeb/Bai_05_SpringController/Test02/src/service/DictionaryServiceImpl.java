package service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryServiceImpl implements DictionaryService {
    private static Map<String,String> dictionary=new HashMap<>();
    static {
        dictionary.put("hello","Xin chao");
        dictionary.put("how","The nao");
        dictionary.put("car","Xe hoi");
        dictionary.put("gun","Sung");
    }
    @Override
    public String search(String word) {
        for (Map.Entry<String,String> entry:dictionary.entrySet()){
            if (entry.getKey().equals(word)){
                return entry.getValue();
            }
        }
        return "Not found";
    }
}
