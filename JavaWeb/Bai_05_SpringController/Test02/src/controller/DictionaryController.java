package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;
    @GetMapping("/search")
    public String ketqua(Model model, @RequestParam String word){
        String kq=dictionaryService.search(word);
        model.addAttribute("result",kq);
        return "result";
    }
}
