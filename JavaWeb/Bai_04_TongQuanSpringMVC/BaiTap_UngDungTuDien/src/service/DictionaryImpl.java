package service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryImpl implements DictionaryService {
    private static Map<String, String> dictionary=new HashMap<>();
    static {
        dictionary.put("hello","Xin Chào");
        dictionary.put("goodbye","Tạm Biệt");
        dictionary.put("food","Thực Phẩm");
        dictionary.put("water","Nước");
        dictionary.put("massage","Mưa Hồng");
    }

    @Override
    public String Search(String word) {
        for (Map.Entry<String,String> entry:dictionary.entrySet())
            if (entry.getKey().equals(word)){
                return  entry.getValue();
            }else {
                return "Not Found";
            }
        return null;
    }
}
