package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;

@Controller
public class SimpleDictionary {
    @Autowired
    DictionaryService dictionaryService;
    @GetMapping("/result")
    public ModelAndView dictionary(@RequestParam String timkiem, Model model) {
        ModelAndView modelAndView=new ModelAndView("result");
        modelAndView.addObject("ketqua",dictionaryService.Search(timkiem));
        return modelAndView;
    }
}
